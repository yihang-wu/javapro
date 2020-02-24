package neuedu.jiekoutext;

public class Youpan implements Usb{

    @Override
    public void read() {
        System.out.println("读取数据");
    }

    @Override
    public void write() {
        System.out.println("写入数据");
    }
}
