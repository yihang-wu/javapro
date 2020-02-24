package neuedu.chouxianglei;

public class Text {
    public static void main(String[] args) {
     /*   Wanglaoshi w = new Wanglaoshi();
        Zhanglaoshi z = new Zhanglaoshi();
        Guolaoshi g = new Guolaoshi();
        w.jiangke();
        z.jiangke();
        g.jiangke();*/
//     Wanglaoshi w = new Wanglaoshi(22,"王");//带参
        Wanglaoshi w = new Wanglaoshi();
        w.setAge(22);
        w.jiangke();
        Zhanglaoshi z = new Zhanglaoshi();
        z.jiangke();
        Guolaoshi g = new Guolaoshi();
        g.jiangke();
    }
}
