
Spring 由构造函数自动装配
Spring 由构造函数自动装配

这种模式与 byType 非常相似，但它应用于构造器参数。Spring 容器看作 beans，在 XML 配置文件中 beans 的 autowire 属性设置为 constructor。然后，它尝试把它的构造函数的参数与配置文件中 beans 名称中的一个进行匹配和连线。如果找到匹配项，它会注入这些 bean，否则，它会抛出异常。

例如，在配置文件中，如果一个 bean 定义设置为通过构造函数自动装配，而且它有一个带有 SpellChecker 类型的参数之一的构造函数，那么 Spring 就会查找定义名为 SpellChecker 的 bean，并用它来设置构造函数的参数。你仍然可以使用 <constructor-arg> 标签连接其余属性。下面的例子将说明这个概念。