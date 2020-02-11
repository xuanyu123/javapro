package com.neuedu.test.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xuanyu
 * @date 2020-02-10 3:20 下午
 * 定义一个类数组
 */
public class MainClass {

    List<MyBook> books = new ArrayList<>(200);
    int count = 0;

    /*
    * 添加函数menu()，输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
    1：添加图书
    2：删除图书
    3：查找图书（根据书名）
    4：退出当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束
    * */
    public MainClass() {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("成功退出系统，欢迎下次光临");
                break;
            }
            switch (choice) {
                case 1:
                    inputData();
                    break;
                case 2:
                    deleteName();
                    break;
                case 3:
                    searchName();
                    break;
                case 4:
                    printAllBook();
                    break;
                default:
                    System.out.println("输入非法");
                    printMenu();
                    continue;
            }
        }

    }

    /*
     * 打印菜单
     * */
    public void printMenu() {
        System.out.println("----欢迎----");
        System.out.println("1、添加图书");
        System.out.println("2、删除图书");
        System.out.println("3、查找图书");
        System.out.println("4、查看所有");
        System.out.println("5、退出系统");
        System.out.println("-----------");
        System.out.print("请输入编号：");
    }

    /*
     * 增加图书信息
     * 编写一个函数inputData(ArrayList<Mybook> books)，n为书的数量，从键盘上输入n本书的信息
     * */
    public void inputData() {
        if (count > books.size() - 1) {
            System.out.println("当前共有" + count + "本图书");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入书名：");
            String name = sc.next();
            System.out.print("请输入价格：");
            double price = sc.nextDouble();
            System.out.print("请输入出版社：");
            String press = sc.next();
            System.out.print("请输入作者：");
            String author = sc.next();
            System.out.print("请输入ISBN号：");
            String bookISBN = sc.next();
            MyBook mybook = new MyBook(name, price, press, author, bookISBN);
            books.add(mybook);
            count++;
            System.out.println("增加成功");
        } else {
            System.out.println("书库已满！");
        }
        printMenu();
    }

    /*
     * 打印所有图书信息
     * 编写一个函数print(ArrayList<Mybook> books)，输出全部书的信息。
     * */
    public void printAllBook() {
        for (int i = 0; i < count; i++) {
            MyBook mybook = (MyBook) books.get(i);
            System.out.println("第" + (i + 1) + "本书名：" + mybook.getName()
                    + "\t价格：" + mybook.getPrice() + "\t出版社：" + mybook.getPress()
                    + "\t作者：" + mybook.getAuthor() + "\tISBN号：" + mybook.getBookISBN());
        }
        System.out.println("当前共有" + count + "本图书");
        printMenu();
    }

    /*
     * 在程序1的基础上，增加查找功能，
     * 编写函数searchName(ArrayList<Mybook> books,String name)，
     * 根据书名name在数组books中查找是否存在此书，如果能找到，输出该书的详细信息，
     * 如果找不到，输出“此书不存在”。
     */
    public void searchName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要查找的书名：");
        String findName = sc.next();
        int id = nameFind(findName);
        if (id > -1) {
            MyBook mybook = (MyBook) books.get(id);
            System.out.println("第" + (id + 1) + "本书名：" + mybook.getName()
                    + ",价格：" + mybook.getPrice() + ",出版社：" + mybook.getPress()
                    + ",作者：" + mybook.getAuthor() + ",ISBN号：" + mybook.getBookISBN());
        } else {
            System.out.println("此书不存在");
        }
        printMenu();
    }

    /*
     * 增加删除功能，编写函数deleteName(ArrayList<Mybook> books,String name)，
     * 根据书名name在数组books中查找是否存在此书，
     * 如果存在，删除该书，并提示“此书删除成功。 ”并显示该书的详细信息。
     * 如果不存在，输出“没有此书，删除失败。”
     * */
    public void deleteName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入想要删除的书名：");
        String name = sc.next();
        int id = nameFind(name);
        if (id > -1) {
            books.remove(id);
            count--;
            System.out.println("此书删除成功。");
        } else {
            System.out.println("没有此书，删除失败。");
        }
        printMenu();
    }
    /*
    * 根据书名查找索引id
    * */
    public int nameFind(String name) {
        int id = -1;
        for (int i = 0; i < count; i++) {
            MyBook mybook = (MyBook) books.get(i);
            if (mybook.getName().equals(name)) {
                id = i;
                break;
            } else if (i < count) {
                continue;
            } else {
                System.out.println("未查找到您想要的书");
                break;
            }
        }
        return id;
    }
}
