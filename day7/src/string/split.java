package string;

public class split {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,ddd";
        String[] arr1 = str1.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("================");
        String str2 = "aaa bbb ccc ddd eee";
        String[] arr2 = str2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("================");
        String str3 = "XXX.YYY.ZZZ";
        String[] arr3 = str3.split("\\."); //不能使用 . 来切割，若要使用，需要使用 \\.
        System.out.println(arr3.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
