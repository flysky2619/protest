package state;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:50
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void method() {
        if (state.getStatus() == 1) {
            state.method1();
        } else if (state.getStatus() == 2) {
            state.method2();
        }
    }
}
