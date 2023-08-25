
Spring JDBC 示例
Spring JDBC 示例

想要理解带有 jdbc 模板类的 Spring JDBC 框架的相关概念，让我们编写一个简单的示例，来实现下述 Student 表的所有 CRUD 操作。

CREATE TABLE Student(
ID   INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
AGE  INT NOT NULL,
PRIMARY KEY (ID)
);

在继续之前，让我们适当地使用 Eclipse IDE 并按照如下所示的步骤创建一个 Spring 应用程序：
步骤 	描述
1 	创建一个名为 SpringExample 的项目，并在创建的项目中的 src 文件夹下创建包 com.tutorialspoint。
2 	使用 Add External JARs 选项添加必需的 Spring 库，解释见 Spring Hello World Example 章节。
3 	在项目中添加 Spring JDBC 指定的最新的库 mysql-connector-java.jar，org.springframework.jdbc.jar 和 org.springframework.transaction.jar。如果这些库不存在，你可以下载它们。
4 	创建 DAO 接口 StudentDAO 并列出所有必需的方法。尽管这一步不是必需的而且你可以直接编写 StudentJDBCTemplate 类，但是作为一个好的实践，我们最好还是做这一步。
5 	在 com.tutorialspoint 包下创建其他的必需的 Java 类 Student，StudentMapper，StudentJDBCTemplate 和 MainApp 。
6 	确保你已经在 TEST 数据库中创建了 Student 表。并确保你的 MySQL 服务器运行正常，且你可以使用给出的用户名和密码读/写访问数据库。
7 	在 src 文件夹下创建 Beans 配置文件 Beans.xml。
8 	最后一步是创建所有的 Java 文件和 Bean 配置文件的内容并按照如下所示的方法运行应用程序。