package neuedu.text;

public class Thread4 implements Runnable{
    private int cont =100;
    Object object =new Object();
    @Override
    public void run() {
        while (cont>0){
            //可能存在第一个线程进来在执行cont--之前 第二个线程进来了 那么存在同时卖一张票的情况
            //线程同步synchronized(锁旗标（任何一个对象都可以)){}
            //被synchronized包裹的语句想要执行  必须先要拿到锁旗标，如果已经被其他线程拿了，只能等其他线程放开之后再拿。
        //    即一次只能执行一个语句
            synchronized (object) {
                System.out.println(Thread.currentThread().getName() + "卖出了第" + cont + "张票");
                cont--;
                try {
                    Thread3.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public synchronized void add(){
            while (true){
                System.out.println("add");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public synchronized void del(){
            while (true){
                System.out.println("del");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
