package observer;

/**
 * @author long
 * @Description
 * @date 2018-04-02 15:32
 */
public class Observer2 extends Observer {


    public Observer2(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println(name+",老板回来了，别睡了");
    }
}
