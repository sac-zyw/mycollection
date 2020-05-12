package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: SAC
 * @Date: 2020/5/7 21:40
 */
/*
创建collection集合的对象
多态的方式
ArrayList()
*/

public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建collection集合的对象
        Collection<String> c=new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
                System.out.println(it.next());
        }


    }
}
