package chap05;

interface Interface4 {
    void method(); //동일한 이름의 추상 메소드가 중복됨.
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface4");
    }
}

interface SubInterface1 extends Interface4 {
    void method(); //동일한 이름의 추상 메소드가 중복됨.
}

class Cls4 implements SubInterface1 {
    @Override
    public void method() {
        System.out.println("method() in Cls4");
    }
}

public class InterfaceEx4 {
    public static void main(String[] args) {
        Cls4 obj = new Cls4();
        obj.method();
        obj.newDefaultMethod();

        System.out.println("--------------");

        SubInterface1 obj2 = new Cls4();
        obj2.method();
        obj2.newDefaultMethod();

        System.out.println("--------------");

        Interface4 obj3 = new Cls4();
        obj3.method();
        obj3.newDefaultMethod();
    }
}
