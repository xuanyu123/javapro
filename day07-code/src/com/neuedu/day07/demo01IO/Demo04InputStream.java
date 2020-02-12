package com.neuedu.day07.demo01IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 4:16 下午
 */
public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象
        FileInputStream fis = new FileInputStream("day07-code/src/com/neuedu/day07/demo01IO/b.txt");
        //使用FileInputStream对象中的方法read，读取文件
        //int read() 读取文件中的一个字节并返回，读取到文件的末尾返回-1
        /*int len = fis.read();
        System.out.println(len);//97

        len = fis.read();
        System.out.println(len);//98

        len = fis.read();
        System.out.println(len);//99

        len = fis.read();
        System.out.println(len);//-1*/
        /*
        * while循环结束条件，读取到-1的时候结束
        * */
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.println((char)len);
        }
        //释放资源
        fis.close();
    }
}
