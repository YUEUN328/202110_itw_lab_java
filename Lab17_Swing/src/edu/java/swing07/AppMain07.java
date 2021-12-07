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
		labelId.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelId.setBounds(14, 12, 121, 56);
		frame.getContentPane().add(labelId);
		
		textId = new JTextField();
		textId.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textId.setBounds(150, 12, 277, 56);
		frame.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel labelPassword = new JLabel("비밀번호");
		labelPassword.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelPassword.setBounds(14, 80, 121, 56);
		frame.getContentPane().add(labelPassword);
		
		JButton btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			showInfo();
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

	private void showInfo() {
		String id = textId.getText();
		String pwd = "";	
		char[] secretPwd = passwordField.getPassword();
		
		for (char c : secretPwd) {
			Character.toString(c);
			pwd += (pwd.equals("")) ? "" + c + "" : "" + c + "";			
		}			
		System.out.println(pwd);
		
		StringBuffer message = new StringBuffer();
		message.append("아이디: ").append(id).append("\n")
			.append("비밀번호: ").append(pwd);
		
		textArea.setText(message.toString());
	}
	
}
