package com.company.spring事务管理7.spring编程式事务管理29;
import java.util.List;
import javax.sql.DataSource;
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resource ie.connection
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables;
     */
    public void create(String name,Integer age,Integer marks,Integer year);
    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tabls.
     */
    public List<StudentMarks>listStudents();
}
