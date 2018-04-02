import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author long
 * @Description
 * @date 2018-03-29 16:27
 */
public class TestLambdaAndFunction {

    public int add2(int i) {
        return i + 2;
    }

    public int compute(int i, Function<Integer, Integer> function) {
        return function.apply(i);
    }

    public int compute1(int i, Function<Integer, Integer> after, Function<Integer, Integer> before) {
        return after.compose(before).apply(i);
    }

    public int compute2(int i, Function<Integer, Integer> before, Function<Integer, Integer> after) {
        return before.andThen(after).apply(i);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction,
                        Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

    public static void main(String[] args) {
        TestLambdaAndFunction testLambdaAndFunction = new TestLambdaAndFunction();
        System.out.println(testLambdaAndFunction.compute(1, num -> num + 5));
        System.out.println(testLambdaAndFunction.compute1(2, n -> n * n, n -> n * 2));
        System.out.println(testLambdaAndFunction.compute2(2, n -> n * n, n -> n * 2));
        System.out.println(testLambdaAndFunction.compute3(2, 3, (a, b) -> a * b, n -> 2 * n));
    }
}
