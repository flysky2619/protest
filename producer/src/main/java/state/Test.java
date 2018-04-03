package state;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:52
 */
public class Test {

    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setStatus(1);
        context.method();

        state.setStatus(2);
        context.method();
    }
}
