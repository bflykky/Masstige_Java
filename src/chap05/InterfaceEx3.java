package chap05;

interface Interface3 {
    void method(); //추상메소드는 앞에 public abstract가 고정임. 생략 가능.
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface3");
    }
}

class Cls3 implements Interface3 {
    @Override
    public void method() {
        System.out.println("method() in Cls3");
    }

    @Override
    public void newDefaultMethod() {
        Interface3.super.newDefaultMethod(); //인터페이스에 기존 구현되었던 메소드를 사용하기 위한 코드.
        System.out.println("newDefaultMethod() in Cls3");
    }
}
public class InterfaceEx3 {
    public static void main(String[] args) {
        Cls3 obj = new Cls3();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("-------------");

        Interface3 obj2 = new Cls3();
        obj2.method();
        obj2.newDefaultMethod();
    }
}