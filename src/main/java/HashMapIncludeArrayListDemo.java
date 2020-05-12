import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/12 15:15
 */
public class HashMapIncludeArrayListDemo {
    /**
     * 创建一个HashMap集合
     * 每一个键值对元素的键是String，值是ArrayList
     * ArrayList中存储的都是String类型
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        ArrayList<String> list = new ArrayList<String>();

        list.add("香蕉");
        list.add("菠萝");
        list.add("柚子");

        map.put("水果",list);

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            ArrayList<String> value = map.get(key);
            for (String s : value) {
                System.out.println(s);
            }
        }
    }
}
