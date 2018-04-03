package interpreter;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:19
 */
public class Test {

    public static void main(String[] args) {
        int ssssss = new Plus().interpret(new Context(12, "ssssss"));
        System.out.println(ssssss);
    }
}
