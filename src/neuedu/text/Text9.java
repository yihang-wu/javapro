package neuedu.text;

import java.io.*;

public class Text9 {
    public static void main(String[] args) {
        /*
        * 复制一个文件MyTest12.java到a目录下
        * */
        File file =new File("d:\\MyTest12.java");
        File file1 =new File("d:\\a");
        if (!file1.exists()){
            file1.mkdirs();
        }
        File to =new File("d:\\a\\"+file.getName());
        InputStream inputStream=null;
        OutputStream outputStream=null;
        byte[] b = new byte[1024];
        try {
            inputStream = new FileInputStream(file);
            outputStream =new FileOutputStream(to);
            int len =inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len=inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null){
                    outputStream.close();
                }
                if (inputStream!=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
