package flyweight;

/**
 * @author long
 * @Description
 * @date 2018-04-03 17:55
 */
public class Test {

    public static void main(String[] args) {
        TeacherFactory instance = TeacherFactory.getInstance();
        Teacher teacher = instance.getTeacher(10);
        Teacher teacher1 = instance.getTeacher(100);
        Teacher teacher2 = instance.getTeacher(10);

        System.out.println(teacher.getNumber());
        System.out.println(teacher1.getNumber());
        System.out.println(teacher2.getNumber());

        // 判断是否是相等对象
        if (teacher == teacher2) {
            // 确实打印了，ok
            System.out.print("____________-");
        }
    }
}
