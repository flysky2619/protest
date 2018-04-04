package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author long
 * @Description
 * @date 2018-04-03 17:17
 */
public class TeacherFactory {

    private static Map<Integer, Teacher> integerTeacherMapPool;


    private TeacherFactory() {
        integerTeacherMapPool = new HashMap<>();
    }

    public static TeacherFactory getInstance() {
        return Holder.instance;
    }


    public static Teacher getTeacher(int num) {
        Teacher teacher = integerTeacherMapPool.get(num);

        if (teacher == null) {
            teacher = new Teacher();
            teacher.setNumber(num);

            integerTeacherMapPool.put(num, teacher);
        }

        return teacher;
    }


    /**
     * 105      * 使用静态内部类，静态内部类相当于外部类的static域，它的对象与外部类对象间不存在依赖关系，因此可直接创建。
     * 106      * 因为静态内部类相当于其外部类的成员，所以在第一次被使用的时候才被会装载。且只装载一次。
     * 107      * 而对象内部类的实例，是绑定在外部对象实例中的。
     * 108      * 静态内部类中可以定义静态方法，在静态方法中只能够引用外部类中的静态成员方法或者成员变量。
     * 109      *
     * 110      * 在某些情况中，JVM 含地了同步，这些情况下就不用自己再来进行同步控制了。这些情况包括：
     * 111      *1.由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时
     * 112      *2.访问final字段时
     * 113      *3.在创建线程之前创建对象时
     * 114      *4.线程可以看见它将要处理的对象时
     * 115      *
     * 116      * 故，我使用了静态初始化器来实现线程安全的单例类，它由 JVM 来保证线程安全性。
     * 117      * 且这种实现方式，会在类装载的时候（使用这个类的时候）就初始化对象，不管使用者需要不需要，且只实例化一次。
     * 118      *
     * 119      * 故，我在外部类里再创建一个静态内部类，在静态内部类里去创建本类（外部类）的对象，这样只要不使用这个静态内部类，那就不创建对象实例，从而同时实现延迟加载和线程安全。
     * 120
     */

    private static class Holder {
        private static final TeacherFactory instance = new TeacherFactory();
    }
}
