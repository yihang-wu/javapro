package neuedu.web;

import neuedu.pojo.Anlimal;
import neuedu.service.AnlimalService;
import neuedu.service.IanlimalService;

import java.util.List;
import java.util.Scanner;

public class AnlimalWeb {
    //service层如果还没写可以先用接口
//    AnlimalService anlimalService = new AnlimalService();
    //他的实现还没写，可以先等于空
//    IanlimalService anlimalService=null;
    IanlimalService anlimalService= new AnlimalService();
    public void showmain(){
        System.out.println("---------------");
        System.out.println("1----------查询");
        System.out.println("2----------添加");
        System.out.println("3----------修改");
        System.out.println("4----------删除");
        System.out.println("5----------退出");
        System.out.println("---------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        if(i==1){
            querry();
        }else if(i==2){
//            System.out.println("添加");
            add(scanner);
        }else if(i==3){
//            System.out.println("修改");
            update(scanner);
        }else if(i==4){
//            System.out.println("删除");
            del(scanner);
        }else {
            System.exit(0);//结束进程
        }
    }
    public void querry(){
        // 在此要调用 服务层提供的方法来去访问数据库
//        System.out.println("查询方法");
        List<Anlimal> list = anlimalService.querry();
        for(Anlimal anlimal:list){
            System.out.println(anlimal);
        }
    }
    public void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-公 0-母");
        int sex = scanner.nextInt();
        Anlimal anlimal = new Anlimal(name,age,sex);//通过构造方法赋值
        //调用服务层，添加该数据
        anlimalService.add(anlimal);
        //显示列表
        querry();
    }
    public void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要修改的性别 1-公 0-母");
        int sex = scanner.nextInt();
        Anlimal anlimal = new Anlimal(id,name,age,sex);
        //调服务层方法
        anlimalService.update(anlimal);
        //显示列表
        querry();
    }
    public void del(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        //调用服务层
        anlimalService.del(id);
        //显示列表
        querry();
    }
}
