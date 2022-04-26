package test;

import java.util.Arrays;

public class morearray {
    public static void main(String[] args) {
        int[] arrA = new int[] {1,2,3,4,5};
        System.out.println(arrA.length);
        int[] arrB = new int[9];
        System.out.println(arrB.length);
        System.out.println(arrB);
        arrB = new int[]{10,34,65,410};
        System.out.println(arrB.length);
        System.out.println(arrB); //前后不是一个数组

        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrB[i]);
        }
    }
}
