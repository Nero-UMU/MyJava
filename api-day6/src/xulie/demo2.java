package xulie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt")); //创建读取对象
        Object o = ois.readObject(); //读取对象
        ois.close();
        Person ren = (Person) o;
        System.out.println(ren);
    }
}
