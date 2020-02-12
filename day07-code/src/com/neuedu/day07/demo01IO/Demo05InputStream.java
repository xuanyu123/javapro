package com.neuedu.day07.demo01IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 4:49 下午
 * 字节输入流一次读取多个字节
 */
public class Demo05InputStream {
    public static void main(String[] args){
        //创建一个FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = null;
        //调用FileInputStream对象中的read读取文件
        //int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));*/
        /*
        * while循环
        * */
        try {
            fis = new FileInputStream("day07-code/src/com/neuedu/day07/demo01IO/b.txt");
            byte[] bytes = new  byte[20];//存储读取到的多个字节
            int len=0; //记录读取到的有效字节个数
            while ((len=fis.read(bytes))!=-1) {
                //转换有效的字节个数
                System.out.println("读取的字节数"+len);
                System.out.println(new String(bytes, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            //释放资源
            try {
                if (fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
