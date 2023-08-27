package com.company.spring事务管理7.spring声明式事务管理30;
import java.util.List;
import javax.sql.DataSource;

import com.company.spring事务管理7.spring编程式事务管理29.StudentDAO;
import com.company.spring事务管理7.spring编程式事务管理29.StudentMarks;
import com.company.spring事务管理7.spring编程式事务管理29.StudentMarksMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate implements StudentDAO {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    @Override
    public void setDataSource(DataSource ds) {
           this.dataSource=ds;
           this.jdbcTemplate=new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        try {
            String SQL1="insert into Student (name,age) values(?,?)";
            jdbcTemplate.update(SQL1,name,age);
            //Get the latest student id to be used in Marks table
            String SQL2="select max(id) from Student";
            int sid=jdbcTemplate.queryForObject(SQL2,null,Integer.class);
            String SQL3="insert into Marks(sid,marks,year)"+
                    "values(?,?,?)";
            jdbcTemplate.update(SQL3,sid,marks,year);
            System.out.println("Create Name="+name+",Age="+age);
            //to simulate the exception
            throw new RuntimeException("simulate Error condition");
        }catch (DataAccessException e){
            System.out.println("Error in creating record,rolling back");
            throw e;
        }
    }

    @Override
    public List<StudentMarks> listStudents() {
       String SQL= "select * from Student,Marks where Student.id=Marks.sid";
       List<StudentMarks>studentMarks=jdbcTemplate.query(SQL,
               new StudentMarksMapper());
       return studentMarks;
    }
}
