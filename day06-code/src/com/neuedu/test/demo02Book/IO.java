package com.neuedu.test.demo02Book;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author xuanyu
 * @date 2020-02-12 9:36 上午
 */
public class IO {
    //读取文件到内存
    public void load(MainClass mainClass) {
        String filename = "/Users/xuanyu/Desktop/javapro/day06-code/src/com/neuedu/test/demo02Book/book.txt";
        File file = new File(filename);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String name = temp.split("，")[0];
                String pricestr = temp.split("，")[1];
                String press = temp.split("，")[2];
                String author = temp.split("，")[3];
                String bookISBN = temp.split("，")[4];
                double price = Double.parseDouble(pricestr);
                MyBook mybook = new MyBook(name, price, press, author, bookISBN);
                mainClass.books.add(mybook);
                mainClass.count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader!=null){
                    bufferedReader.close();
                }
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //写入到文件
    public void save(MainClass mainClass){
        String filename = "/Users/xuanyu/Desktop/javapro/day06-code/src/com/neuedu/test/demo02Book/book.txt";
        String allbook = "";
        for (int i = 0; i < mainClass.books.size(); i++) {
            MyBook myBook = (MyBook)mainClass.books.get(i);
            String temp = myBook.getName()+"，"+myBook.getPrice()+"，"
                    +myBook.getPress()+"，" +myBook.getAuthor()+"，"
                    +myBook.getBookISBN()+"\r";
            allbook  += temp;
        }
        FileWriter fr = null;
        try {
            File file1 = new File(filename);
            fr = new FileWriter(file1);
            fr.write(allbook);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
