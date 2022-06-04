package xulie;

import java.io.*;
import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(new Person("bia", 12));
        arr.add(new Person("pia", 13));
        arr.add(new Person("kua", 14));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        oos.writeObject(arr);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        Object o = ois.readObject();
        ArrayList<Person> per = (ArrayList<Person>) o;
        for (Person person : per) {
            System.out.println(person);
        }
        ois.close();
    }
}
