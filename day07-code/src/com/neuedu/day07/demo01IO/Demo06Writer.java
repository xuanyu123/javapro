package com.neuedu.day07.demo01IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author xuanyu
 * @date 2020-02-12 5:42 下午
 */
public class Demo06Writer {
    public static void main(String[] args) throws IOException {
        //1、创建FileWriter对象
        FileWriter fw = new FileWriter("day07-code/src/com/neuedu/day07/demo01IO/b.txt");

        //2、调用FileWriter对象中的write方法
        String str = "欢迎光临";
        fw.write(str);
        //将内存缓冲区中的数据，刷新到文件中
        fw.flush();
        //刷新之后还可以继续使用
        fw.write(100);
        //3、释放资源
        fw.close();
        //close方法之后，流已经从内存中关闭了
    }
}
