package chap05;

interface Interface11 {
    void method();
    default void defaultMethod() {}
    static void staticMethod() {}
    private static void privateStaticMethod() {}

    private void privateMethod() {
        method();
        defaultMethod();
        staticMethod();
        privateStaticMethod();
    }
}

public class InterfaceEx11 {
}
