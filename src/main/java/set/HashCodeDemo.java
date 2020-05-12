package set;

/**
 * @Author: SAC
 * @Date: 2020/5/10 15:21
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",30);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
    }
}
