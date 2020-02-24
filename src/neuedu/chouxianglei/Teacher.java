package neuedu.chouxianglei;

public abstract class Teacher {
    //构造方法    无参      带参
    public  Teacher(){}
    public  Teacher(Integer age,String name){
        //有this代表属性 没this代表参数
        this.age=age;
        this.name = name;
    }
    private Integer age;
    private String name;
    //抽象方法
    public abstract void jiangke();
    //普通方法
    public void jiangke1(){
        System.out.println("老师讲课");
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
