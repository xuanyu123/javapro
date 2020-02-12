package com.neuedu.day07.demo01IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 3:40 下午
 *
 * 追加写：使用两个参数的构造方法
 */
public class Demo03OuputStream {
    public static void main(String[] args){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day07-code/src/com/neuedu/day07/demo01IO/b.txt", true);
            byte[] b = "东软".getBytes();
            byte[] b1 = "\r".getBytes();
            for (int i = 0; i < 5; i++) {
                fos.write(b);
                fos.write(b1);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //判断是否为空指针
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
