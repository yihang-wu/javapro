package neuedu.text;

import java.io.*;

public class Text11 {
    public static void main(String[] args) {
        /*
        * 怎样将一个java对象保存到硬盘中
        *     OutputStream     ObjectOutputStream
        *     该java对象必须是可序列化对象
        *           io传输的只能是字节流和字符流，
        *           序列化：把一个对象转化成字节流或字符流的过程
        *           反序列化：把字节流或字符流转化为对象的过程
        *     如何让对象成为可序列化对象？
        *         在类上实现序列化接口   java.io.Serializable
        *         同时类上必须有一个序列化  UID
        *         UID:如果有两个不同的类，叫同一个名字，具有相同的属性，序列化UID可以区分它们
        *
        *      将序列化后的java对象读取出来
        *           ObjectInputStream  搭配  InputStream
        *
        * */
       /* Student student = new Student();
        student.setId(12306);
        student.setAge(12);
        student.setGrade("卓越一班");
        student.setName("yihang-wu");
        File file = new File("d:\\idea\\student");
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream=null;
        //用objectOutputStream写入到outputStream流，这个outputStream流 通向d:\idea\student文件
        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream =new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(student);//Object最大的类型传啥都行
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream!=null){
                    objectOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream!=null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
       /*
       * 用输入流把文件中的内用读出来，再反序列化
       * */
        File file = new File("d:\\idea\\student");
        InputStream inputStream = null;
        ObjectInputStream objectInputStream=null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            //(Student)强转
            Student student=(Student) objectInputStream.readObject();
            System.out.println(student);//默认的输出to string方法里的
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream!=null)
                objectInputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
