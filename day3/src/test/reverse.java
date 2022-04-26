package test;

public class reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
