package chap05;

interface Interface9 {
    void method();
    //private void privateAbstractMethod(); private 메소드는 인터페이스 내에 구현되어야 함.
    //private default void privateDefaultMethod() {} // default 메소드의 접근지정자는 public으로 고정.

    default void defaultMethod1() {
        privateMethod1();
    }

    default void defaultMethod2() {
        System.out.println("Default Method in Interface9");
    }

    private void privateMethod1() {
        System.out.println("Private Method1 in Interface9");

        privateMethod2();
        defaultMethod2();
        method();
    }

    private void privateMethod2() {
        System.out.println("Private Method2 in Interface9");
    }
}

class Cls9 implements Interface9 {
    @Override
    public void method() {
        System.out.println("method() in Cls9");
    }
}

public class InterfaceEx9 {
    public static void main(String[] args) {
        Cls9 a = new Cls9();
        a.method();
        System.out.println("--------");
        a.defaultMethod1();
    }
}
