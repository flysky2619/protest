import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author long
 * @Description
 * @date 2018-03-30 12:55
 */
public class TestStreamApi {

    public static void main(String[] args) {
        TestStreamApi testStreamApi = new TestStreamApi();
        testStreamApi.testStream1();
    }

    public void testStream1() {
        List<String> strings = Arrays.asList("hello", "world", "helloworld");
        for (String s : strings) {
            if (s.length()>5) {
                System.out.println(s.toUpperCase());
            }
        }

        strings.stream().filter(s -> s.length()>5).map(s -> s.toUpperCase()).forEach(System.out::println);
        strings.stream().filter(s -> s.length()>5).map(String::toUpperCase).forEach(System.out::println);
    }

    public void testStream2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(integer -> integer >= 5).collect(Collectors.toList());
    }
}
