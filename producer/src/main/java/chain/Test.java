package chain;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:06
 */
public class Test {

    public static void main(String[] args) {
        AHandler a = new AHandler("a");
        BHandler b = new BHandler("b");
        CHandler c = new CHandler("c");

        a.setLeader(b);
        b.setLeader(c);

        a.handleRequest("1");
        a.handleRequest("2");
        a.handleRequest("3");
    }
}
