package yichang;

import java.nio.file.FileSystemNotFoundException;

public class throwGuanjianzi {
    public static void main(String[] args) {
        read("a.txt");
    }

    public static void read(String filename){
        if (!filename.equals("a.txt")){
            throw new FileSystemNotFoundException("传递的文件不存在!");
        }
        System.out.println("读取文件");
    }
}
