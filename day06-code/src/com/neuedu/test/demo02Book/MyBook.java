package com.neuedu.test.demo02Book;

/**
 * @author xuanyu
 * @date 2020-02-10 2:48 下午
 * 定义一个类Mybook，包括成员name（书名String）、price（价格 double）、press（出版社String）、
 * author（作者 String）、bookISBN（书的ISBN号String），
 */
public class MyBook {
    private String name;
    private double price;
    private String press;
    private String author;
    private String bookISBN;

    public MyBook() {
    }

    public MyBook(String name, double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public void setBook(String name, double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }
}
