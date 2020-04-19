package frank.reflect;

import frank.ioc.Duck;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

    public static void main(String[] args) throws Exception {
//        Class<Duck> clazz = Duck.class;
        Class<?> clazz = Class.forName("frank.ioc.Duck");
        // 生成对象，生成对象实例，通过构造方法生成
        // 无参构造方法创建
        Duck duck = (Duck) clazz.newInstance();
        System.out.println(duck);

        // 有参构造方法创建
        Duck duck2 = (Duck) clazz.getConstructor(String.class, Integer.class).
                newInstance("小黄鸭", 2);
        System.out.println(duck2);

        // 获取类的属性 + 对象属性
        Field[] fields = Duck.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + "=" + field.get(duck2));
        }

        Method method = Duck.class.getDeclaredMethod("setAge", Integer.class);
        method.invoke(duck2, 3); // 类似 duck2.setAge(3) 的方法调用;
        System.out.println(duck2);
    }
}
