package neuedu.text;

import java.io.*;

public class Text10 {
    public static void main(String[] args) {
        /*int a=10;
        Student student = new Student();
        student.setId(12306);
        student.setAge(12);
        student.setGrade("卓越一班");
        student.setName("yihang-wu");*/
        /*
        * getName()  获取文件的文件名
        * exists()   查看文件是否存在
        * Length()   获取文件的大小
        * getPath()   获取文件的路径  无论真实的有没有都都获取写的这个File file =new File("d:\\Test.java");
        * createNewFile()创建新的文件，返回boolen ，如果文件不存在则创建，如果存在则不再创建
        *                  它的方法上带着异常，调用方要处理异常try catch
        * mkdir()   创建目录   只创建目录的最后一级，必须保证父目录存在
        * mkdirs()  创建目录   创建目录的任意一级，只要不存在就会创建
        * delete()  删除文件
        * isDirectory() 判断是否是目录  是true 不是false
        * isFile()      判断是否是文件
        * */

        File file =new File("d:\\Test.java");
       /* System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.mkdirs());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        //字节流写
      /*  try {
            OutputStream outputStream = new FileOutputStream(file,true);//OutputStream 抽象类的不能实例化，要new他的子类
            String b = "\nasdfghjkl";
            //write 方法传了b.getBytes()后也有异常需要处理
            outputStream.write(b.getBytes());//传一个byte数组  全传
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
      //字节流读
       /* InputStream inputStream =null;
        try {
            inputStream = new FileInputStream(file);
            byte[] b =new byte[10];
            int c =inputStream.read(b);
            while (c!=-1){
                System.out.println("读取的字节数:"+c);
                System.out.println(new String(b,0,c));//截取的从0开始到c结束
//                System.out.println(new String(b));
                c=inputStream.read(b);
            }
//            System.out.println(inputStream.read(b));
//            inputStream.close();
//            System.out.println(new String(b));
            //inputStream.read(b);//传数组直接读一个100字节的数组的数据   返回值int 真正是读了多少数据；没有数据返回-1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null){ //如果inputStream = new FileInputStream(file);报错inputStream为空指针，调方法报错
                    inputStream.close();//关闭流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
       //字符流读
     /*   char[] a =new char[10];
        Reader reader = null;//作用域
        try {
            reader = new FileReader(file);
//            Reader reader =new FileReader(file);
            int b = reader.read(a);//读到的个数
            while(b!=-1){//b!=-1可以一直读
                System.out.println("读到字符数："+b);
                System.out.println(new String(a,0,b));
                b = reader.read(a);//更新b的值
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
//         字符输入流
    /*    Reader reader = null;//作用域
        BufferedReader br = null;
        //后进先出 BufferedReader 要先关掉
        try {
            reader = new FileReader(file);
            br =new BufferedReader(reader);
            String str=br.readLine();//返回的是String
            while (str!=null){
                System.out.println(str);
                str=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        //字符输出流
        Writer writer=null;
        try {
            writer =new FileWriter(file,true);
            writer.write("\neqwr");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
