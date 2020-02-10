package neuedu.text;

public class Dog {
    private int age;
    private char sex;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0||age>20){
            System.out.println("输入错误");
        }else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == '公' || sex == '母') {
            this.sex = sex;
        } else {
            System.out.println("输入错误");
        }
    }
}

