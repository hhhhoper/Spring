package com.company.spring事务管理7.spring声明式事务管理30;

import com.company.spring事务管理7.spring编程式事务管理29.StudentMarks;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie.connection
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables
     */
    public void create(String name,Integer age,Integer marks,Integer year);
    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables
     */
    public List<StudentMarks> listStudents();
}
