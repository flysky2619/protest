import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author long
 * @Description
 * @date 2018-03-30 14:53
 */
public class TestPredicate {


    public static void main(String[] args) {
        TestPredicate testPredicate = new TestPredicate();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        testPredicate.test1(list, i -> i > 5, i -> i < 8);

    }


    public void test1(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {

        list.stream().filter(predicate1.and(predicate2)).forEach(System.out::println);
        System.out.println("---------------------------");
        list.stream().filter(predicate1.or(predicate2)).forEach(System.out::println);
        System.out.println("---------------------------");
        list.stream().filter(predicate1.negate()).forEach(System.out::println);
        System.out.println("---------------------------");
        System.out.println(Predicate.isEqual("test").test("test"));//true
        System.out.println(Predicate.isEqual("test").test("pre"));
    }
}
