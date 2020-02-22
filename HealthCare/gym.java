import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

//�Ƚ�� ��� �ڵ�
public class gym extends JFrame implements ActionListener {
	JPanel gym_pan;
	private JTextField textField;
	//static JLabel imglb = new JLabel();
	JLabel imglb;
	static int kcal = 0, coc; // Calories per count
	static String name;
	static BufferedReader br;
	static PrintWriter pw;
	static JTextArea txtrKcal;

	/**
	 * Launch the application.
	 *//*
		 * public static void main(String[] args) { EventQueue.invokeLater(new
		 * Runnable() { public void run() { try { gym frame = new gym();
		 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
		 * }
		 */

	/**
	 * Create the frame.
	 */
	public gym() {
		// setTitle("��� ���");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		gym_pan = new JPanel();
		// gym_pan.setBorder(new EmptyBorder(5, 5, 5, 5));
		gym_pan.setBounds(153, 10, 623, 467);
		gym_pan.setBackground(Color.PINK);
		gym_pan.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(64, 21, 219, 31);
		gym_pan.add(panel_1);

		JLabel label_1 = new JLabel("��ü�");
		label_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		label_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(label_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("���� ���", Font.PLAIN, 12));
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "��ü�", "�˾�", "�ȱ������", "���׷�����", "��Ǯ�ٿ�", "��ġ������", "ũ��ġ", "�÷�ũ", "�ΰ���" }));
		panel_1.add(comboBox);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(337, 21, 236, 31);
		gym_pan.add(panel_2);

		JLabel label_2 = new JLabel("��ü�");
		label_2.setFont(new Font("���� ���", Font.PLAIN, 12));
		panel_2.add(label_2);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		comboBox_1.addActionListener(this);
		comboBox_1.setModel(
				new DefaultComboBoxModel(new String[] { "��ü�", "����", "����������", "����ƾŬ���̸�", "�ٳѱ�", "�ö��̿���Ʈ��", "����Ʈ" }));
		panel_2.add(comboBox_1);

		textField = new JTextField();
		textField.setBounds(64, 414, 96, 25);
		gym_pan.add(textField);
		textField.setFont(new Font("���� ���", Font.PLAIN, 10));
		textField.setText("Ƚ�� �Է�");
		textField.setColumns(10);

		txtrKcal = new JTextArea();
		txtrKcal.setBackground(Color.PINK);
		txtrKcal.setBounds(188, 414, 243, 25);
		gym_pan.add(txtrKcal);
		txtrKcal.setFont(new Font("���� ���", Font.PLAIN, 15));
		txtrKcal.setText(kcal + "kcal�� �Ҹ��ϼ̽��ϴ�.");

		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(427, 414, 69, 27);
		gym_pan.add(btnNewButton);
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("���� ���", Font.PLAIN, 10));

		JButton btnNewButton_1 = new JButton("�ʱ�ȭ");
		btnNewButton_1.setBounds(508, 414, 65, 27);
		gym_pan.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setFont(new Font("���� ���", Font.PLAIN, 10));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(64, 62, 509, 316);
		gym_pan.add(panel);
		panel.setLayout(null);

		imglb = new JLabel();
		imglb.setBounds(0, 0, 509, 316);
		panel.add(imglb);
		
		gym_pan.setVisible(false);
	}

	public void actionPerformed(ActionEvent ae) {
		switch (ae.getActionCommand()) {
		case "comboBoxChanged":
			JComboBox cb = (JComboBox) ae.getSource();
			name = cb.getSelectedItem().toString();
			ImageIcon image = new ImageIcon("Image/" + name + ".gif");
			System.out.println(image);
			imglb.setIcon(image);
			break;

		case "����":
			try {
				FileReader infile = new FileReader("Image/coc.txt");
				br = new BufferedReader(infile);

				do {
					String tmp = br.readLine();
					StringTokenizer st = new StringTokenizer(tmp);
					if (name.equals(st.nextToken())) {
						coc = Integer.parseInt(st.nextToken());
						break;
					}
				} while (br.ready());

				kcal = kcal + Integer.parseInt(textField.getText()) * coc;
				txtrKcal.setText(kcal + "kcal�� �Ҹ��ϼ̽��ϴ�.");
				textField.setText("");

				// gym_pan.removeAll();

				br.close();

			} catch (IOException e) {
				System.err.println(e);
			}

			break;

		case "�ʱ�ȭ":
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("���.txt", true));
				pw = new PrintWriter(bw, true);

				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
				pw.write("��� ��¥ : " + sd.format(new Date()) + "\r\n");
				pw.write("�Ҹ��� Į�θ� : " + kcal + "kcal\r\n\r\n");
				kcal = 0;
				txtrKcal.setText(kcal + "kcal�� �Ҹ��ϼ̽��ϴ�.");

				pw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			break;

		default:
			break;
		}
	}

}
