package neuedu.work;

public class Rectangle extends Shape{
    private double width;
    private  double height;
    public Rectangle(){

    }
    public  Rectangle(double width,double height,String color){
        super(color);
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea() {
        return 2*(width+height);
    }

    @Override
    public double getPer() {
        return width*height;
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积是"+getArea());
        System.out.println("矩形颜色是"+getColor());
    }
}
