package chap05;

interface Interface1 {
    void method(); //추상메소드는 앞에 public abstract가 고정임. 생략 가능.
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface1");
    }
}

class Cls1 implements Interface1 {
    @Override
    public void method() {
        System.out.println("method() in Cls1");
    }
}
public class InterfaceEx1 {
    public static void main(String[] args) {
        Cls1 obj = new Cls1();
        obj.method();
        obj.newDefaultMethod();
    }
}
