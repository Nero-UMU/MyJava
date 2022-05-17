package yichang;

public class finallyCode {
    public static void main(String[] args) {
        try {
            readFile(null);
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally { //不论是否出错，都会执行
            System.out.println("资源释放");
        }
    }
    public static void readFile(String filename){
        if (filename==null){
            throw new NullPointerException("没有该文件");
        }
        System.out.println("打开成功");
    }
}
