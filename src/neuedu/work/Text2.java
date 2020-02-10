package neuedu.work;

public class Text2 {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee(10000,6);
        System.out.println("拿固定工资的员工工资"+salariedEmployee.getSalary(6));
        HourlyEmployee hourlyEmployee = new HourlyEmployee(180,100,6);
        System.out.println("拿小时工资的员工工资"+hourlyEmployee.getSalary(6));
        SalesEmployee salesEmployee = new SalesEmployee(10000,100,6);
        System.out.println("按月销售额和提成率拿工资员工工资"+salariedEmployee.getSalary(6));
    }
}
