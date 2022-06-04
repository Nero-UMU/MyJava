package xulie;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos); //创建一个序列化对象
        Person ren = new Person("mua", 10);
        oos.writeObject(ren); //序列化对象

        fos.close();
        oos.close();
    }
}
