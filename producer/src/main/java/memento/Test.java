package memento;

/**
 * @author long
 * @Description
 * @date 2018-04-03 15:29
 */
public class Test {

    public static void main(String[] args) {
        // 创建原始类
        Original origi = new Original("egg");

        Memento memento = origi.createMemento();

        // 修改原始类的状态
        origi.setValue("ssssss");
        System.out.println("修改后的状态为：" + origi.getValue());

        //恢复
        origi.restoreMemento(memento);
        System.out.println("恢复后的状态为：" + origi.getValue());
    }
}
