package chap09;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(600, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우 닫으면 프로그램 종료하도록 함.

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout()); //해당 코드 미삽입 시 컨텐트팬의 컴포넌트가 겹쳐서 하나만 화면에 표시됨.


        JButton button1 = new JButton("Click1");
        JButton button2 = new JButton("Click2");
        contentPane.add(button1);
        contentPane.add(button2);


    }



    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
