package chap05;

interface Interface5 {
    void method();
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface5");
    }
}

class SuperCls {
    public void newDefaultMethod() {
        System.out.println("newDefaultMethod() in SuperCls");
    }
}

class Cls5 extends SuperCls implements Interface5 {
    @Override
    public void method() {
        System.out.println("method() in Cls5");
    }
}

public class InterfaceEx5 {
    public static void main(String[] args) {
        Cls5 obj = new Cls5();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("-----------------");

        Interface5 obj2 = new Cls5();
        obj2.method();
        obj2.newDefaultMethod();

        System.out.println("알 수 있는 규칙: 클래스가 항상 우선권을 가진다.");
    }
}
