package chap05;

interface Interface7 {
    void method();
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface7");
    }
}

interface AnotherInterface2 {
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in AnotherInterface2");
    }
}

class Cls7 implements Interface7, AnotherInterface2 {
    @Override
    public void method() {
        System.out.println("method() in Cls7");
    }
    @Override
    public void newDefaultMethod() {
        Interface7.super.newDefaultMethod();
        AnotherInterface2.super.newDefaultMethod();
        System.out.println("newDefaultMethod() in Cls7");
    }
}

public class InterfaceEx7 {
    public static void main(String[] args) {
        Cls7 obj = new Cls7();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("-----------------");

        Interface7 obj2 = new Cls7();
        obj2.method();
        obj2.newDefaultMethod();

        System.out.println("-----------------");

        AnotherInterface2 obj3 = new Cls7();
        //obj3.method();
        obj3.newDefaultMethod();
    }
}
