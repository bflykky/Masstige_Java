package chap01;

public abstract class CheckClass {
    public static void main(String[] args) {
        System.out.println(8 >> 2);
        int x=2, y=10, z=0;
        z = x++*2+x;
        System.out.println(z);
        System.out.println("-------------------");
        Circle s = new Circle();
        s.paint();
    }

    public abstract int f1(int x);
}

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println("Circle");
    }
}