package yichang;

public class demoThrow1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr, 2);
        System.out.println(e);
    }

    public static int getElement(int[] arr,int index){
        if (arr == null){
            throw new NullPointerException("传递的数组是null");
        }
        if (index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("索引超出范围");
        }
        int ele = arr[index];
        return ele;
    }
}
