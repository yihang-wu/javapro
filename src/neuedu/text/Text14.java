package neuedu.text;

public class Text14 {
    public static void main(String[] args) {
        /*Thread td = new Thread3();
        Thread td1= new Thread3();
        td.start();
        td1.start();*/
        /*Runnable thread=new Thread4();
        Thread td = new Thread(thread);
        Thread td1= new Thread(thread);
        td.start();
        td1.start();*/
        //synchronized测试    因为add先拿到锁旗标但他是死循环所以del  一直等
        Runnable thread=new Thread4();
        Thread td = new Thread(()->{
            ((Thread4) thread).add();
        });
        Thread td1= new Thread(()->{
            ((Thread4) thread).del();
        });
        td.start();
        td1.start();
    }
}
