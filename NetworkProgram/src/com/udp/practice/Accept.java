package com.udp.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接收数据
        因为接收端不知道发送端什么时候停止发送数据，采用死循环
 */
public class Accept {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket datagramSocket = new DatagramSocket(12345);

        while (true){
            //创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象的方法接受数据
            datagramSocket.receive(datagramPacket);

            //解析数据包，并将数据在控制台上显示
            System.out.println("数据是： " + new String(datagramPacket.getData(), 0, datagramPacket.getLength()));


        }
    }
}
