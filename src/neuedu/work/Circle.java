package neuedu.work;

public class Circle extends Shape{
    private int radius;
    public Circle(){

    }
    public Circle(String color,int radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public void showAll() {
        System.out.println("圆形面积是"+getArea());
        System.out.println("圆形周长是"+getPer());
        System.out.println("圆形颜色是"+getColor());
    }

}
