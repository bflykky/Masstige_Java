package chap05;

interface Interface6 {
    void method();
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface6");
    }
}

interface AnotherInterface1 {
    void newDefaultMethod();
}

class Cls6 implements Interface6, AnotherInterface1 {
    @Override
    public void method() {
        System.out.println("method() in Cls6");
    }
    @Override
    public void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Cls6");
    }
}

public class InterfaceEx6 {
    public static void main(String[] args) {
        Cls6 obj = new Cls6();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("-----------------");

        Interface6 obj2 = new Cls6();
        obj2.method();
        obj2.newDefaultMethod();

        System.out.println("-----------------");

        AnotherInterface1 obj3 = new Cls6();
        //obj3.method();
        obj3.newDefaultMethod();
    }
}