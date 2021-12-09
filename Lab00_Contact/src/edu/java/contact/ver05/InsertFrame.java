package edu.java.contact.ver05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static edu.java.contact.ver05.ContactMain05.*;

public class InsertFrame extends JFrame {

	private JPanel contentPane;
	static JTextField textName;
	static JTextField textPhone;
	static JTextField textEmail;
	private JLabel labelName;
	private JLabel labelPhone;
	private JLabel labelEmail;
	private JButton btnSave;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void showInsertFrame() {
		InsertFrame frame = new InsertFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public InsertFrame() {
		initialize();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelName = new JLabel("이름");
		labelName.setOpaque(true);
		labelName.setBackground(new Color(191, 205, 219));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		labelName.setBounds(14, 12, 126, 59);
		contentPane.add(labelName);

		labelPhone = new JLabel("전화번호");
		labelPhone.setOpaque(true);
		labelPhone.setBackground(new Color(191, 205, 219));
		labelPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelPhone.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		labelPhone.setBounds(14, 83, 126, 59);
		contentPane.add(labelPhone);

		labelEmail = new JLabel("이메일");
		labelEmail.setOpaque(true);
		labelEmail.setBackground(new Color(191, 205, 219));
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		labelEmail.setBounds(14, 154, 126, 59);
		contentPane.add(labelEmail);

		textName = new JTextField();
		textName.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		textName.setBounds(154, 12, 264, 59);
		contentPane.add(textName);
		textName.setColumns(10);

		textPhone = new JTextField();
		textPhone.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		textPhone.setColumns(10);
		textPhone.setBounds(154, 83, 264, 59);
		contentPane.add(textPhone);

		textEmail = new JTextField();
		textEmail.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(154, 154, 264, 59);
		contentPane.add(textEmail);

		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveContact();
			}
		});
		btnSave.setBackground(new Color(255, 204, 153));
		btnSave.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		btnSave.setBounds(84, 225, 126, 54);
		contentPane.add(btnSave);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cancel();			
			}
		});
		btnCancel.setBackground(new Color(204, 204, 255));
		btnCancel.setFont(new Font("한컴 백제 M", Font.PLAIN, 24));
		btnCancel.setBounds(224, 225, 126, 54);
		contentPane.add(btnCancel);
	}

	private void cancel() {
		int confirm = JOptionPane.showConfirmDialog(contentPane, "정말 취소할까요?", "취소 확인", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) { 
			dispose();
		}	
	}

	private void saveContact() {
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		Object[] rowData = { name, phone, email };
		
		if (name.equals("")) {
			JOptionPane.showMessageDialog(contentPane, "이름이 입력되지 않았습니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (phone.equals("")) {
			JOptionPane.showMessageDialog(contentPane, "전화번호가 입력되지 않았습니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (email.equals("")) {
			JOptionPane.showMessageDialog(contentPane, "이메일이 입력되지 않았습니다.", "입력 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		tableModel.addRow(rowData);
		dispose();
	}
}