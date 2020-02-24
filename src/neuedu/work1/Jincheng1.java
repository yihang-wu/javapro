package neuedu.work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Jincheng1 {
    public static void main(String[] args) {
        ServerSocket serverSocket;

        {
            try {
                serverSocket = new ServerSocket(9999);
                // 该方法为阻塞 等待客户端连接
                Socket socket = serverSocket.accept();
                System.out.println("客户端已连接");
                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String string = bufferedReader.readLine();
                while(true){
                    System.out.println("客户端说:"+string);
                    string = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
