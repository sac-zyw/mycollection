package map;

import set.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/12 14:54
 */
public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("王祖贤",11);
        Student s3 = new Student("修改西",22);

        map.put("001",s1);
        map.put("002",s2);
        map.put("003",s3);

        Set<String> set = map.keySet();
        for (String key : set) {
            Student value = map.get(key);
            System.out.println(key+":"+value);
        }

        System.out.println("----------------------");

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
