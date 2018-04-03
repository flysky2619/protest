package interpreter;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:18
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getAge() + context.getName().length();
    }
}
