
Spring 中 SQL 的存储过程
Spring 中 SQL 的存储过程

SimpleJdbcCall 类可以被用于调用一个包含 IN 和 OUT 参数的存储过程。你可以在处理任何一个 RDBMS 时使用这个方法，就像 Apache Derby， DB2， MySQL， Microsoft SQL Server， Oracle，和 Sybase。

为了了解这个方法，我们使用 Student 表，它可以在 MySQL TEST 数据库中使用下面的 DDL 进行创建：

CREATE TABLE Student(
ID   INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
AGE  INT NOT NULL,
PRIMARY KEY (ID)
);

下一步，考虑接下来的 MySQL 存储过程，该过程使用 学生 Id 并且使用 OUT 参数返回相应的学生的姓名和年龄。所以让我们在你的 TEST 数据库中使用 MySQL 命令提示符创建这个存储过程：

DELIMITER $$
DROP PROCEDURE IF EXISTS `TEST`.`getRecord` $$
CREATE PROCEDURE `TEST`.`getRecord` (
IN in_id INTEGER,
OUT out_name VARCHAR(20),
OUT out_age  INTEGER)
BEGIN
SELECT name, age
INTO out_name, out_age
FROM Student where id = in_id;
END $$
DELIMITER ;

现在，让我们编写我们的 Spring JDBC 应用程序，它可以实现对我们的 Student 数据库表的创建和读取操作。让我们使 Eclipse IDE 处于工作状态，然后按照如下步骤创建一个 Spring 应用程序：
步骤 	描述
1 	创建一个名为 SpringExample 的项目，并且在所创建项目的 src 文件夹下创建一个名为 com.tutorialspoint 的包。
2 	使用 Add External JARs 选项添加所需的 Spring 库文件，就如在 Spring Hello World Example 章节中解释的那样。
3 	在项目中添加 Spring JDBC 指定的最新的库文件 mysql-connector-java.jar， org.springframework.jdbc.jar 和 org.springframework.transaction.jar。如果你还没有这些所需要的库文件，你可以下载它们。
4 	创建 DAO 接口 StudentDAO 并且列出所有需要的方法。 即使他不是必需的，你可以直接编写 StudentJDBCTemplate 类，但是作为一个良好的实践，让我们编写它。
5 	在 com.tutorialspoint 包下创建其他所需要的 Java 类 Student， StudentMapper， StudentJDBCTemplate 和 MainApp。
6 	确保你已经在 TEST 数据库中创建了 Student 表。同样确保你的 MySQL 服务器是正常工作的，并且保证你可以使用给定的用户名和密码对数据库有读取/写入的权限。
7 	在 src 文件夹下创建 Beans 配置文件 Beans.xml。
8 	最后一步是创建所有 Java 文件和 Bean 配置文件的内容，并且按如下解释的那样运行应用程序。