package file;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); //路径分隔符 Windows 和 Linux 是不一样的

        String separator = File.separator;
        System.out.println(separator);  //文件名称分隔符，Windows 和 Linux 是不一样的
    }
}
