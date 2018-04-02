package bridge;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:58
 */
public abstract class Brand {
    protected XGPhone xgPhone;

    public Brand(XGPhone xgPhone) {
        this.xgPhone = xgPhone;
    }

    public abstract void  run();
}
