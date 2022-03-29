package chap05;

interface Interface10 {
    //static void staticMethod(); //static 메소드는 인터페이스 내에 구현되어야 함.
    //private static void privateAbstractStaticMethod(); // private 또는 static 메소드는 인터페이스 내에 구현되어야 함.
    //private static default void privateStaticDefaultMethod() {} //static은 오버라이딩이 불가. 따라서 default와 함께 못 쓴다.

    static void staticMethod() {
        privateStaticMethod1();
    }

    private static void privateStaticMethod1() {
        //method();
        //defaultMethod();
        //privateMethod();
    }

    private static void privateStaticMethod2() {
        privateStaticMethod1();
    }

    void method();
    default void defaultMethod() {}
    private void privateMethod() {}
}

public class InterfaceEx10 {
}
