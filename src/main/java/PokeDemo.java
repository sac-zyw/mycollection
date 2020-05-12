import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: SAC
 * @Date: 2020/5/12 17:41
 */
public class PokeDemo {
    /**
     * 1.建一个牌组，用ArrayList集合存储
     * 2.向牌组中装牌
     * 3.洗牌，用shuffle打乱牌组顺序
     * 4.发牌，遍历集合
     * 5.看牌，遍历三个玩家的集合
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String[] colors = {"♠", "♣", "♦", "♥"};
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String n : num) {
                list.add(color+num);
            }
        }

        list.add("大王");
        list.add("小王");

        Collections.shuffle(list);
        System.out.println(list);
    }
}
