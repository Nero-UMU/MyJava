package system;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1(){
        //currentTimeMillis方法获取当前的时间
        long s = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("总共用时" + (e-s) + "毫秒");
    }

    public static void method2(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //arraycopy复制数组的指定的元素
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
