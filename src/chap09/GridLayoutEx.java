package chap09;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //4x2 격자의 그리드 레이아웃 배치관리자 생성

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 2, 0, 5));

        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(400, 300);
        setVisible(true);
    }



    public static void main(String[] args) {
        GridLayoutEx ex = new GridLayoutEx();
    }
}
