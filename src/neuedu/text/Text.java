package neuedu.text;

import neuedu.web.AnlimalWeb;

public class Text {
    public static void main(String[] args) {
       /* Dog d1 = new Dog();
        d1.setAge(25);
        d1.setSex('n');
        int age = d1.getAge();
        char sex = d1.getSex();
        System.out.println(age);
        System.out.println(sex);*/
        /*long a = 10;
        long b = 20;
        long c = a+b;
        System.out.println(c);*/
        /*int year = 1990;
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }*/
        /*int i=1;
        int sum=0;
        while(i<=100){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
        for (i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);*/
        /**
         * 分层开发
         * */
        AnlimalWeb anlimalWeb = new AnlimalWeb();
        anlimalWeb.showmain();
        anlimalWeb.input();
    }

}
