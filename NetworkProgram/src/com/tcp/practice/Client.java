package com.tcp.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
//        Socket sk = new Socket(InetAddress.getByName("GAOYANGDEAIR"), 10012);
        Socket sk = new Socket("192.168.1.4", 10012);
        //获取输出流
        OutputStream os = sk.getOutputStream();
        os.write("hello world!".getBytes());

        //接收服务器反馈
        InputStream is = sk.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println(data);

        //释放资源
        sk.close();

    }
}
