package list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: SAC
 * @Date: 2020/5/9 10:39
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
//todo 并发修改异常，迭代器遍历时不能修改集合
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            if (it.next().equals("world")){
//                list.add("javaee");
//            }
//        }

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals("world")) {
                list.add("javaee");
            }
        }
        System.out.println(list);

        int[] arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
