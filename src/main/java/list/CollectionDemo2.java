package list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: SAC
 * @Date: 2020/5/9 10:39
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(1,"javaee");
        list.remove(0);
        list.set(1,"javaweb");
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
