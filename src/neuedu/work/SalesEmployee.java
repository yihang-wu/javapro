package neuedu.work;

public class SalesEmployee extends ColaEmployee {
    private int sales;
    private double ticheng;
    public SalesEmployee(int sales,double ticheng,int mouth){
            super(mouth);
            this.sales=sales;
            this.ticheng=ticheng;
    }
    @Override
    public double getSalary(int mouth) {
        return sales*ticheng;
    }
}
