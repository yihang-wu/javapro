package neuedu.jiekoutext;

public class Jianpan implements Usb {
    @Override
    public void read() {
        System.out.println("键盘通过usb方法读取数据");
    }

    @Override
    public void write() {
        System.out.println("键盘通过usb方法写入数据");
    }
}
