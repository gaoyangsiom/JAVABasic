package com.tcp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadService {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象(ServerSocket)
        ServerSocket ssk = new ServerSocket(10012);

        while (true){
            //监听客户端连接，湖区客户端Socket对象
            Socket sk = ssk.accept();

            //接收客户端数据，为每个客户端开启一个线程
            new Thread(new ServerThread(sk)).start();
        }
    }
}
