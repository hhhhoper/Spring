注入 Bean 的依赖性

当 @Beans 依赖对方时，表达这种依赖性非常简单，只要有一个 bean 方法调用另一个，如下所示：

package com.tutorialspoint;
import org.springframework.context.annotation.*;
@Configuration
public class AppConfig {
   @Bean
   public Foo foo() {
      return new Foo(bar());
   }
   @Bean
   public Bar bar() {
      return new Bar();
   }
}

这里，foo Bean 通过构造函数注入来接收参考基准。现在，让我们看到一个正在执行的例子