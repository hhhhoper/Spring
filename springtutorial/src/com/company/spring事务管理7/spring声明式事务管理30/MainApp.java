package com.company.spring事务管理7.spring声明式事务管理30;
import java.util.List;
import com.company.spring事务管理7.spring声明式事务管理30.StudentDAO;
import com.company.spring事务管理7.spring声明式事务管理30.StudentJDBCTemplate;
import com.company.spring事务管理7.spring编程式事务管理29.StudentMarks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("Beans30.xml");
        StudentJDBCTemplate studentJDBCTemplate=
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("------Records creation-----");
        studentJDBCTemplate.create("lqy4",11,99,2010);
        studentJDBCTemplate.create("lqy5",12,90,2011);
        studentJDBCTemplate.create("lqy6",13,100,2012);
        System.out.println("-----Listing all the records-----");
        List<com.company.spring事务管理7.spring编程式事务管理29.StudentMarks> studentMarks=studentJDBCTemplate.listStudents();
        for(StudentMarks record:studentMarks){
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}
