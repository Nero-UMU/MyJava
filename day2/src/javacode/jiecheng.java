package javacode;

public class jiecheng {
    public static void main(String[] args) {
        System.out.println(jie());
    }
    public static int jie(){
        int sum = 0;
        for (int i = 1; i <=100; i++)
        {
            sum += i;
        }
        return sum;
    }
}
