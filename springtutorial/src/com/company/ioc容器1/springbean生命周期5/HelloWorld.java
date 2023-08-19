package com.company.ioc容器1.springbean生命周期5;
/*
* 如果你在非 web 应用程序环境中使用 Spring 的 IoC 容器；例如在丰富的客户端桌面环境中；那么在 JVM 中你要注册关闭 hook。
* 这样做可以确保正常关闭，为了让所有的资源都被释放，可以在单个 beans 上调用 destroy 方法。
* 下面是 MainApp.java 文件的内容。在这里，你需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdown
* Hook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法。
* */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message:"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
    public void init(){
        System.out.println("Bean will init now");
    }
}
