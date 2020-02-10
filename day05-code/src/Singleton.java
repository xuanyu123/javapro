/**
 * @author xuanyu
 * @date 2020-02-09 3:00 下午
 * 单例设计模式
 * 饿汉式：类加载的时候就创建对象
 */
public class Singleton {
    //1.私有化构造方法
    private Singleton() {
    }

    //2.创建一个私有并且静态的本类对象
    private static Singleton s = new Singleton();

    //3.创建一个公共的static方法返回该对象
    public static Singleton getInstance() {
        return s;
    }
}
