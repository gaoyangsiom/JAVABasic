package com.udp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    UDP发送数据:
        数据来自键盘输入，直到输入的数据是886，发送数据结束
 */
public class Send {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket datagramSocket = new DatagramSocket();
        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null){
            if("886".equals(line)) break;

            //创建数据，并把数据打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("GAOYANGDEAIR"), 12345);

            //调用DatagramSocket对象的方法发送数据
            datagramSocket.send(dp);

        }

        //关闭发送端
        datagramSocket.close();
    }
}
