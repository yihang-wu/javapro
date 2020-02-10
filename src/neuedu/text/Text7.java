package neuedu.text;

import java.util.*;

public class Text7 {
    public static void main(String[] args){
    /*    List list =new ArrayList();
        list.add(1);
        list.add(1);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
     */




//        <Integer>泛型
      /*  Set<Integer> set = new HashSet();
//        Set set = new TreeSet();
//        Set set = new LinkedHashSet();
        set.add(1);
        set.add(123);
        set.add(100);
        set.add(1);
        set.add(15);
        set.add(13);
        set.add(1);
        for (Object obj : set){
            //sout快捷输出
            System.out.println(obj);
        }*/




     /* Persion persion = new Persion();
        System.out.println(persion.getAge());//没传值是null  要区分 0和null
        */


     /*
     //-128~127
        Integer a= 127;
        Integer b= 127;
        //.intValue()   拆包
        System.out.println(a.intValue()==b.intValue());
       */
     /*
        Map<String,String> map =new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("002","李丽四");
       // System.out.println(map.get("001"));//通过key拿    而不是通过下标      例子：身份证号
        Set <String> keys =map.keySet();//map.keySet(); 返回所有的key
        for (String key :keys){
            System.out.println(map.get(key));
        }
       */
     //控制台输出
        /*Scanner scanner= new Scanner(System.in);
        int a =scanner.nextInt();//如果不在控制台输入会形成阻塞(变量名调用nextxxx（）方法)
        String string = scanner.nextLine();
        System.out.println("a="+a+"string="+string);
        */
        /*
        String string = "123";
        int a =Integer.parseInt(string);//String 类型转成Int
        System.out.println(a);
        */

        /*
        try {
            int[] a = {1, 2, 3, 4};
            System.out.println(a[4]);//0,1,2,3       4出现数组越界
        }catch (Exception e){
            //e是内置参数
            System.out.println("出现异常了");
        }finally {

        }
        */
        String string=methd();
        System.out.println(string);
    }
    public static String methd(){
        try{
//            int q=100/0;
            return "abcd";//一个函数方法见return就结束    但是这里
        }catch (Exception e){
            return "efg";
        }finally {
            System.out.println("无论如何都执行");
        }
    }
}
