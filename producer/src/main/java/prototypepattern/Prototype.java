package prototypepattern;

import java.io.*;

/**
 * @author long
 * @Description
 * @date 2018-04-02 11:45
 */
public class Prototype implements Cloneable, Serializable {

    private String name;

    private int age;

    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //浅复制
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    //深复制
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        //读出二进制流产生新对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Prototype prototype = (Prototype) objectInputStream.readObject();
        return prototype;
    }

}
