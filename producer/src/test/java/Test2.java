import com.alibaba.fastjson.JSON;
import prototypepattern.Professor;
import prototypepattern.Prototype;

import java.io.IOException;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:47
 */
public class Test2 {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        //Singleton instance = Singleton.SingletonEnum.INSTANCE.getInstance();
        //System.out.println(instance);
        //Singleton instance1 = Singleton.SingletonEnum.INSTANCE.getInstance();
        //System.out.println(instance1);

        Professor p1 = new Professor();
        p1.setName("Professor Zhang");
        p1.setAge(30);

        Prototype prototype = new Prototype();
        prototype.setAge(10);
        prototype.setName("ceshi");
        prototype.setProfessor(p1);
        System.out.println(JSON.toJSONString(prototype));

        Prototype prototype1 = prototype.clone();
        System.out.println(JSON.toJSONString(prototype1));
        System.out.println("----------------------------");

        prototype1.setAge(12);
        prototype1.setName("cscscs");
        Professor p2 = prototype1.getProfessor();
        p2.setAge(10);
        p2.setName("123456");
        prototype1.setProfessor(p2);
        System.out.println(JSON.toJSONString(prototype1));
        System.out.println(JSON.toJSONString(prototype));
        System.out.println("----------------------------");

        Prototype prototype2 = prototype.deepClone();
        prototype2.setAge(15);
        prototype2.setName("dfasfdafasf");
        Professor professor = prototype2.getProfessor();
        professor.setName("789");
        professor.setAge(20);
        prototype2.setProfessor(professor);
        System.out.println(JSON.toJSONString(prototype2));
        System.out.println(JSON.toJSONString(prototype));

    }
}
