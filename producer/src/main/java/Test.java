import factorypattern.SendModel;
import factorypattern.SmsSender;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author long
 * @Description
 * @date 2017-12-22 13:04
 */
public class Test {

    public Test(String s) {
        System.out.println(s);
    }

    public Test(String s, Integer integer) {
        System.out.println(s + integer);
    }

    public static void main(String[] args) {

        Arrays.asList("ma", "wen", "long").forEach(a -> {
            System.out.println(a + 123);
        });

        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2)); //Comparable
        SendModel sendModel = new SendModel();

        Optional<SendModel> model = Optional.of(sendModel);

        Arrays.asList("a", "b", "d").sort((e1, e2) -> { //Comparable
            int result = e1.compareTo(e2);
            return result;
        });

        SmsSender smsSender = new SmsSender();
        smsSender.send();
        smsSender.defaultSend("17338155173", "测试接口默认方法");


        Supplier<String> supplier = () -> "hello world";

        //get方法不接受参数，返回一个结果
        System.out.println("supplier = " + supplier.get() + "");


        //替代不接受参数的工厂方法
        Supplier<SendModel> studentSupplier = () -> new SendModel("123", "456");
        System.out.println(studentSupplier.get().getContent());

        //替代不接受参数的工厂方法
        Supplier<SendModel> studentSupplier2 = SendModel::new;
        SendModel sendModel1 = studentSupplier2.get();
        System.out.println(sendModel1);
        SendModel sendModel2 = studentSupplier2.get();
        System.out.println(sendModel2);

        Predicate<String> predicate = (s) -> s.length() > 0;
        boolean mawenlong = predicate.test("mawenlong");
        System.out.println(mawenlong);
        boolean mawenlong1 = predicate.negate().test("mawenlong");
        System.out.println(mawenlong1);


        TestLambdaAndFunction testLambdaAndFunction = new TestLambdaAndFunction();

        System.out.println(testLambdaAndFunction.compute(1, num -> num + 5));


    }

    private Integer sort(Integer integer) {
        return integer;
    }
}
