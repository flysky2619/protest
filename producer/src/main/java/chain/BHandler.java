package chain;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:03
 */
public class BHandler extends Handler {

    public BHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("2")) {
            System.out.println("2处理了你的请求");
        } else if (handler != null){
            handler.handleRequest(requestType);
        } else {
            System.out.println("无人负责");
        }
    }
}
