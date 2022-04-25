package javacode;

public class array {
    public static void main(String[] args) {
        int[] arrA = new int[10];
        for (int i = 0; i < 10; i++){
            arrA[i] = 1;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arrA[i]);
        }
        String[] arrB = new String[] {"hello", "world", "Java"};
        for (int i = 0; i < 3; i++)
        {
            System.out.println(arrB[i]);
        }

        int[] arrC = { 1, 2, 3};
        for (int i = 0; i < 3; i++){
            System.out.println(arrC[i]);
        }
    }
}

