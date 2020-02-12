package com.neuedu.day07.demo01IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 11:19 上午
 * 文件复制
 */
public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {
        copyFile("/Users/xuanyu/Desktop/1.jpg","/Users/xuanyu/Desktop/JAVA/1.jpg");
    }

    public static void copyFile(String srcPath,String targetPath) throws IOException {
        long start = System.currentTimeMillis();
        //创建字节输入流
        FileInputStream fis = new FileInputStream(srcPath);
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream(targetPath);
        //使用数组缓冲多个字节
        byte[] bytes = new byte[2048];
        //每次读取的有效字节个数
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            System.out.println(len);
            //使用字节输出流的方法write，把读取到的文件写入到目的地的文件中
            fos.write(bytes,0,len);
        }
        //释放资源
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("共计耗时："+(end-start)+"ms");
    }

}
