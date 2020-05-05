package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    UDP接收数据的步骤
        1: 创建接收端的Socket对象(DatagramSocket)
        2: 创建一个数据包，用于接收数据
        3：调用DatagramSocket对象的方法接收数据
        4：解析数据包，并把数据在控制台显示
        5：关闭接收端
 */
public class UDPAccept {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);
        //调用DatagramSocket对象的方法接收数据
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        System.out.println(length);

        //解析数据包，并把数据在控制台显示
        byte[] data = datagramPacket.getData();

        String receiveData = new String(data, 0, length);
        System.out.println("接收到的数据： " + receiveData);

        //关闭接收端
        datagramSocket.close();
    }
}
