package template;

/**
 * @author long
 * @Description
 * @date 2018-04-03 11:43
 */
public class Test {

    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Plus();
        String exp = "8+8";
        int calculate = abstractCalculator.calculate(exp, "\\+");

        abstractCalculator = new Minus();
        String exp2 = "7+6";
        calculate = abstractCalculator.calculate(exp2, "\\+");
        System.out.println(calculate);

    }
}
