/**
 * @author xuanyu
 * @date 2020-02-08 5:08 下午
 * 打印九九乘法表
 */
public class Test{
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"x"+i+"="+i*j+"\t");// \t 跳到下一个TAB位置
            }
        }
    }
}
