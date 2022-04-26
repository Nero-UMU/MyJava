package test;

public class printfun {
    public static void main(String[] args) {
        int[] arrA = new int[] {1,2,3,4,5};
        printArr(arrA);
        System.out.println("===========");
        int[] arrB = new int[] {3,5,1,5,67,8,25,24};
        printArr(arrB);

        int[] result = calc(5,6,7);
        System.out.println("总和:" + result[0]);
        System.out.println("平均数:" + result[1]);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] calc(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] arr= { sum, avg};
        return arr;
    }
}
