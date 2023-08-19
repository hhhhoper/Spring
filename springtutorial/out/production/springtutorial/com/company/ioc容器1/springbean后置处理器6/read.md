Spring Bean 后置处理器
Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理。
​BeanPostProcessor ​接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。你也可以在 ​Spring​ 容器通过插入一个或多个 ​BeanPostProcessor​ 的实现来完成实例化，配置和初始化一个​bean​之后实现一些自定义逻辑回调方法。

你可以配置多个 ​BeanPostProcessor ​接口，通过设置 ​BeanPostProcessor ​实现的​ Ordered ​接口提供的​ order​ 属性来控制这些​ BeanPostProcessor​ 接口的执行顺序。

​BeanPostProcessor​ 可以对​ bean​（或对象）实例进行操作，这意味着 ​Spring IoC​ 容器实例化一个 ​bean​ 实例，然后 ​BeanPostProcessor​ 接口进行它们的工作。

注意：
​ApplicationContext​ 会自动检测由 ​BeanPostProcessor​ 接口的实现定义的 ​bean​，注册这些​ bean​ 为后置处理器，然后通过在容器中创建​ bean​，在适当的时候调用它。

在你自定义的​ BeanPostProcessor​ 接口实现类中，要实现以下的两个抽象方法  ​BeanPostProcessor.postProcessBeforeInitialization(Object, String)​ 和  ​BeanPostProcessor.postProcessAfterInitialization(Object, String)​ 和，注意命名要准确

否则会出现： ​“ The type InitHelloWorld must implement the inherited abstract method BeanPostProcessor.postProcessBeforeInitialization(Object, String) ”​之类的错误

