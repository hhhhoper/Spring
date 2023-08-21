
Spring @Autowired 注解

使用 Spring 开发时，进行配置主要有两种方式，一是 xml 的方式，二是 java config 的方式。Spring 技术自身也在不断的发展和改变，从当前 Springboot 的火热程度来看，java config 的应用是越来越广泛了，在使用 java config 的过程当中，我们不可避免的会有各种各样的注解打交道，其中，我们使用最多的注解应该就是 @Autowired 注解了。这个注解的功能就是为我们注入一个定义好的 bean。
@Autowired 注解的作用到底是什么？

@Autowired 这个注解我们经常在使用，现在，我想问的是，它的作用到底是什么呢?

首先，我们从所属范围来看，事实上这个注解是属于 Spring 的容器配置的一个注解，与它同属容器配置的注解还有：@Required,@Primary, @Qualifier 等等。因此 @Autowired 注解是一个用于容器 ( container ) 配置的注解。

其次，我们可以直接从字面意思来看，@autowired 注解来源于英文单词 autowire,这个单词的意思是自动装配的意思。自动装配又是什么意思？这个词语本来的意思是指的一些工业上的用机器代替人口，自动将一些需要完成的组装任务，或者别的一些任务完成。而在 Spring 的世界当中，自动装配指的就是使用将 Spring 容器中的 bean 自动的和我们需要这个 bean 的类组装在一起。
@Autowired 注解用法

在分析这个注解的实现原理之前，我们不妨先来回顾一下 @Autowired 注解的用法。

将 @Autowired 注解应用于构造函数，如以下示例所示

public class MovieRecommender {

    private final CustomerPreferenceDao customerPreferenceDao;
 
    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
 
    // ...
}

将 @Autowired 注解应用于 setter 方法

public class SimpleMovieLister {

    private MovieFinder movieFinder;
 
    @Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
 
    // ...
}

将 @Autowired 注解应用于具有任意名称和多个参数的方法

public class MovieRecommender {

    private MovieCatalog movieCatalog;
 
    private CustomerPreferenceDao customerPreferenceDao;
 
    @Autowired
    public void prepare(MovieCatalog movieCatalog,
            CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }
 
    // ...
}

您也可以将 @Autowired 注解应用于字段，或者将其与构造函数混合，如以下示例所示

public class MovieRecommender {

    private final CustomerPreferenceDao customerPreferenceDao;
 
    @Autowired
    private MovieCatalog movieCatalog;
 
    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
 
    // ...
}

直接应用于字段是我们使用的最多的一种方式，但是使用构造方法注入从代码层面却是更加好的。除此之外，还有以下不太常见的几种方式

将 @Autowired 注解添加到需要该类型数组的字段或方法，则 Spring 会从 ApplicationContext 中搜寻符合指定类型的所有 bean，如以下示例所示：

public class MovieRecommender {

    @Autowired
    private MovieCatalog[] movieCatalogs;
 
    // ...
}

数组可以，我们可以马上举一反三，那容器也可以吗，答案是肯定的，下面是 set 以及 map 的例子：

public class MovieRecommender {

    private Set<MovieCatalog> movieCatalogs;
 
    @Autowired
    public void setMovieCatalogs(Set<MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }
 
    // ...
}

public class MovieRecommender {

    private Map<String, MovieCatalog> movieCatalogs;
 
    @Autowired
    public void setMovieCatalogs(Map<String, MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }
 
    // ...
}

以上就是 @Autowired 注解的主要使用方式，经常使用 Spring 的话应该对其中常用的几种不会感到陌生。


