package chap05;

interface Interface8 {
    void method();
    default void newDefaultMethod() {
        System.out.println("newDefaultMethod() in Interface8");
    }
    static void staticMethod() {
            System.out.println("staticMethod() in Interface8");
    }
}

class Cls8 implements Interface8 {
    @Override
    public void method() {
        System.out.println("method() in Cls8");
        //Interface8.staticMethod(); //static메소드는 인터페이스를 직접 참조해야 함.
    }

}

public class InterfaceEx8 {
    public static void main(String[] args) {
        Interface8 obj = new Cls8();
        //obj.staticMethod(); //컴파일 에러
        Interface8.staticMethod(); //static method 사용법
        System.out.println("static 메소드를 사용할 때는 인터페이스를 직접 참조하여 사용해야 한다.");
    }
}
