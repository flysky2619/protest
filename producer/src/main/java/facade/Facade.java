package facade;

/**
 * @author long
 * @Description
 * @date 2018-04-02 14:47
 */
public class Facade {

    private Step step = new Stepone();

    private Step step2 = new Steptwo();

    public void step() {
        step.step();
        step2.step();
    }

}
