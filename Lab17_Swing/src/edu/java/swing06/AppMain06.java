package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelName.setBounds(12, 10, 160, 64);
		frame.getContentPane().add(labelName);
		
		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textName.setBounds(184, 10, 348, 64);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelPhone.setBounds(12, 84, 160, 64);
		frame.getContentPane().add(labelPhone);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textPhone.setColumns(10);
		textPhone.setBounds(184, 84, 348, 64);
		frame.getContentPane().add(textPhone);
		
		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelEmail.setBounds(12, 158, 160, 64);
		frame.getContentPane().add(labelEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(184, 158, 348, 64);
		frame.getContentPane().add(textEmail);
		
		JButton btnConfirm = new JButton("입력 완료");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnConfirm.setBounds(12, 232, 240, 64);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textArea.setBounds(12, 306, 520, 204);
		frame.getContentPane().add(textArea);
	} // end initialize()

	private void showInfo() {
		// 3개의 JTextField에서 이름, 전화번호, 이메일을 읽음
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
//		String message = "이름: " + name + "\n"
//				+ "전화번호: " + phone + "\n"
//				+ "이메일: " + email;
		StringBuffer message = new StringBuffer(); // StringBuffer 객체 생성
		message.append("이름: ").append(name).append("\n")
			.append("전화번호: ").append(phone).append("\n")
			.append("이메일: ").append(email);
		
		textArea.setText(message.toString());
		
		// 3개의 JTextField의 내용을 모두 지움
		clearAllTextField();				
	}

	private void clearAllTextField() {
		textName.setText("");
		textPhone.setText("");
		textEmail.setText("");		
	}
	
}