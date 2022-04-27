package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class checkListenerOrder extends JFrame {
    public checkListenerOrder() {
        setTitle("하나의 컴포넌트에 동일한 종류의 이벤트에 대한 여러 리스너가 연결되었을 때의 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("클릭");

        c.add(btn);

        btn.addActionListener(new printOneActionListener());
        btn.addActionListener(new printTwoActionListener());
        btn.addActionListener(new printThreeActionListener());
        btn.addActionListener(new printFourActionListener());

        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        checkListenerOrder a = new checkListenerOrder();
        /*
        결론 및 알 수 있는 정보: 하나의 컴포넌트에 동일한 이벤트에 대한 여러 리스너가 연결되었을 때,
        해당 리스너들이 모두 실행되며 그 순서는 등록된 순서의 반대로 실행됨.
        출력 결과)
        Hi 4
        Hi 3
        Hi 2
        Hi 1
         */
    }
}

class printOneActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi 1");
    }
}

class printTwoActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi 2");
    }
}

class printThreeActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi 3");
    }
}

class printFourActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi 4");
    }
}

//class printLineActionListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("--------------------");
//    }
//}