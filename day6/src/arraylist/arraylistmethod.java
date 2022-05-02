package arraylist;

import java.util.ArrayList;

public class arraylistmethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);


        boolean success = list.add("piapiapia~"); //add方法添加元素
        System.out.println(list);
        System.out.println("返回结果是" + success);
        list.add("biabiabia~");
        list.add("kuakuakua~");
        list.add("biangbianbgianb~");
        System.out.println(list);

        String word = list.get(2);
        System.out.println("索引为2的是" + word); //获取元素

        String move = list.remove(2);
        System.out.println("被删掉的是" + move);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合长度是" + size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
