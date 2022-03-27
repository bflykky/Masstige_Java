package chap05;

interface Interface2 {
    void method(); //추상메소드는 앞에 public abstract가 고정임. 생략 가능.
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface2");
    }
}

class Cls2 implements Interface2 {
    @Override
    public void method() {
        System.out.println("method() in Cls2");
    }

    @Override
    public void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Cls2");
    }
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        Cls2 obj = new Cls2();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("--------------");
        Interface2 obj2 = new Cls2();
        obj2.method();
        obj2.newDefaultMethod();
    }
}