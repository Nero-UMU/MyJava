package arrFunc;

/*
public static String toString(数组)将参数数组变成字符串
public static void sort(数组)按照默认升序对数组的元素排序
 */

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[] intArr = {10,20,30};
        String intStr = Arrays.toString(intArr);
        System.out.println(intStr);

        int[] arr1 = {2,3,5,1,6,1,2,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"ddd","ccc","aaa","bbb"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
