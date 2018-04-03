package strategy;

/**
 * @author long
 * @Description
 * @date 2018-04-03 14:10
 */
public class Test {

    public static void main(String[] args) {
        ICalculator iCalculator = new Plus();
        iCalculator.calculate("123");

        iCalculator = new Minus();
        iCalculator.calculate("456");
    }
}
