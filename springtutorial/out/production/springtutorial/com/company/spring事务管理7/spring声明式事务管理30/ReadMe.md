
Spring 声明式事务管理
Spring 声明式事务管理

声明式事务管理方法允许你在配置的帮助下而不是源代码硬编程来管理事务。这意味着你可以将事务管理从事务代码中隔离出来。你可以只使用注释或基于配置的 XML 来管理事务。 bean 配置会指定事务型方法。下面是与声明式事务相关的步骤：

    我们使用标签，它创建一个事务处理的建议，同时，我们定义一个匹配所有方法的切入点，我们希望这些方法是事务型的并且会引用事务型的建议。

    如果在事务型配置中包含了一个方法的名称，那么创建的建议在调用方法之前就会在事务中开始进行。

    目标方法会在 try / catch 块中执行。
    如果方法正常结束，AOP 建议会成功的提交事务，否则它执行回滚操作。

让我们看看上述步骤是如何实现的。在我们开始之前，至少有两个数据库表是至关重要的，在事务的帮助下，我们可以实现各种 CRUD 操作。以 Student 表为例，该表是使用下述 DDL 在 MySQL TEST 数据库中创建的。

CREATE TABLE Student(
ID   INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(20) NOT NULL,
AGE  INT NOT NULL,
PRIMARY KEY (ID)
);

第二个表是 Marks，我们用来存储基于年份的学生标记。在这里，SID 是 Student 表的外键。

CREATE TABLE Marks(
SID INT NOT NULL,
MARKS  INT NOT NULL,
YEAR   INT NOT NULL
);