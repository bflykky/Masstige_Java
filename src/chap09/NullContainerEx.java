package chap09;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {

        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null); //컨텐트 팬의 배치관리자 삭제

        JLabel greeting = new JLabel("Hello, Press Buttons!");
        greeting.setSize(200, 20);

        JButton[] buttonArr = new JButton[9];
        int button_xLoc = 15;
        int button_yLoc = 15;
        for (int i = 0; i < buttonArr.length; i++) {
            buttonArr[i] = new JButton(Integer.toString(i + 1));
            buttonArr[i].setSize(50, 20);
            buttonArr[i].setLocation(button_xLoc, button_yLoc);
            c.add(buttonArr[i]);
            button_xLoc += 15;
            button_yLoc += 15;

        }
        greeting.setLocation(130, 50);
        c.add(greeting);

    }
    public static void main(String[] args) {
        NullContainerEx a = new NullContainerEx();
    }
}
