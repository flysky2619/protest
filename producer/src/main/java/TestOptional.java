import java.util.Optional;

/**
 * @author long
 * @Description
 * @date 2018-03-30 15:24
 * <p>
 * Optional解决Java中的NPE（NullPointerException）
 */
public class TestOptional {

    public static void main(String[] args) {
        TestOptional testOptional = new TestOptional();
        testOptional.test1();
    }

    public void test1() {
        String str = "mawenlong";
        Optional<String> optional = Optional.ofNullable(str);
        optional.ifPresent(System.out::println);
        System.out.println(optional.orElseGet(() -> "456"));
        str = null;
        optional = Optional.ofNullable(str);
        System.out.println(optional.orElse("123"));
        System.out.println(optional.orElseGet(() -> "456"));
    }
}
