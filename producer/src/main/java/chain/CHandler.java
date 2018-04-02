package chain;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:03
 */
public class CHandler extends Handler {

    public CHandler(String name) {
        super(name);
    }


    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("3")) {
            System.out.println("3处理了你的请求");
        } else if (handler != null){
            handler.handleRequest(requestType);
        } else {
            System.out.println("无人负责");
        }
    }
}
