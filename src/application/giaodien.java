package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField txtheigth;
	private JTextField txtlength;
	private JTextField txtwidth;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giaodien frame = new giaodien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Vector Vxoa;
	void reset() {
		Vxoa = new Vector();
	}

	public giaodien() {
		reset();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÍNH THỂ TÍCH HÌNH HỘP CHỮ NHẬT");
		lblNewLabel.setBounds(138, 10, 234, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chiều dài   :");
		lblNewLabel_1_1.setBounds(23, 81, 73, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Chiều rộng:");
		lblNewLabel_1_3.setBounds(23, 118, 73, 27);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chiều cao  :");
		lblNewLabel_1_2.setBounds(23, 155, 73, 27);
		contentPane.add(lblNewLabel_1_2);
		
		txtheigth = new JTextField();
		txtheigth.setBounds(114, 159, 96, 19);
		contentPane.add(txtheigth);
		txtheigth.setColumns(10);
		
		txtlength = new JTextField();
		txtlength.setColumns(10);
		txtlength.setBounds(114, 85, 96, 19);
		contentPane.add(txtlength);
		
		txtwidth = new JTextField();
		txtwidth.setColumns(10);
		txtwidth.setBounds(114, 122, 96, 19);
		contentPane.add(txtwidth);
		
		JLabel lblNewLabel_1 = new JLabel("Thể tích = ");
		lblNewLabel_1.setBounds(244, 118, 73, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel ketqua = new JLabel("");
		ketqua.setForeground(Color.RED);
		ketqua.setBounds(309, 125, 87, 13);
		contentPane.add(ketqua);
		
		JButton btnKtQu = new JButton("Kết quả");
		btnKtQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float len = Float.parseFloat(txtlength.getText());
				float wid = Float.parseFloat(txtwidth.getText());
				float hei = Float.parseFloat(txtheigth.getText());
				float v=0;
				if(e.getSource()==btnKtQu) {
					v = len*wid*hei;
					ketqua.setText(String.valueOf(v));
				}
			}
		});
		btnKtQu.setBounds(123, 198, 87, 21);
		contentPane.add(btnKtQu);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtlength.setText("");
				txtwidth.setText("");
				txtheigth.setText("");
				ketqua.setText("");
				Vxoa.clear();
			}
		});
		btnXa.setBounds(23, 198, 72, 21);
		contentPane.add(btnXa);
	}
}
