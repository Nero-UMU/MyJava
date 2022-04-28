package demo1;

public class fengzhuang {
    public static void main(String[] args) {
        int[] arr = {3,53,56,245,654};
        int max = getMax(arr);
        System.out.println("最大值" + max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
}
