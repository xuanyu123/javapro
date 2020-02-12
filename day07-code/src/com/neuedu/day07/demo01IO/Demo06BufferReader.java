package com.neuedu.day07.demo01IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 5:42 下午
 */
public class Demo06BufferReader {
    public static void main(String[] args) throws IOException {
        //1、创建FileReader对象
        FileReader fr = new FileReader("day07-code/src/com/neuedu/day07/demo01IO/b.txt");
        //2、调用FileReader对象中的reade方法
/*        int len = 0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }*/

        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        while (str!=null){
            System.out.println(str);
            str = br.readLine();
        }
        //3、释放资源
        fr.close();
    }
}
