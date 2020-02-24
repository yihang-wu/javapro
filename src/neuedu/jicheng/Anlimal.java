package neuedu.jicheng;

public class Anlimal {
    private Integer age;
    private String name;
    public void run(){
        System.out.println("动物在跑");
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
