package decorator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:57
 */
public class Test {

    public static void main(String[] args) {

        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorA.operation();
        System.out.println("-----------------------");
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operation();
    }
}
