package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/12 14:15
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();

        map.put("s1","土豆");
        map.put("s2","西瓜");
        map.put("s3","芝麻");
        map.put("s4","香蕉");
        map.put("s5","萝卜");

        /**
         * 遍历map集合的方式一：先获取key的集合，再遍历key获取到value
         */
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("-----------------------");
        /**
         * 遍历map集合的方式一：先获取key的集合，再遍历key获取到value
         */

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }


    }
}
