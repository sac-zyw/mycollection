package set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: SAC
 * @Date: 2020/5/10 15:08
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("javase");


        for (String s : set) {
            System.out.println(s);
        }
    }
}
