package com.company.spring依赖注入2.基于构造函数的依赖注入8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te=(TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
/*
* 构造函数参数解析:
注释：上面这个例子里，将依赖类 SpellChecker.java注入到TextEditor.java 文件。

如此，便称为依赖注入。

如果存在不止一个参数时，当把参数传递给构造函数时，可能会存在歧义。要解决这个问题，那么构造函数的参数在 bean 定义中的顺序就是把这些参数提供给适当的构造函数的顺序就可以了。

考虑下面的类:

package x.y;
public class Foo {
   public Foo(Bar bar, Baz baz) {
      // ...
   }
}
下述配置文件工作顺序：

<beans>
   <bean id="foo" class="x.y.Foo">
      <constructor-arg ref="bar"/>
      <constructor-arg ref="baz"/>
   </bean>

   <bean id="bar" class="x.y.Bar"/>
   <bean id="baz" class="x.y.Baz"/>
</beans>
让我们再检查一下我们传递给构造函数不同类型的位置。考虑下面的类：

package x.y;
public class Foo {
   public Foo(int year, String name) {
      // ...
   }
}
如果你使用 type 属性显式的指定了构造函数参数的类型，容器也可以使用与简单类型匹配的类型。例如：

<beans>

   <bean id="exampleBean" class="examples.ExampleBean">
      <constructor-arg type="int" value="2001"/>
      <constructor-arg type="java.lang.String" value="Zara"/>
   </bean>

</beans>
最后并且也是最好的传递构造函数参数的方式，使用 index 属性来显式的指定构造函数参数的索引。下面是基于索引为 0 的例子，如下所示：

<beans>

   <bean id="exampleBean" class="examples.ExampleBean">
      <constructor-arg index="0" value="2001"/>
      <constructor-arg index="1" value="Zara"/>
   </bean>

</beans>
最后，如果你想要向一个对象传递一个引用，你需要使用 标签的 ref 属性，如果你想要直接传递值，那么你应该使用如上所示的 value 属性。


* */