package neuedu.text;

import java.util.concurrent.CountDownLatch;

public class Text15 {
    public static int a = 0;//全局变量

    public static void main(String[] args) {
        Object object=new Object();
        CountDownLatch countDownLatch =new CountDownLatch(5000);
      /*  try {
            //.await()等待捕获
            countDownLatch.await();
            System.out.println("aaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //main方法本来就是一个线程
            for(int i=0;i<5000;i++){
                Thread td =new Thread(()->{
                    synchronized (object) {
                        a++;
                        countDownLatch.countDown();
                    }
                });
                td.start();
            }
            //输出a的时候  a不会等for循环没有完
            /**
             * 问题一   main方法是线程  要让a循环5000次
             * 解决方法：   另一种锁    闭锁
             *          CountDownLatch 一开始就加上锁
             *      CountDownLatch 对象名 =new CountDownLatch(锁的数量);
             *      .await()方法  代表阻塞   等待锁全部解开，全解开后  放行
             *
             *      .countDown()   每调用一次，解一把锁
             * */
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
         /*  Thread td = new Thread(()->{
               for (int i=0;i<100;i++){
                   System.out.println(Thread.currentThread().getName()+"线程输出--"+i);
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           });
           td.start();*/
    }
}
