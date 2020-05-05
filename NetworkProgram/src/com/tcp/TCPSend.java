package com.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
    TCP发送数据的步骤
        1.创建客户端Socket对象(Socket)
        2.获取输出流，写数据
        3.释放资源
 */
public class TCPSend {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket socket = new Socket(InetAddress.getByName("GAOYANGDEAIR"), 10012);

        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("hello world!".getBytes());

        //释放资源
        socket.close();
    }
}
