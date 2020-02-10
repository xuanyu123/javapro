/**
 * @author xuanyu
 * @date 2020-02-09 3:19 下午
 */
public class Demo1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
