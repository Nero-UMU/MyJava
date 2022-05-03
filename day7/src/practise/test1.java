package practise;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = fromArrToString(arr);
        System.out.println(str);
    }

    public static String fromArrToString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                str += "word" + arr[i] + "]";
            }else {
                str += "word" + arr[i] + "#";
            }
        }
        return str;
    }
}
