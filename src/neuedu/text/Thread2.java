package neuedu.text;

public class Thread2 implements Runnable {
/*
* Runnable接口
 * */
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //this.getName()是父类中的方法
            System.out.println(Thread.currentThread().getName()+"线程输出"+i);
        }
    }
}
