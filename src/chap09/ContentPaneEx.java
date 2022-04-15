package chap09;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));
        contentPane.add(new JButton("Wow"));
        contentPane.add(new JButton("Oh"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        ContentPaneEx c = new ContentPaneEx();
    }
}