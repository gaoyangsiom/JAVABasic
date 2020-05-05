package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据步骤
        1.创建服务器Socket对象(ServerSocket)
        2.侦听客户端连接
        3.获取输入流，并把数据显示在控制台
        4.释放资源
 */
public class TCPAccept {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象(ServerSocket)
        ServerSocket serverSocket = new ServerSocket(10012);

        //侦听连接到此套接字并接受它
        Socket accept = serverSocket.accept();

        //获取输入流读取数据
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("数据是： " + data);

        //释放资源
        is.close();
        serverSocket.close();
    }
}
