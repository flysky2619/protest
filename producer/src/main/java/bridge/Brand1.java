package bridge;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:00
 */
public class Brand1 extends Brand {

    public Brand1(XGPhone xgPhone) {
        super(xgPhone);
    }

    @Override
    public void run() {
        xgPhone.run();
        System.out.println("i am brand1");
    }
}
