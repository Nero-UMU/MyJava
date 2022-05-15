package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1234);
        arr1.add(2245143);
        arr1.add(63425);
        Collections.sort(arr1);
        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("abc");
        arr2.add("4r43r");
        arr2.add("a3bc14");
        Collections.sort(arr2);
        System.out.println(arr2);

        ArrayList<Person> per = new ArrayList<>();
        per.add(new Person("张三", 143143));
        per.add(new Person("李四", 424));
        per.add(new Person("王五", 303452));
        per.add(new Person("赵六", 23440));
        System.out.println(per);
        Collections.sort(per);
        System.out.println(per);

        ArrayList<Person> son = new ArrayList<>();
        son.add(new Person("王师傅", 35));
        son.add(new Person("刘师傅", 17));
        son.add(new Person("张师傅", 28));
        System.out.println(son);
        Collections.sort(son, new Comparator<Person>() { //重写了Comparator接口的compare方法
            @Override
            public int compare(Person t1, Person t2) {
                return t1.getAge() - t2.getAge();
            }
        });
        System.out.println(son);
    }
}
