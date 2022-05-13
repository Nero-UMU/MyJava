package fanxing;

public class generic3class1<O> implements generic3<O>{
    @Override
    public void method1(O o) {
        System.out.println("重写接口方法" + o);
    }
}
