package decorator;

/**
 * @author long
 * @Description
 * @date 2018-04-02 17:54
 */
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
