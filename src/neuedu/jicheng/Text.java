package neuedu.jicheng;

public class Text {
    public static void main(String[] args){
        Persion persion = new Persion();
        persion.run();
        persion.setAge(12);
        System.out.println("人的年龄"+persion.getAge());
        Student student = new Student();
        student.run();
        Dog dog = new Dog();
        dog.run();
        Cat cat = new Cat();
        cat.run();
    }
}
