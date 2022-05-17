package yichang;

import java.io.IOException;

/*
自己处理异常
格式
try{
}catch(){
    异常处理逻辑，怎么处理
    把异常记录到日志中
}
*/
public class tryCatch {
    public static void main(String[] args) {
        try {
            readFile(null);
        }catch (NullPointerException e){
            System.out.println("没有");
            System.out.println("================");
            System.out.println(e.toString());
            System.out.println("================");
            System.out.println(e.getMessage());
            System.out.println("================");
//            e.printStackTrace();
        }
    }

    public static void readFile(String filename){
        if (filename==null){
            throw new NullPointerException("没有该文件");
        }
        System.out.println("打开了文件");
    }
}
