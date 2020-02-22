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

// DB내의 BMI수치 가져와 평균값 표로 보여주는 코드
public class Test extends JFrame {

	JPanel view_beforeBMI;
	JPanel view_table;
	JPanel tellBMI;
	public JButton button_2;
	public JTable viewTable;
	public JTextArea bmiresult;
	public int state = 0;
	public int month;
	public double lastbmi;

	public Test() {

		view_beforeBMI = new JPanel();
		view_beforeBMI.setBackground(Color.PINK);
		view_beforeBMI.setBounds(153, 10, 623, 467);
		view_beforeBMI.setLayout(null);

		// 지난달 보기 버튼의 패널들
		view_table = new JPanel();
		view_table.setBackground(Color.WHITE);
		view_table.setBounds(14, 64, 595, 132);
		view_beforeBMI.add(view_table);
		view_table.setVisible(false);
		view_table.setLayout(new BorderLayout(0, 0));

		tellBMI = new JPanel();
		tellBMI.setBounds(14, 206, 595, 227);
		tellBMI.setBackground(Color.PINK);
		view_beforeBMI.add(tellBMI);
		tellBMI.setLayout(null);

		bmiresult = new JTextArea();
		bmiresult.setText("");
		bmiresult.setBounds(0, 21, 595, 87);
		bmiresult.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		bmiresult.setEditable(false);

		tellBMI.add(bmiresult);

		JLabel telllabel = new JLabel("현재 BMI");
		telllabel.setBounds(266, 0, 67, 21);
		tellBMI.add(telllabel);
		telllabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));

		JLabel lblTip = new JLabel(
				"- \uB2F9\uC2E0\uC758 \uACFC\uAC70 BMI\uC640 \uD604\uC7AC BMI\uC218\uCE58\uB97C \uAC00\uC838\uC640 \uACC4\uC0B0\uC744 \uD569\uB2C8\uB2E4.");
		lblTip.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblTip.setBounds(0, 154, 443, 15);
		tellBMI.add(lblTip);

		JLabel monthlabel = new JLabel("\uC6D4\uBCC4 BMI \uC99D\uAC10\uD45C");
		monthlabel.setBounds(14, 20, 595, 36);
		view_beforeBMI.add(monthlabel);
		monthlabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthlabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));

		view_table.setVisible(true);
		tellBMI.setVisible(true);
		view_beforeBMI.setVisible(false);
	}

	public void bmiresult() { // 데이터베이스의 bmi데이터를 근거로 판별합니다.

		if (state == 0) {
			state = 1;
			bmiresult.append("당신의 BMI는 " + lastbmi + "입니다." + "\r\n");
			if (lastbmi < 18.5) {
				bmiresult.append("당신은 저체중입니다. 음식을  더 섭취하고 운동을 더 하십시오.\r\n");
			} else if (18.5 <= lastbmi && lastbmi <= 23.0) {
				bmiresult.append("당신은 정상입니다. 이대로만 유지하십시오.\r\n");
			} else {
				bmiresult.append("당신은 비만입니다. 운동을 많이하고 식단을 조절해주세요.\r\n");
			}
		}
	}

	public void bmiGrid() { // 데이터 베이스에서 불러와 jtable을 그리는 함수
		try {
			//DB 연결
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://114.71.70.152:3306/bmi?characterEncoding=UTF-8&serverTimezone=UTC", "root", "root");
			Statement st = con.createStatement();
			Date date = new Date();
			LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int month = localDate.getMonthValue();
			int month2 = month - 1;
			int month3 = month - 2;
			// System.out.println(month);
			// DB내의 BMI값을 월별로 평균을 내는 쿼리
			String s = "select year, month, AVG(bmi) from bmi GROUP BY month";
			ResultSet rs = st.executeQuery(s);
			ResultSetMetaData rsmt = rs.getMetaData();
			
			// 월별로 평균을 낸 DB값을 표로 만들어서 보여줌.
			int c = rsmt.getColumnCount();
			Vector column = new Vector(c);
			
			for (int i = 1; i <= c; i++) {
				column.add(rsmt.getColumnName(i));
			}
			Vector data = new Vector();
			Vector row = new Vector();
			while (rs.next()) {
				row = new Vector(c);

				for (int i = 1; i <= c; i++) {
					row.add(rs.getString(i));
				}

				data.add(row);
			}
			viewTable = new JTable(data, column);
			viewTable.setBounds(12, 21, 571, 103);
			viewTable.setEnabled(false);
			JScrollPane jsp = new JScrollPane(viewTable);
			view_table.add(jsp, BorderLayout.CENTER);

			// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
			DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
			// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
			tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
			// 정렬할 테이블의 ColumnModel을 가져옴
			TableColumnModel tcmSchedule = viewTable.getColumnModel();
			// 반복문을 이용하여 테이블을 가운데 정렬로 지정
			for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
				tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
			}

			// 현재의 달 bmi값을 가져오는 쿼리
			String b = "select AVG(BMI) from bmi where month =" + month + ";";
			ResultSet bmiR = st.executeQuery(b);
			while (bmiR.next()) {
				lastbmi = bmiR.getInt(1);
			}
			// System.out.println(lastbmi);
			st.close();
			rs.close();
			con.close();
		} catch (Exception e) {
		}
	}
}