import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/12 15:27
 */
public class CountCharDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入任意一个字符串");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //遍历字符串，获取到每一个字符
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            Integer value = map.get(key);
            //返回值为null代表该字符在HashMao集合中不存在，就把该字符作为键，1作为值存入map集合中
            if (value == null) {
                map.put(key, 1);
            } else {
                value++;
                map.put(key,value);
            }
        }
        
        //遍历HashMap集合，得到键和值，按照要求进行拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            Integer value = map.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result=sb.toString();
        System.out.println(result);
    }
}
