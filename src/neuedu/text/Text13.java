package neuedu.text;

import java.util.ArrayList;
import java.util.List;

public class Text13 {
    public static void main(String[] args) {
//        System.out.println(method(4));
//        System.out.println(baoshu(1000));

        /**
         * 一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
         * */
  /*      Double height=100.0;
        for (int n=1;n<=10;n++){
            height/=2;
        }
        System.out.println(height);*/
        /**
         * 一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
         * */
        for (int i = 1; i < 1000; i++) {
            int m=(int) Math.sqrt((i+100));
            int n=(int) Math.sqrt((i+100+168));
            if (m*m==i+100&&n*n==i+100+168) {
                System.out.println("这个数是"+i);
            }
        }
    }
    /**
     * 输出斐波那契数列  以 1 1 开头
     * 后面每一位都是前两位之和 1 1 2 3 5 8 13
     * 计算第n个数
     * */
   /* public static int method(int n){
        if(n==1||n==2){
            return 1;
        }else {
            int f1=1;
            int f2=1;
            int sum;
            for (int i=3;i<=n;i++){
                sum =f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }*/

   /**
    * n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
    * */
   /*public static int baoshu(int n ){
       List<Integer> list = new ArrayList<>();
       for (int i=1;i<=n;i++){
           list.add(i);
       }
       int m = 1;//报数的计数器
       while (list.size()>1){
           if(m!=3){
                int first = list.remove(0);//不是3拿出来
                list.add(first);//放进数组最后一个
                m++;
           }else {
               list.remove(0);//直接拿出去
               m = 1;//再次从一开始
           }
       }return list.get(0);//直到最后一个
   }*/
}