package neuedu.work;

public class HourlyEmployee extends ColaEmployee {
    private int hoursalary;
    private int hour;
    public HourlyEmployee(int hour, int hoursalary,int mouth){
        super(mouth);
        this.hour=hour;
        this.hoursalary=hoursalary;
    }
    @Override
    public double getSalary(int mouth) {
        if(hour<=160){
            return hour*hoursalary;
        }else {
            //乘以1.6可能是小数所以改为double类型
            return 160*hoursalary+(hour-160)*hoursalary*1.6;
        }

    }
}
