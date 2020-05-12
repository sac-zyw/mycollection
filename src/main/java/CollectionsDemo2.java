import set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: SAC
 * @Date: 2020/5/12 17:13
 */
public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student s1 = new Student("lingqingxia",30);
        Student s2 = new Student("wangzuxian",22);
        Student s3 = new Student("lingpingzhi",32);
        Student s4 = new Student("wangbadan",32);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //使用Collections对ArrayList集合排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
//                if (num==0){
//                    return o1.getName().compareTo(o2.getName());
//                }else {
//                    return num;
//                }
                int num2=num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });


        for (Student student : list) {
            System.out.println(student.getName()+":"+student.getAge());
        }
    }
}
