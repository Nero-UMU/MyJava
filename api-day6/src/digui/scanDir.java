package digui;

import java.io.File;

public class scanDir {
    public static void main(String[] args) {
        File dir = new File("/home");
        viewDir(dir);
    }

    public static void viewDir(File dir){
        File[] arr = dir.listFiles();
        assert arr != null;
        for (File file : arr) {
            if (file.isDirectory()){
                viewDir(file);
            }else {
                String name = file.getName();
                if (name.endsWith(".java")){
                    System.out.println(name);
                }
            }
        }
    }
}
