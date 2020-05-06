package com.tcp.practice;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket sk = new Socket("192.168.1.4", 10012);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("InetAddressDemo.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        sk.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器反馈为： " + data);

        //释放资源
        br.close();
        sk.close();

    }
}
