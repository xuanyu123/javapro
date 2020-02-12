package com.neuedu.day07.demo01IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author xuanyu
 * @date 2020-02-12 11:54 上午
 * 一次写入多个字节的方法
 *  void	write(byte[] b)
 *       将 b.length 个字节从指定的 byte 数组写入此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建一个FileOutputStream对象
        FileOutputStream fos = new FileOutputStream("/Users/xuanyu/Desktop/javapro/day07-code/src/com/neuedu/day07/demo01IO/a.txt");
        //调用FileOutPutStream对象中的write方法
        //写数据的时候会把十进制的整数65，转换为二进制整数65
        fos.write(65);

        /*
        * 一次写入多个字节
        *    如果写的第一个字节是正数（0-127），那么显示的时候回查询ASCII表
        *    如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
        * */
        byte[] b = {65,66,67,68,69};
        byte[] b1 = {-65,-66,-67,68,69};
        fos.write(b);
        fos.write(b1);
        /*
        * void	write(byte[] b, int off, int len)
        *       将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        *   int off:数组的开始索引
        *   int len:写几个字节
        * */
        fos.write(b,1,2);
        //String类的getBytes可以将字符串转换为字节数组，而且还可以指定编码
        //GBK中两个字节为一个中文，UTF-8中三个字节为一个中文
        byte[] b3 = "东软".getBytes("GBK");
        System.out.println(Arrays.toString(b3));//[-74, -85, -56, -19]
        fos.write(b3);

        //释放资源
        fos.close();
    }
}
