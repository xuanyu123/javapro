/**
 * @author xuanyu
 * @date 2020-02-09 3:07 下午
 * 懒汉式：真正使用的时候才会创建对象
 */
public class Singleton2 {
    //1.私有化构造方法
    private Singleton2() {
    }

    //2.创建一个私有并且静态的本类对象
    private static Singleton2 s = null;

    //3.创建一个公共的static方法返回该对象
    public static Singleton2 getInstance() {
        if (s == null) {
            s = new Singleton2();
        }
        return s;
    }
}
