package neuedu.pojo;

public class Anlimal {
    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;

    public Anlimal() {
    }

    public Anlimal(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Anlimal(Integer id, String name, Integer age, Integer sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Anlimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", id=" + id +
                '}';
    }
}
