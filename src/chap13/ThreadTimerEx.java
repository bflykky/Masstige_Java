package chap13;


import javax.swing.*;
import java.awt.*;
class TimerThread extends Thread {
	private JLabel timerLabel;

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); //1초 잠자기
			}
			catch (InterruptedException e) {return;}
		}
	}

}
public class ThreadTimerEx extends JFrame {
	public ThreadTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); //컨텐트팬에 컴포넌트 추가.

		TimerThread th = new TimerThread(timerLabel);

		setSize(300, 170);
		setVisible(true);

		th.start(); //스레드 실행.
	}

	public static void main(String[] args) {
		new ThreadTimerEx();
	}
}
