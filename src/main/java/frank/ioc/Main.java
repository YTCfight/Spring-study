package frank.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载 Spring 的配置文件，初始化上下文：生成 Bean 对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        // 通过名字获取 Bean 对象
        Object o = context.getBean("myName");
        System.out.println(o.getClass());
        System.out.println(o);


        Object duck1 = context.getBean("duck1");
        System.out.println(duck1.getClass());
        System.out.println(duck1);
//
//        Object duck2 = context.getBean("duck2");
//        System.out.println(duck2.getClass());
//        System.out.println(duck2);
//
//        Object duckShop = context.getBean("duckShop");
//        System.out.println(duckShop.getClass());
//        System.out.println(duckShop);
//
//        // 通过类型获取 Bean 对象，容器中只能有一个该类型的对象
//        Object duckShop2 = context.getBean(DuckShop.class);
//        System.out.println(duckShop2.getClass());
//        System.out.println(duckShop2);
//
//        // 容器中存在两个 Duck 类型的对象，通过类型获取对象时就会 报错
//        Object duck = context.getBean(Duck.class);
//        System.out.println(duck.getClass());
//        System.out.println(duck);
    }
}
