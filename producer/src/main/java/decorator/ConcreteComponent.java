package decorator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:58
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
