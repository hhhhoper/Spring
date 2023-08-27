package com.company.spring事务管理7.spring声明式事务管理30;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class StudentMarksMapper implements RowMapper
{
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.setId(resultSet.getInt("id"));
        studentMarks.setName(resultSet.getString("name"));
        studentMarks.setAge(resultSet.getInt("age"));
        studentMarks.setSid(resultSet.getInt("sid"));
        studentMarks.setMarks(resultSet.getInt("marks"));
        studentMarks.setYear(resultSet.getInt("year"));
        return studentMarks;
    }
}
