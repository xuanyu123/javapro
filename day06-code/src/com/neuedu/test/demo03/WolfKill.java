package com.neuedu.test.demo03;

import org.w3c.dom.ls.LSInput;

import java.util.*;

/**
 * @author xuanyu
 * @date 2020-02-13 9:03 上午
 */
public class WolfKill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接受游戏人数
        System.out.print("请输入玩家游戏人数：");
        int player = sc.nextInt();
        if (player<12||player>18){
            System.out.println("不符合游戏人数");
        }else {
            /*
            * 定义3个List
            * 1、发牌的列表
            * 2、发完牌的列表
            * 3、底牌列表
            * */
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> bottom = new ArrayList<>();
            init(all);
            diffInit(all,player);
            //盗贼一定在游戏牌中，总牌中移除盗贼，放入游戏牌中
            all.remove("盗贼");
            play.add("盗贼");
            boottomCards(all,bottom);
            //将放完底牌的总牌，全部放入游戏牌中
            play.addAll(all);
            //将游戏牌打乱顺序
            Collections.shuffle(play);
            System.out.println("玩家手牌为：");
            String outplay[] = new String[play.size()];
            for (int i = 0; i < play.size(); i++) {
                outplay[i] = (i+1)+"："+play.get(i);
            }
            System.out.println(Arrays.toString(outplay));

            /*System.out.print("{");
            for (int i = 0; i < play.size()-1; i++) {
                System.out.print((i+1)+"："+play.get(i)+",");
            }
            System.out.print(play.size()+":"+play.get(play.size()-1));
            System.out.println("}");*/

            System.out.println("盗贼底牌为：");
            System.out.print("{");
            for (int i = 0; i < bottom.size()-1; i++) {
                System.out.print((i+1)+"："+bottom.get(i)+",");
            }
            System.out.print(bottom.size()+":"+bottom.get(bottom.size()-1));
            System.out.println("}");
        }
    }
    //游戏初始化12个人
    public static void init(List<String> list){
        //循环添加4个狼人
        for (int i = 0; i < 4; i++) {
            list.add("狼人");
        }
        //循环添加4个村民
        for (int i = 0; i < 4; i++) {
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //根据不同的游戏人数,初始化不同的牌
    public static void diffInit(List<String> list,int player){
        if (player>12)
            list.add("村民");
        if (player>13)
            list.add("替罪羊");
        if (player>14)
            list.add("狼人");
        if (player>15)
            list.add("村民");
        if (player>16)
            list.add("村民");
        if (player>17)
            list.add("吹笛者");
    }
    //从总牌中随机拿出3张作为底牌
    public static void boottomCards(List<String> list,List<String> bottom){
        //狼人数应当小于等于1
        while (bottom.size()<3){
            //取list的一个随机下标
            Random random = new Random();
            int index = random.nextInt(list.size());
            if (bottom.contains("狼人")&&list.get(index).equals("狼人"))
                continue;
            else
                bottom.add(list.remove(index));
        }
    }
}
