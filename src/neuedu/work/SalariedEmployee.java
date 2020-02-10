package neuedu.work;

public class SalariedEmployee extends ColaEmployee{
    //固定工资
    private int salary;
    public SalariedEmployee(int salary,int mouth){
        super(mouth);//掉父类的方法
        this.salary=salary;
    }
    @Override
    public double getSalary(int mouth) {
        return salary;
    }
}
