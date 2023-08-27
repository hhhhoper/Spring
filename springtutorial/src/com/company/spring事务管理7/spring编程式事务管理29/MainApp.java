package com.company.spring事务管理7.spring编程式事务管理29;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
               new ClassPathXmlApplicationContext("Beans29.xml");
        StudentJDBCTemplate studentJDBCTemplate=
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("-----Records creation ------");
        studentJDBCTemplate.create("lqy1",11,99,2010);
        studentJDBCTemplate.create("lqy2",24,92,2010);
        studentJDBCTemplate.create("lqy3",51,94,2011);
        System.out.println("----Listing all the records----");
        List<StudentMarks>studentMarks=studentJDBCTemplate.listStudents();
        for(StudentMarks record:studentMarks){
            System.out.println("ID:"+record.getId());
            System.out.println("Name:"+record.getName());
            System.out.println("Marks:"+record.getMarks());
            System.out.println("Year:"+record.getYear());
            System.out.println("Age:"+record.getAge());
        }

    }
}
