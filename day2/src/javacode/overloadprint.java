package javacode;

import java.sql.SQLOutput;

public class overloadprint {
    public static void main(String[] args){
        byte a = 1;
        myPrint(a);
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }
}
