package neuedu.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    //public static Mybook [] books= new Mybook[200];//定义一个类数组   本题无用
    public static List<Mybook> list= new ArrayList<>();//定义一个类集合
    public static void main(String[] args) {
            inputdata(list);//把list传进去     把书放进去
//            searchName(list,"0");
            addName(list);
        print(list);
    }
    public static void  inputdata(List<Mybook> books){
            Scanner scanner=new Scanner(System.in);
            int n =scanner.nextInt();//自己输入多少本书
            for (int i=1;i<=n;i++){
                Mybook mybook =new Mybook("java"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"wu"+i,"版号"+i);
                books.add(mybook);//放到集合里
            }
    }
    public  static void print(List<Mybook> books){  //   输出书
            for (int i=0;i<=books.size();i++){
                System.out.println(books.get(i));//books.get(i)存的是地址
            }
    }
    //查找功能
    public static void searchName(List<Mybook> books,String name){
            for (int i=0;i<books.size();i++){
                //字符串的比较用equlals方法
                Mybook mybook=books.get(i);
                if(mybook.getName().equals(name)){
                    System.out.println(books);   //找到
                    return;
                }
            }
            System.out.println("没找到");//没找到书
    }
    //删除     要先找到才能删除
    public static void deleteName(List<Mybook> books,String name){
        for (int i=0;i<books.size();i++){
            Mybook mybook=books.get(i);
            if(mybook.getName().equals(name)){
                books.remove(i);//i是下标
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没找到");//没找到书
    }
    public static void  addName(List<Mybook> books){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入书名");
        String name = scanner.next();
        System.out.println("输入价格");
        Double price=scanner.nextDouble();
        System.out.println("输入出版社");
        String press = scanner.next();
        System.out.println("输入作者");
        String auther = scanner.next();
        System.out.println("输入版号");
        String bookISBL =scanner.next();
        Mybook mybook=new Mybook(name,price,press,auther,bookISBL);
    }
}
