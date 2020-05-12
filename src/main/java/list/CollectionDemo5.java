package list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: SAC
 * @Date: 2020/5/9 10:39
 */
public class CollectionDemo5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        linkedList.addFirst("javase");
        System.out.println(linkedList);

    }
}
