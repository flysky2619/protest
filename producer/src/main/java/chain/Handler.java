package chain;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:02
 */
public abstract class Handler {

    protected Handler handler;
    protected String name;

    public Handler(String name) {
        this.name = name;
    }
    public void setLeader(Handler leader) { // key
        this.handler = leader;
    }

    public abstract void handleRequest(String requestType);
}
