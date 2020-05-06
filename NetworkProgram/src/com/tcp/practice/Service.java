package com.tcp.practice;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象(ServerSocket)
        ServerSocket ssk = new ServerSocket(10012);

        //监听客户端链接，接收客户端Socket对象
        Socket sk = ssk.accept();

        //获取输入流，读数据，并把数据显示在控制台
        InputStream is = sk.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器接收到的数据： " + data);

        //给出反馈
        OutputStream os = sk.getOutputStream();
        os.write("数据已收到！".getBytes());

        //释放资源
        sk.close();
        ssk.close();
    }
}
