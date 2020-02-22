import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

// BMI 계산 코드
public class BMI2 extends JFrame implements ActionListener {
   private JTextField textFieldage;
   private JTextField textFieldwei;
   private JTextField textFieldhei;
   public JPanel BMICalculpanel;
   public TextField resultset;

   public BMI2() {
      BMICalculpanel = new JPanel();
      BMICalculpanel.setBackground(Color.PINK);
      BMICalculpanel.setBounds(153, 10, 623, 467);
      BMICalculpanel.setLayout(null);
      
      JPanel BMICal = new JPanel();
      BMICal.setBackground(Color.WHITE);
      BMICal.setBounds(12, 50, 599, 153);
      BMICalculpanel.add(BMICal);
      BMICal.setLayout(null);
      
      JLabel label = new JLabel("나이 :");
      label.setBounds(48, 38, 40, 15);
      BMICal.add(label);
      
      textFieldage = new JTextField();
      textFieldage.setBounds(88, 35, 90, 21);
      BMICal.add(textFieldage);
      textFieldage.setColumns(10);
      
      JLabel lblNewLabel = new JLabel("체중 :");
      lblNewLabel.setBounds(219, 38, 40, 15);
      BMICal.add(lblNewLabel);
      
      textFieldwei = new JTextField();
      textFieldwei.setBounds(261, 35, 90, 21);
      BMICal.add(textFieldwei);
      textFieldwei.setColumns(10);
      
      JLabel lblNewLabel_1 = new JLabel("신장 :");
      lblNewLabel_1.setBounds(392, 38, 40, 15);
      BMICal.add(lblNewLabel_1);
      
      textFieldhei = new JTextField();
      textFieldhei.setBounds(433, 35, 90, 21);
      BMICal.add(textFieldhei);
      textFieldhei.setColumns(10);
      JPanel result = new JPanel();
      result.setBounds(12, 213, 599, 153);
      BMICalculpanel.add(result);
      result.setLayout(null);
      
      resultset = new TextField();
      resultset.setBackground(Color.WHITE);
      resultset.setBounds(0, 0, 599, 153);
      result.add(resultset);
      resultset.setEditable(false);
      
      JLabel lblNewLabel_2 = new JLabel("● BMI 계산 공식은 몸무게 (Kg) / (신장(m) * 신장(m)) 으로 계산됩니다.");
      lblNewLabel_2.setBounds(12, 110, 448, 15);
      BMICal.add(lblNewLabel_2);
      
      JButton btnNewButton_1 = new JButton("BMI 계산하기");
      btnNewButton_1.setBackground(Color.PINK);
      btnNewButton_1.addActionListener(this);

      btnNewButton_1.setBounds(433, 78, 126, 23);
      BMICal.add(btnNewButton_1);
      
      JLabel lblNewLabel_3 = new JLabel("살");
      lblNewLabel_3.setBounds(190, 38, 17, 15);
      BMICal.add(lblNewLabel_3);
      
      JLabel lblKg = new JLabel("kg");
      lblKg.setBounds(363, 38, 17, 15);
      BMICal.add(lblKg);
      
      JLabel lblNewLabel_4 = new JLabel("cm");
      lblNewLabel_4.setBounds(535, 38, 24, 15);
      BMICal.add(lblNewLabel_4);
      
      JLabel lblNewLabel_5 = new JLabel("● 18.5 이하면 저체중, 18.5~23은 정상, 23~25는 과체중, 25~30은 비만, 30이상은 고도비만");
      lblNewLabel_5.setBounds(12, 376, 599, 67);
      BMICalculpanel.add(lblNewLabel_5);
      
      JLabel lblNewLabel_6 = new JLabel("BMI \uACC4\uC0B0\uD558\uAE30");
      lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_6.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
      lblNewLabel_6.setBounds(12, 10, 599, 30);
      BMICalculpanel.add(lblNewLabel_6);
      
      BMICalculpanel.setVisible(false);
   }
   public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("BMI 계산하기")) {
        bmicalcul();
      }
     
   }
   public void bmicalcul() {
       if(!textFieldage.getText().equals("")) {
          String age = textFieldage.getText();
          String weight = textFieldwei.getText();
          String height = textFieldhei.getText();
          
          try {
	//MYSQL DB 결합
            Connection con = DriverManager.getConnection("jdbc:mysql://114.71.70.152:3306/"
                  + "bmi?characterEncoding=UTF-8&serverTimezone=UTC","root","root");
            Statement st = con.createStatement();
            float wei = Float.parseFloat(weight);
              float hei = Float.parseFloat(height);
              
              hei=hei/100;
              Date d = new Date();
            int year = d.getYear()+1900;
            int month = d.getMonth()+1;
              float bmi= (wei/(hei*hei));
              resultset.setText("산출된 BMI 지수는 "+bmi+" 입니다.");
	  // DB 쿼리 실행
              String sql = "INSERT INTO bmi VALUES("+year+","+month+","+bmi+");";
              int bmisave = st.executeUpdate(sql);
              System.out.println(bmisave);
              textFieldage.setText("");
              textFieldwei.setText("");
              textFieldhei.setText("");
         } catch (SQLException e1) {               
            e1.printStackTrace();
         }   
       }         
    }
}