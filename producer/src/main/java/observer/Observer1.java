package observer;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:31
 */
public class Observer1 extends Observer{


    public Observer1(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(name+",老板回来了，别睡了");
    }
}
