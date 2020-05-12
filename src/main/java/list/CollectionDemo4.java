package list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: SAC
 * @Date: 2020/5/9 10:39
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("hello");
        arr.add("world");
        arr.add("java");

        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("---------");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
