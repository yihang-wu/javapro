package neuedu.work1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Jincheng2 {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1",9999);
            System.out.println("已连接服务器端");
            Scanner scanner =new Scanner(System.in);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            while(true){
                String string = scanner.nextLine();
                printStream.println(string);
                printStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
