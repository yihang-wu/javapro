package neuedu.text;

public class Text12 {
    public static void main(String[] args) {
        /*
        * 进程
        * 线程
        * 摩尔定律（在cpu的发展中失效了）多核cpu --》并发编程
        * 如何创建多线程
        *       1.继承Thread类
        *       2.实现Runnable接口
        *       3.线程池
        *       如果用 继承Thread类或者实现Runnable接口方式  那么必须重写run方法
        *       执行的时候 调用run方法并非事宜线程的方式执行的，要使用start方法启动线程，启动线程后，该线程运行起来，入口就是run
        *       Thread类中有一个sleep方法，暂时放弃对cpu的抢占
        *       Thread.sleep(500);表示500毫秒内，不会抢占cpu，500毫秒之后再抢占cpu
        *       Thread.currentThread()获取当前正在执行的线程
        *       线程对象下有.getName() 返回线程名
        *
        *       lambda表达式
        *       匿名内部类的一个变体写法
        *       匿名内部类
        * */
       /* //这样是按顺序调用方法
        eat();
        drink();
        talk();*/
//       Thread thread =new Thread1();
//       Thread thread1=new Thread1();
///*
//       thread.run();//调用run方法
//*/
//        thread.start();
//        thread1.start();
        Thread2 thread2 =new Thread2();//不能直接调用start（）方法
        Thread thread =new Thread(thread2);
        thread.start();
    }
    public static void eat(){}
    public static void drink(){}
    public static void talk(){}

}
