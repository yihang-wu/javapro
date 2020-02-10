package neuedu.work;

public abstract class Shape {
        public Shape(){

        }
        public Shape(String color){
            //有this代表属性，没this代表参数
            this.color=color;
        }
        public String getColor(){
                return color;
        }
        private double area;
        private double per;
        private String color;
        public abstract double getPer() ;
        public abstract void showAll();
        public abstract double getArea() ;
}
