import java.util.Arrays;

/**
 * @author long
 * @Description
 * @date 2018-03-30 12:53
 */
public class TestMethodReference {

    public TestMethodReference(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //1.如果使用lambda表达式来创建一个函数式接口实例，那这个lambda表达式的入参和返回必须符合这个函数式接口中唯一的抽象方法的定义。
        Arrays.asList("ma", "wen", "long").forEach(a -> System.out.println(a)); //Consumer<T>

        //方法引用是用来直接访问类或者实例的已经存在的方法或者构造方法。方法引用提供了一种引用而不执行方法的方式，它需要由兼容的函数式接口构成的目标类型上下文。计算时，方法引用会创建函数式接口的一个实例。
        //四种方法引用类型
        //1、静态方法引用
        //组成语法格式：ClassName::staticMethodName

        //2、特定实例对象的方法引用
        //a.实例上的实例方法引用
        //组成语法格式：instanceReference::methodName

        //b.超类上的实例方法引用
        //组成语法格式：super::methodName

        //c.类型上的实例方法引用
        //组成语法格式：ClassName::methodName

        //2.函数式接口实例第二种创建方式：方法引用
        //方法引用的语法是 对象::方法名（只是其中一种）
        //同样，使用方法引用方式去创建函数式接口实例也必须遵守方法的定义
        Arrays.asList("ma", "wen", "long").forEach(System.out::println);//Consumer<T>

        //3.创建函数式接口的最后一种，第三种方式：构造方法引用
        Arrays.asList("ma", "wen", "long").forEach(TestMethodReference::new);
    }
}
