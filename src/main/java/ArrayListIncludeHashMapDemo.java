import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/12 15:07
 */
public class ArrayListIncludeHashMapDemo {
    /**
     * 创建一个ArrayList集合 
     * 存储键值都是String类型的HashMap集合
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("孙策","大乔");
        hm.put("西瓜","菠萝");
        hm.put("青菜","莴苣");

        array.add(hm);

        //遍历 ArrayList集合
        for (HashMap<String, String> map : array) {
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key+":"+value);
            }
        }
    }
}
