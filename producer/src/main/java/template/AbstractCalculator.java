package template;

/**
 * @author long
 * @Description
 * @date 2018-04-03 11:39
 */
public abstract class AbstractCalculator {

    public abstract int calculate(int a, int b);

    public final int calculate(String exp, String opt) {
        int[] split = this.split(exp, opt);
        return calculate(split[0], split[1]);
    }

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
