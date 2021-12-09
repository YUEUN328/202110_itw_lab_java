package edu.java.contact.ver05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static edu.java.contact.ver05.InsertFrame.*;

public class ContactMain05 {

	private static final String[] COLUMN_NAMES = { "이름", "전화번호", "이메일" };

	private JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnInsert;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JLabel labelSearch;
	private JTextField textSearch;
	static DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
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
	public ContactMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 89, 370, 368);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		tableModel = new DefaultTableModel(null, COLUMN_NAMES) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(tableModel);
		scrollPane.setViewportView(table);

		btnInsert = new JButton("+");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InsertFrame.showInsertFrame();
			}
		});
		btnInsert.setBackground(new Color(255, 102, 0));
		btnInsert.setFont(new Font("한컴 백제 M", Font.PLAIN, 50));
		btnInsert.setBounds(398, 12, 116, 65);
		frame.getContentPane().add(btnInsert);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setBackground(new Color(153, 255, 0));
		btnUpdate.setFont(new Font("한컴 백제 M", Font.PLAIN, 30));
		btnUpdate.setBounds(398, 89, 116, 65);
		frame.getContentPane().add(btnUpdate);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});
		btnDelete.setBackground(new Color(153, 204, 255));
		btnDelete.setFont(new Font("한컴 백제 M", Font.PLAIN, 30));
		btnDelete.setBounds(398, 392, 116, 65);
		frame.getContentPane().add(btnDelete);

		labelSearch = new JLabel("검색");
		labelSearch.setOpaque(true);
		labelSearch.setBackground(new Color(204, 153, 255));
		labelSearch.setHorizontalAlignment(SwingConstants.CENTER);
		labelSearch.setFont(new Font("한컴 백제 M", Font.PLAIN, 30));
		labelSearch.setBounds(14, 12, 116, 65);
		frame.getContentPane().add(labelSearch);

		textSearch = new JTextField();
		textSearch.setFont(new Font("한컴 백제 M", Font.PLAIN, 30));
		textSearch.setBounds(144, 12, 239, 65);
		frame.getContentPane().add(textSearch);
		textSearch.setColumns(10);
	}

	private void updateContact() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(frame, "수정할 행을 먼저 선택하세요.");
			return;
		}

		InsertFrame.showInsertFrame();
//		textName.setText();
//		textPhone.setText();
//		textEmail.setText();
	}

	private void deleteContact() {
		int index = table.getSelectedRow();
		if (index == -1) {
			JOptionPane.showMessageDialog(frame, "삭제할 행을 먼저 선택하세요.");
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(frame, "정말 삭제할까요?", "삭제 확인", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			tableModel.removeRow(index);
		}
	}
}