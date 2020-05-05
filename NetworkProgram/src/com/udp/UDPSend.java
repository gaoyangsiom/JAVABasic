package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    UDP发送数据的步骤
        1:创建发送端的Socket对象(DatagramSocket)
        2:创建数据，并把数据打包
        3:调用DatagramSocket对象的方法发送数据
        4:关闭发送端
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket datagramSocket = new DatagramSocket();

        //创建数据，并把数据打包
        byte[] bys = "hello world!".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length, InetAddress.getByName("GAOYANGDEAIR"), 10086);

        //调用DatagramSocket对象的方法发送数据
        datagramSocket.send(datagramPacket);
        //关闭发送端
        datagramSocket.close();
    }
}
