package lambda;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<person> arr = new ArrayList<>();
        arr.add(new person("王八", 28));
        arr.add(new person("炸街", 18));
        arr.add(new person("拔丝", 38));

        arr.sort(new Comparator<person>() {
            @Override
            public int compare(person person, person t1) {
                return person.getAge() - t1.getAge();
            }
        });

        arr.sort((person, t1) -> person.getAge() - t1.getAge());

        System.out.println(arr);
    }
}
