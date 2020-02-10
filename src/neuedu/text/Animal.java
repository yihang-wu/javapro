package neuedu.text;

public class Animal {
    private int age;
    private String name;
    private String run;

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        System.out.println("跑");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
