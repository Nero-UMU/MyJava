package zengqiangfor;

/*
增强for循环，用来遍历集合和数组
格式
for(集合/数组的数据类型 变量名:集合/数组){
}
 */

public class demo {
    public static void main(String[] args) {
        demo1();
    }
    public static void demo1(){
        int[] arr = {1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
