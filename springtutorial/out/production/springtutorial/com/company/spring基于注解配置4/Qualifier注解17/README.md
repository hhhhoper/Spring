
Spring @Qualifier 注解
Spring @Qualifier 注解

可能会有这样一种情况，当你创建多个具有相同类型的 bean 时，并且想要用一个属性只为它们其中的一个进行装配，在这种情况下，你可以使用 @Qualifier 注解和 @Autowired 注解通过指定哪一个真正的 bean 将会被装配来消除混乱。下面显示的是使用 @Qualifier 注解的一个示例。