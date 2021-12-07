package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain04 {

	private JFrame frame;
	private JLabel labelMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelMessage = new JLabel("New label");
		labelMessage.setFont(new Font("D2Coding", Font.BOLD, 32));
		labelMessage.setBounds(12, 10, 410, 61);
		frame.getContentPane().add(labelMessage);

		JButton btn1 = new JButton("익명클래스");
		// ActonListener 객체를 익명 클래스 객체로 생성하고, 버튼에 이벤트 핸들러를 등록
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelMessage.setText(e.getActionCommand());
//				labelMessage.setText(btn1.getText());
			}
		});
		btn1.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn1.setBounds(12, 81, 190, 61);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("람다표현식");
		// ActonListener 익명 클래스 객체 생성 -> 람다 표현식(Lambda expression): (param) -> { 구현 코드 작성; }
		btn2.addActionListener((e) -> {
			labelMessage.setText(e.getActionCommand());
		});
		btn2.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn2.setBounds(232, 83, 190, 61);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("메서드 1");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performButtonEvent(e);
			}
		});
		btn3.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn3.setBounds(12, 152, 190, 61);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("메서드 2");
		btn4.addActionListener((e) -> { performButtonEvent(e); });
		btn4.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn4.setBounds(232, 152, 190, 61);
		frame.getContentPane().add(btn4);
	}

	private void performButtonEvent(ActionEvent e) {
		labelMessage.setText(e.getActionCommand());
	}
	
}