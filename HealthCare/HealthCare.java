import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

// Healthcare 프로그램 메인 화면
public class HealthCare extends JFrame implements ActionListener {

	JPanel contentPane;
	Test see;
	Calories calories;
	BMI2 bmi;
	gym gym;

	public HealthCare() {

		setResizable(false);
		setForeground(new Color(0, 0, 0));
		setTitle("HEALTH CARE PROGRAM");
		setType(Type.POPUP);
		setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 129, 467);
		contentPane.add(panel);
		panel.setLayout(null);

		// bmi계산 버튼
		JButton btnNewButton = new JButton("BMI 계산");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(12, 48, 105, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);

		// 칼로리 계산 버튼
		JButton button = new JButton("칼로리 계산");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.PINK);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button.setBounds(12, 147, 105, 31);
		panel.add(button);
		button.addActionListener(this);

		// 운동량 계산 버튼
		JButton button_1 = new JButton("운동량 계산");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.PINK);
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_1.setBounds(12, 257, 105, 31);
		panel.add(button_1);
		button_1.addActionListener(this);

		// 지난달 보기 버튼
		JButton button_2 = new JButton("지난달보기");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.PINK);
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		button_2.setBounds(12, 368, 105, 31);
		panel.add(button_2);
		button_2.addActionListener(this);

		// 지난달 보기
		see = new Test();
		calories = new Calories();
		bmi = new BMI2();
		gym = new gym();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("BMI 계산")) {
			contentPane.add(bmi.BMICalculpanel);
			bmi.BMICalculpanel.setVisible(true);
			
			see.view_beforeBMI.setVisible(false);
			calories.CaloriesPanel.setVisible(false);
			gym.gym_pan.setVisible(false);
		}
		if (e.getActionCommand().equals("칼로리 계산")) {
			contentPane.add(calories.CaloriesPanel);
			calories.CaloriesPanel.setVisible(true);
			
			bmi.BMICalculpanel.setVisible(false);
			see.view_beforeBMI.setVisible(false);
			gym.gym_pan.setVisible(false);
		}
		if (e.getActionCommand().equals("운동량 계산")) {
			contentPane.add(gym.gym_pan);
			gym.gym_pan.setVisible(true);
			
			System.out.println("1");
			bmi.BMICalculpanel.setVisible(false);
			see.view_beforeBMI.setVisible(false);
			calories.CaloriesPanel.setVisible(false);
		}
		if (e.getActionCommand().equals("지난달보기")) {
			contentPane.add(see.view_beforeBMI);
			see.view_beforeBMI.setVisible(true);
			
			bmi.BMICalculpanel.setVisible(false);
			calories.CaloriesPanel.setVisible(false);
			gym.gym_pan.setVisible(false);
			see.bmiGrid();
			see.bmiresult();
		}
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCare frame = new HealthCare();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}