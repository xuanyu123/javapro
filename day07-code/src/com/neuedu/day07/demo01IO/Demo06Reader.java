package com.neuedu.day07.demo01IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 5:42 下午
 */
public class Demo06Reader {
    public static void main(String[] args) throws IOException {
        //1、创建FileReader对象
        FileReader fr = new FileReader("day07-code/src/com/neuedu/day07/demo01IO/b.txt");
        //2、调用FileReader对象中的reade方法
/*        int len = 0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }*/

        char[] cs = new char[10];//存储读取到的多个字符
        int len = 0;//记录每次读取的有效字符个数
        while ((len = fr.read(cs))!=-1){
            System.out.println("读取的字符数："+len);
            System.out.println(new String(cs,0,len));
        }
        //3、释放资源
        fr.close();
    }
}
