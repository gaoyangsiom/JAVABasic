package com.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类标识Internet协议(IP)地址

     public static InetAddress getByName(String host): 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
     public string getHostName(): 获取此IP地址主机名
     public string getHostAddress():返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host): 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        InetAddress address = InetAddress.getByName("GAOYANGDEAIR");

        //public string getHostName(): 获取此IP地址主机名
        String hostName = address.getHostName();

        //public string getHostAddress():返回文本显示中的IP地址字符串
        String hostAddress = address.getHostAddress();

        System.out.println("主机名称：" + hostName);
        System.out.println("IP地址： " + hostAddress);
    }
}
