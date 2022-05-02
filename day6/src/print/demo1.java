package print;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kakaka");
        list.add("kukuku");
        list.add("gagaga");
        list.add("gugugu");

        System.out.println(list);
        printList(list);
    }
    public static void printList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.println(name + "}");
            } else{
                System.out.print(name + "@");
            }
        }
    }
}
