package neuedu.work;

public abstract class ColaEmployee {
    //构造方法传一个mouth
    public ColaEmployee(int mouth){
        this.mouth=mouth;
    }
    private String name;
    private int mouth;
    public abstract double getSalary(int mouth);
}
