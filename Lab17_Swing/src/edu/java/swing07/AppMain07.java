package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class AppMain07 {

	private JFrame frame;
	private JTextField textId;
	private JPasswordField passwordField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel labelId = new JLabel("아이디");
		labelId.setHorizontalAlignment(SwingConstants.CENTER);
		labelId.setOpaque(true);
		labelId.setBackground(SystemColor.inactiveCaption);
		labelId.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelId.setBounds(14, 12, 121, 56);
		frame.getContentPane().add(labelId);

		textId = new JTextField();
		textId.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textId.setBounds(150, 12, 277, 56);
		frame.getContentPane().add(textId);
		textId.setColumns(10);

		JLabel labelPassword = new JLabel("비밀번호");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setOpaque(true);
		labelPassword.setBackground(SystemColor.inactiveCaption);
		labelPassword.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelPassword.setBounds(14, 80, 121, 56);
		frame.getContentPane().add(labelPassword);

		JButton btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showIdPassword();
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnConfirm.setBounds(14, 162, 139, 56);
		frame.getContentPane().add(btnConfirm);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("D2Coding", Font.PLAIN, 24));
		passwordField.setBounds(150, 85, 277, 51);
		frame.getContentPane().add(passwordField);

		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textArea.setBounds(14, 232, 413, 113);
		frame.getContentPane().add(textArea);
	}

	private void showIdPassword() {
		String id = textId.getText();		
//		String pw = passwordField.getText();
		// -> JPasswordfield 클래스의 getText 메서드는 deprecated(더이상 사용을 권장하지 않는) 메서드
		// -> 더이상 오류 수정을 하지 않고, Java 버전이 업그레이드될 때 사라질 수 있는 메서드
		// -> getText 대신에 getPassword 메서드를 사용하기를 권장
//		String result = "ID: " + id + "\n + "PW: " + pw;
		char[] pw = passwordField.getPassword();
		
//		if (id.equals("")) {
//			System.out.println("아이디 입력 안 됨");
//		}
//		if (pw.length == 0) {
//			System.out.println("비밀번호 입력 안 됨");
//		}
		
		StringBuffer result = new StringBuffer();
		result.append("ID: ").append(id).append("\n")
			.append("PW: ").append(pw);

		textArea.setText(result.toString());
	}

}