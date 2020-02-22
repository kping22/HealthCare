import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JSeparator;

// À½½Ä¹° Ä®·Î¸® °è»ê ¹× ÀúÀå ÄÚµå
public class Calories extends JFrame {
;
   private JTextField textField;
   JPanel CaloriesPanel;
   public int result = 0;
   public int ¶±ººÀÌ, ±è¹ä, ÃÊ¹ä, Ä¡Å², Â¥Àå¸é, Á·¹ß, ÇÜ¹ö°Å, ÀâÃ¤, ½ºÅ×ÀÌÅ©, ³Ã¸é, µ·±î½º, ½Ò¹ä, °¥ºñÂò, ÇÇÀÚ, »ï°ã»ì;
   public int °¨ÀÚÆ¢±è, °í±¸¸¶, ±Ö, ¶±, ¸¶Ä«·Õ, ºØ¾î»§, »ç°ú, ¾Æ¸Þ¸®Ä«³ë, ¾Æ¸óµå, ¾ÆÀÌ½ºÅ©¸², ¿ìÀ¯, ÃÊÄÝ¸´, ÄÉÀÌÅ©, ÄíÅ°, Åä¸¶Åä;
/*
    public static void main(String[] args) {
         
         EventQueue.invokeLater(new Runnable() {
            public void run() {
               try {
                  Calories frame = new Calories();
                  frame.setVisible(true);
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }
         });
      }*/
   
   public Calories() {

      CaloriesPanel = new JPanel();
      CaloriesPanel.setVisible(false);
      CaloriesPanel.setBackground(Color.WHITE);
      CaloriesPanel.setBounds(153, 10, 623, 467);
      CaloriesPanel.setLayout(null);

      JPanel °á°ú = new JPanel();
      °á°ú.setBackground(Color.PINK);
      °á°ú.setBounds(12, 394, 599, 71);
      CaloriesPanel.add(°á°ú);
      °á°ú.setLayout(null);

      JTextArea textArea = new JTextArea();
      textArea.setBounds(90, 25, 507, 21);
      °á°ú.add(textArea);

      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(90, 2, 507, 21);
      °á°ú.add(textArea_1);

      JLabel lblNewLabel_5 = new JLabel(" \uACBD\uACE0 \uBA54\uC2DC\uC9C0");
      lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      lblNewLabel_5.setBackground(Color.WHITE);
      lblNewLabel_5.setBounds(0, 2, 87, 19);
      °á°ú.add(lblNewLabel_5);

      JLabel label_29 = new JLabel(" \uC120\uD0DD \uBA54\uB274");
      label_29.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_29.setBackground(Color.WHITE);
      label_29.setBounds(0, 25, 87, 19);
      °á°ú.add(label_29);

      JLabel label = new JLabel(" \uCD1D \uCE7C\uB85C\uB9AC");
      label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label.setBackground(Color.WHITE);
      label.setBounds(0, 48, 87, 19);
      °á°ú.add(label);

      JTextArea textArea_2 = new JTextArea();
      textArea_2.setBounds(90, 48, 507, 21);
      °á°ú.add(textArea_2);



      JPanel °£½Ä = new JPanel();
      °£½Ä.setBounds(12, 66, 599, 292);
      CaloriesPanel.add(°£½Ä);
      °£½Ä.setBackground(Color.WHITE);
      °£½Ä.setVisible(false);
      °£½Ä.setLayout(null);

      JButton button_21 = new JButton(new ImageIcon("Image/°¨ÀÚÆ¢±è.png"));
      button_21.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            °¨ÀÚÆ¢±è = 306;
            textField.setText("°¨ÀÚÆ¢±è Ä®·Î¸® : " + °¨ÀÚÆ¢±è + "Kcal (100g)");
            result += °¨ÀÚÆ¢±è;
            textArea.append("°¨ÀÚÆ¢±è ");
            textArea_2.append(" " + °¨ÀÚÆ¢±è);
         }
      });
      button_21.setBounds(2, 0, 119, 74);
      °£½Ä.add(button_21);

      JButton button_22 = new JButton(new ImageIcon("Image/°í±¸¸¶.png"));
      button_22.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            °í±¸¸¶ = 131;
            textField.setText("°í±¸¸¶ Ä®·Î¸® : " + °í±¸¸¶ + "Kcal (100g)");
            result += °í±¸¸¶;
            textArea.append("°í±¸¸¶ ");
            textArea_2.append(" " + °í±¸¸¶);
         }
      });
      button_22.setBounds(121, 0, 119, 74);
      °£½Ä.add(button_22);

      JButton button_23 = new JButton(new ImageIcon("Image/±Ö.png"));
      button_23.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ±Ö = 34;
            textField.setText("±Ö Ä®·Î¸® : " + ±Ö + "Kcal (100g)");
            result += ±Ö;
            textArea.append("±Ö ");
            textArea_2.append(" " + ±Ö);
         }
      });
      button_23.setBounds(240, 0, 119, 74);
      °£½Ä.add(button_23);

      JButton button_24 = new JButton(new ImageIcon("Image/¶±.png"));
      button_24.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¶± = 250;
            textField.setText("¶± Ä®·Î¸® : " + ¶± + "Kcal (5°³)");
            result += ¶±;
            textArea.append("¶± ");
            textArea_2.append(" " + ¶±);
         }
      });
      button_24.setBounds(359, 0, 119, 74);
      °£½Ä.add(button_24);

      JButton button_25 = new JButton(new ImageIcon("Image/¸¶Ä«·Õ.png"));
      button_25.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¸¶Ä«·Õ = 159;
            textField.setText("¸¶Ä«·Õ Ä®·Î¸® : " + ¸¶Ä«·Õ + "Kcal (159g)");
            result += ¸¶Ä«·Õ;
            textArea.append("¸¶Ä«·Õ ");
            textArea_2.append(" " + ¸¶Ä«·Õ);
         }
      });
      button_25.setBounds(478, 0, 119, 74);
      °£½Ä.add(button_25);

      JButton button_26 = new JButton(new ImageIcon("Image/ºØ¾î»§.png"));
      button_26.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ºØ¾î»§ = 106;
            textField.setText("ºØ¾î»§ Ä®·Î¸® : " + ºØ¾î»§ + "Kcal (50g)");
            result += ºØ¾î»§;
            textArea.append("ºØ¾î»§ ");
            textArea_2.append(" " + ºØ¾î»§);
         }
      });
      button_26.setBounds(2, 97, 119, 74);
      °£½Ä.add(button_26);

      JButton button_27 = new JButton(new ImageIcon("Image/»ç°ú.png"));
      button_27.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            »ç°ú = 57;
            textField.setText("»ç°ú Ä®·Î¸® : " + »ç°ú + "Kcal (100g)");
            result += »ç°ú;
            textArea.append("»ç°ú ");
            textArea_2.append(" " + »ç°ú);
         }
      });
      button_27.setBounds(121, 97, 119, 74);
      °£½Ä.add(button_27);

      JButton button_28 = new JButton(new ImageIcon("Image/¾Æ¸Þ¸®Ä«³ë.png"));
      button_28.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¾Æ¸Þ¸®Ä«³ë = 10;
            textField.setText("¾Æ¸Þ¸®Ä«³ë Ä®·Î¸® : " + ¾Æ¸Þ¸®Ä«³ë + "Kcal (1ÀÜ)");
            result += ¾Æ¸Þ¸®Ä«³ë;
            textArea.append("¾Æ¸Þ¸®Ä«³ë ");
            textArea_2.append(" " + ¾Æ¸Þ¸®Ä«³ë);
         }
      });
      button_28.setBounds(240, 97, 119, 74);
      °£½Ä.add(button_28);

      JButton button_29 = new JButton(new ImageIcon("Image/¾Æ¸óµå.png"));
      button_29.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¾Æ¸óµå = 6;
            textField.setText("¾Æ¸óµå Ä®·Î¸® : " + ¾Æ¸óµå + "Kcal (1°³)");
            result += ¾Æ¸óµå;
            textArea.append("¾Æ¸óµå ");
            textArea_2.append(" " + ¾Æ¸óµå);
         }
      });
      button_29.setBounds(359, 97, 119, 74);
      °£½Ä.add(button_29);

      JButton button_30 = new JButton(new ImageIcon("Image/¾ÆÀÌ½ºÅ©¸².png"));
      button_30.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¾ÆÀÌ½ºÅ©¸² = 130;
            textField.setText("¾ÆÀÌ½ºÅ©¸² Ä®·Î¸® : " + ¾ÆÀÌ½ºÅ©¸² + "Kcal (1°³)");
            result += ¾ÆÀÌ½ºÅ©¸²;
            textArea.append("¾ÆÀÌ½ºÅ©¸² ");
            textArea_2.append(" " + ¾ÆÀÌ½ºÅ©¸²);
         }
      });
      button_30.setBounds(478, 97, 119, 74);
      °£½Ä.add(button_30);

      JButton button_31 = new JButton(new ImageIcon("Image/¿ìÀ¯.png"));
      button_31.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¿ìÀ¯ = 66;
            textField.setText("¿ìÀ¯ Ä®·Î¸® : " + ¿ìÀ¯ + "Kcal (100g)");
            result += ¿ìÀ¯;
            textArea.append("¿ìÀ¯ ");
            textArea_2.append(" " + ¿ìÀ¯);
         }
      });
      button_31.setBounds(2, 194, 119, 74);
      °£½Ä.add(button_31);

      JButton button_32 = new JButton(new ImageIcon("Image/ÃÊÄÝ¸´.png"));
      button_32.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ÃÊÄÝ¸´ = 550;
            textField.setText("ÃÊÄÝ¸´ Ä®·Î¸® : " + ÃÊÄÝ¸´ + "Kcal (100g)");
            result += ÃÊÄÝ¸´;
            textArea.append("ÃÊÄÝ¸´ ");
            textArea_2.append(" " + ÃÊÄÝ¸´);
         }
      });
      button_32.setBounds(121, 194, 119, 74);
      °£½Ä.add(button_32);

      JButton button_33 = new JButton(new ImageIcon("Image/ÄÉÀÌÅ©.png"));
      button_33.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ÄÉÀÌÅ© = 220;
            textField.setText("ÄÉÀÌÅ© Ä®·Î¸® : " + ÄÉÀÌÅ© + "Kcal (55g)");
            result += ÄÉÀÌÅ©;
            textArea.append("ÄÉÀÌÅ© ");
            textArea_2.append(" " + ÄÉÀÌÅ©);
         }
      });
      button_33.setBounds(240, 194, 119, 74);
      °£½Ä.add(button_33);

      JButton button_34 = new JButton(new ImageIcon("Image/ÄíÅ°.png"));
      button_34.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ÄíÅ° = 45;
            textField.setText("ÄíÅ° Ä®·Î¸® : " + ÄíÅ° + "Kcal (30g)");
            result += ÄíÅ°;
            textArea.append("ÄíÅ° ");
            textArea_2.append(" " + ÄíÅ°);
         }
      });
      button_34.setBounds(359, 194, 119, 74);
      °£½Ä.add(button_34);

      JButton button_35 = new JButton(new ImageIcon("Image/Åä¸¶Åä.png"));
      button_35.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            Åä¸¶Åä = 22;
            textField.setText("Åä¸¶Åä Ä®·Î¸® : " + Åä¸¶Åä + "Kcal (22g)");
            result += Åä¸¶Åä;
            textArea.append("Åä¸¶Åä ");
            textArea_2.append(" " + Åä¸¶Åä);
         }
      });
      button_35.setBounds(478, 194, 119, 74);
      °£½Ä.add(button_35);

      JLabel lblNewLabel_3 = new JLabel("\uAC10\uC790\uD280\uAE40");
      lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setBounds(2, 72, 119, 26);
      °£½Ä.add(lblNewLabel_3);

      JLabel label_15 = new JLabel("\uACE0\uAD6C\uB9C8");
      label_15.setHorizontalAlignment(SwingConstants.CENTER);
      label_15.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_15.setBounds(121, 72, 119, 26);
      °£½Ä.add(label_15);

      JLabel label_16 = new JLabel("\uADE4");
      label_16.setHorizontalAlignment(SwingConstants.CENTER);
      label_16.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_16.setBounds(240, 72, 119, 26);
      °£½Ä.add(label_16);

      JLabel label_17 = new JLabel("\uB5A1");
      label_17.setHorizontalAlignment(SwingConstants.CENTER);
      label_17.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_17.setBounds(359, 72, 119, 26);
      °£½Ä.add(label_17);

      JLabel label_18 = new JLabel("\uB9C8\uCE74\uB871");
      label_18.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_18.setHorizontalAlignment(SwingConstants.CENTER);
      label_18.setBounds(478, 72, 119, 26);
      °£½Ä.add(label_18);

      JLabel label_19 = new JLabel("\uBD95\uC5B4\uBE75");
      label_19.setHorizontalAlignment(SwingConstants.CENTER);
      label_19.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_19.setBounds(2, 168, 119, 26);
      °£½Ä.add(label_19);

      JLabel label_20 = new JLabel("\uC0AC\uACFC");
      label_20.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_20.setHorizontalAlignment(SwingConstants.CENTER);
      label_20.setBounds(121, 168, 119, 26);
      °£½Ä.add(label_20);

      JLabel label_21 = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
      label_21.setHorizontalAlignment(SwingConstants.CENTER);
      label_21.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_21.setBounds(240, 168, 119, 26);
      °£½Ä.add(label_21);

      JLabel label_22 = new JLabel("\uC544\uBAAC\uB4DC");
      label_22.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_22.setHorizontalAlignment(SwingConstants.CENTER);
      label_22.setBounds(359, 168, 119, 26);
      °£½Ä.add(label_22);

      JLabel label_23 = new JLabel("\uC544\uC774\uC2A4\uD06C\uB9BC");
      label_23.setHorizontalAlignment(SwingConstants.CENTER);
      label_23.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_23.setBounds(478, 168, 119, 26);
      °£½Ä.add(label_23);

      JLabel label_24 = new JLabel("\uC6B0\uC720");
      label_24.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_24.setHorizontalAlignment(SwingConstants.CENTER);
      label_24.setBounds(2, 266, 119, 26);
      °£½Ä.add(label_24);

      JLabel label_25 = new JLabel("\uCD08\uCF5C\uB9BF");
      label_25.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_25.setHorizontalAlignment(SwingConstants.CENTER);
      label_25.setBounds(121, 266, 119, 26);
      °£½Ä.add(label_25);

      JLabel label_26 = new JLabel("\uCF00\uC774\uD06C");
      label_26.setHorizontalAlignment(SwingConstants.CENTER);
      label_26.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_26.setBounds(240, 266, 119, 26);
      °£½Ä.add(label_26);

      JLabel label_27 = new JLabel("\uCFE0\uD0A4");
      label_27.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_27.setHorizontalAlignment(SwingConstants.CENTER);
      label_27.setBounds(359, 266, 119, 26);
      °£½Ä.add(label_27);

      JLabel label_28 = new JLabel("\uD1A0\uB9C8\uD1A0");
      label_28.setHorizontalAlignment(SwingConstants.CENTER);
      label_28.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      label_28.setBounds(478, 266, 119, 26);
      °£½Ä.add(label_28);

      JPanel ½Ä»ç = new JPanel();
      ½Ä»ç.setBounds(12, 66, 599, 292);
      CaloriesPanel.add(½Ä»ç);
      ½Ä»ç.setBackground(Color.WHITE);
      ½Ä»ç.setVisible(false);
      ½Ä»ç.setLayout(null);

      /*
      JButton button = new JButton("\uCE7C\uB85C\uB9AC \uACC4\uC0B0");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            CaloriesPanel.setVisible(true);
            ½Ä»ç.setVisible(false);
            °£½Ä.setVisible(false);
         }
      });
      button.setForeground(Color.BLACK);
      button.setBackground(Color.PINK);
      button.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
      button.setBounds(12, 147, 105, 31);
      panel.add(button);

      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(153, 10, 623, 467);
      contentPane.add(panel_2);
      

      button_2.setForeground(Color.BLACK);
      button_2.setBackground(Color.PINK);
      button_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
      button_2.setBounds(12, 368, 105, 31);
      panel.add(button_2);
*/
      JButton btnNewButton_3 = new JButton(new ImageIcon("Image/¶±ººÀÌ.png"));
      btnNewButton_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ¶±ººÀÌ = 306;
            textField.setText("¶±ººÀÌ Ä®·Î¸® : " + ¶±ººÀÌ + "Kcal (200g)");
            result += ¶±ººÀÌ;
            textArea.append("¶±ººÀÌ ");
            textArea_2.append(" " + ¶±ººÀÌ);
         }
      });
      btnNewButton_3.setBounds(2, 0, 119, 74);
      ½Ä»ç.add(btnNewButton_3);

      JButton button_3 = new JButton(new ImageIcon("Image/±è¹ä.png"));
      button_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ±è¹ä = 317;
            textField.setText("±è¹ä Ä®·Î¸® : " + ±è¹ä + "Kcal (200g)");
            result += ±è¹ä;
            textArea.append("±è¹ä ");
            textArea_2.append(" " + ±è¹ä);
         }
      });
      button_3.setBounds(121, 0, 119, 74);
      ½Ä»ç.add(button_3);

      JButton button_4 = new JButton(new ImageIcon("Image/Ä¡Å².png"));
      button_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Ä¡Å² = 309;
            textField.setText("Ä¡Å² Ä®·Î¸® : " + Ä¡Å² + "Kcal (200g)");
            result += Ä¡Å²;
            textArea.append("Ä¡Å² ");
            textArea_2.append(" " + Ä¡Å²);
         }
      });
      button_4.setBounds(240, 0, 119, 74);
      ½Ä»ç.add(button_4);

      JButton button_5 = new JButton(new ImageIcon("Image/Â¥Àå¸é.png"));
      button_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Â¥Àå¸é = 122;
            textField.setText("Â¥Àå¸é Ä®·Î¸® : " + Â¥Àå¸é + "Kcal (100g)");
            result += Â¥Àå¸é;
            textArea.append("Â¥Àå¸é ");
            textArea_2.append(" " + Â¥Àå¸é);
         }
      });
      button_5.setBounds(359, 0, 119, 74);
      ½Ä»ç.add(button_5);

      JButton button_6 = new JButton(new ImageIcon("Image/Á·¹ß.png"));
      button_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Á·¹ß = 393;
            textField.setText("Á·¹ß Ä®·Î¸® : " + Á·¹ß + "Kcal (150g)");
            result += Á·¹ß;
            textArea.append("Á·¹ß ");
            textArea_2.append(" " + Á·¹ß);
         }
      });
      button_6.setBounds(478, 0, 119, 74);
      ½Ä»ç.add(button_6);

      JButton button_7 = new JButton(new ImageIcon("Image/ÇÜ¹ö°Å.png"));
      button_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ÇÜ¹ö°Å = 558;
            textField.setText("ÇÜ¹ö°Å Ä®·Î¸® : " + ÇÜ¹ö°Å + "Kcal (200g)");
            result += ÇÜ¹ö°Å;
            textArea.append("ÇÜ¹ö°Å ");
            textArea_2.append(" " + ÇÜ¹ö°Å);
         }
      });
      button_7.setBounds(2, 97, 119, 74);
      ½Ä»ç.add(button_7);

      JButton button_8 = new JButton(new ImageIcon("Image/ÃÊ¹ä.png"));
      button_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ÃÊ¹ä = 400;
            textField.setText("ÃÊ¹ä Ä®·Î¸® : " + ÃÊ¹ä + "Kcal (10°³)");
            result += ÃÊ¹ä;
            textArea.append("ÃÊ¹ä ");
            textArea_2.append(" " + ÃÊ¹ä);
         }
      });
      button_8.setBounds(121, 97, 119, 74);
      ½Ä»ç.add(button_8);

      JButton button_9 = new JButton(new ImageIcon("Image/ÀâÃ¤.png"));
      button_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ÀâÃ¤ = 191;
            textField.setText("ÀâÃ¤ Ä®·Î¸® : " + ÀâÃ¤ + "Kcal (200g)");
            result += ÀâÃ¤;
            textArea.append("ÀâÃ¤ ");
            textArea_2.append(" " + ÀâÃ¤);
         }
      });
      button_9.setBounds(240, 97, 119, 74);
      ½Ä»ç.add(button_9);

      JButton button_10 = new JButton(new ImageIcon("Image/½ºÅ×ÀÌÅ©.png"));
      button_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ½ºÅ×ÀÌÅ© = 240;
            textField.setText("½ºÅ×ÀÌÅ© Ä®·Î¸® : " + ½ºÅ×ÀÌÅ© + "Kcal (100g)");
            result += ½ºÅ×ÀÌÅ©;
            textArea.append("½ºÅ×ÀÌÅ© ");
            textArea_2.append(" " + ½ºÅ×ÀÌÅ©);
         }
      });
      button_10.setBounds(359, 97, 119, 74);
      ½Ä»ç.add(button_10);

      JButton button_11 = new JButton(new ImageIcon("Image/³Ã¸é.png"));
      button_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ³Ã¸é = 540;
            textField.setText("³Ã¸é Ä®·Î¸® : " + ³Ã¸é + "Kcal (200g)");
            result += ³Ã¸é;
            textArea.append("³Ã¸é ");
            textArea_2.append(" " + ³Ã¸é);
         }
      });
      button_11.setBounds(478, 97, 119, 74);
      ½Ä»ç.add(button_11);

      JButton button_12 = new JButton(new ImageIcon("Image/µ·±î½º.png"));
      button_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            µ·±î½º = 133;
            textField.setText("µ·±î½º Ä®·Î¸® : " + µ·±î½º + "Kcal (100g)");
            result += µ·±î½º;
            textArea.append("µ·±î½º ");
            textArea_2.append(" " + µ·±î½º);
         }
      });
      button_12.setBounds(2, 194, 119, 74);
      ½Ä»ç.add(button_12);

      JButton button_13 = new JButton(new ImageIcon("Image/½Ò¹ä.png"));
      button_13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ½Ò¹ä = 272;
            textField.setText("½Ò¹ä Ä®·Î¸® : " + ½Ò¹ä + "Kcal (200g)");
            result += ½Ò¹ä;
            textArea.append("½Ò¹ä ");
            textArea_2.append(" " + ½Ò¹ä);
         }
      });
      button_13.setBounds(121, 194, 119, 74);
      ½Ä»ç.add(button_13);

      JButton button_14 = new JButton(new ImageIcon("Image/°¥ºñÂò.png"));
      button_14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            °¥ºñÂò = 295;
            textField.setText("µÅÁö°¥ºñÂò Ä®·Î¸® : " + °¥ºñÂò + "Kcal (200g)");
            result += °¥ºñÂò;
            textArea.append("µÅÁö°¥ºñÂò ");
            textArea_2.append(" " + °¥ºñÂò);
         }
      });
      button_14.setBounds(240, 194, 119, 74);
      ½Ä»ç.add(button_14);

      JButton button_15 = new JButton(new ImageIcon("Image/ÇÇÀÚ.png"));
      button_15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ÇÇÀÚ = 330;
            textField.setText("ÇÇÀÚ Ä®·Î¸® : " + ÇÇÀÚ + "Kcal (100g)");
            result += ÇÇÀÚ;
            textArea.append("ÇÇÀÚ ");
            textArea_2.append(" " + ÇÇÀÚ);
         }
      });
      button_15.setBounds(359, 194, 119, 74);
      ½Ä»ç.add(button_15);

      JButton button_16 = new JButton(new ImageIcon("Image/»ï°ã»ì.png"));
      button_16.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            »ï°ã»ì = 348;
            textField.setText("»ï°ã»ì Ä®·Î¸® : " + »ï°ã»ì + "Kcal (100g)");
            result += »ï°ã»ì;
            textArea.append("»ï°ã»ì ");
            textArea_2.append(" " + »ï°ã»ì);
         }
      });
      button_16.setBounds(478, 194, 119, 74);
      ½Ä»ç.add(button_16);

      JLabel lblNewLabel_2 = new JLabel("\uB5A1\uBCF6\uC774");
      lblNewLabel_2.setBackground(Color.WHITE);
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setFont(new Font("Gulim", Font.PLAIN, 12));
      lblNewLabel_2.setBounds(2, 72, 119, 27);
      ½Ä»ç.add(lblNewLabel_2);

      JLabel label_1 = new JLabel("\uAE40\uBC25");
      label_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_1.setBackground(Color.WHITE);
      label_1.setBounds(121, 72, 119, 27);
      ½Ä»ç.add(label_1);

      JLabel label_2 = new JLabel("\uCE58\uD0A8");
      label_2.setHorizontalAlignment(SwingConstants.CENTER);
      label_2.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_2.setBackground(Color.WHITE);
      label_2.setBounds(240, 72, 119, 27);
      ½Ä»ç.add(label_2);

      JLabel label_3 = new JLabel("\uC9DC\uC7A5\uBA74");
      label_3.setHorizontalAlignment(SwingConstants.CENTER);
      label_3.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_3.setBackground(Color.WHITE);
      label_3.setBounds(359, 72, 119, 27);
      ½Ä»ç.add(label_3);

      JLabel label_4 = new JLabel("\uC871\uBC1C");
      label_4.setHorizontalAlignment(SwingConstants.CENTER);
      label_4.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_4.setBackground(Color.WHITE);
      label_4.setBounds(478, 72, 119, 27);
      ½Ä»ç.add(label_4);

      JLabel label_5 = new JLabel("\uD584\uBC84\uAC70");
      label_5.setHorizontalAlignment(SwingConstants.CENTER);
      label_5.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_5.setBackground(Color.WHITE);
      label_5.setBounds(2, 170, 119, 27);
      ½Ä»ç.add(label_5);

      JLabel label_6 = new JLabel("\uCD08\uBC25");
      label_6.setHorizontalAlignment(SwingConstants.CENTER);
      label_6.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_6.setBackground(Color.WHITE);
      label_6.setBounds(121, 170, 119, 27);
      ½Ä»ç.add(label_6);

      JLabel label_7 = new JLabel("\uC7A1\uCC44");
      label_7.setHorizontalAlignment(SwingConstants.CENTER);
      label_7.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_7.setBackground(Color.WHITE);
      label_7.setBounds(240, 170, 119, 27);
      ½Ä»ç.add(label_7);

      JLabel label_8 = new JLabel("\uC2A4\uD14C\uC774\uD06C");
      label_8.setHorizontalAlignment(SwingConstants.CENTER);
      label_8.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_8.setBackground(Color.WHITE);
      label_8.setBounds(359, 170, 119, 27);
      ½Ä»ç.add(label_8);

      JLabel label_9 = new JLabel("\uB0C9\uBA74");
      label_9.setHorizontalAlignment(SwingConstants.CENTER);
      label_9.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_9.setBackground(Color.WHITE);
      label_9.setBounds(478, 170, 119, 27);
      ½Ä»ç.add(label_9);

      JLabel label_10 = new JLabel("\uB3C8\uAE4C\uC2A4");
      label_10.setHorizontalAlignment(SwingConstants.CENTER);
      label_10.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_10.setBackground(Color.WHITE);
      label_10.setBounds(2, 265, 119, 27);
      ½Ä»ç.add(label_10);

      JLabel label_11 = new JLabel("\uC300\uBC25");
      label_11.setHorizontalAlignment(SwingConstants.CENTER);
      label_11.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_11.setBackground(Color.WHITE);
      label_11.setBounds(121, 265, 119, 27);
      ½Ä»ç.add(label_11);

      JLabel label_12 = new JLabel("\uAC08\uBE44\uCC1C");
      label_12.setHorizontalAlignment(SwingConstants.CENTER);
      label_12.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_12.setBackground(Color.WHITE);
      label_12.setBounds(240, 265, 119, 27);
      ½Ä»ç.add(label_12);

      JLabel label_13 = new JLabel("\uD53C\uC790");
      label_13.setHorizontalAlignment(SwingConstants.CENTER);
      label_13.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_13.setBackground(Color.WHITE);
      label_13.setBounds(359, 265, 119, 27);
      ½Ä»ç.add(label_13);

      JLabel label_14 = new JLabel("\uC0BC\uACB9\uC0B4");
      label_14.setHorizontalAlignment(SwingConstants.CENTER);
      label_14.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      label_14.setBackground(Color.WHITE);
      label_14.setBounds(478, 265, 119, 27);
      ½Ä»ç.add(label_14);

      JPanel Á¦¸ñ = new JPanel();
      Á¦¸ñ.setBounds(12, 0, 599, 44);
      CaloriesPanel.add(Á¦¸ñ);
      Á¦¸ñ.setBackground(Color.WHITE);
      Á¦¸ñ.setLayout(new BorderLayout(0, 0));

      JLabel lblNewLabel = new JLabel("\uCE7C\uB85C\uB9AC \uACC4\uC0B0");
      Á¦¸ñ.add(lblNewLabel, BorderLayout.NORTH);
      lblNewLabel.setBackground(Color.WHITE);
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setForeground(new Color(0, 0, 0));
      lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));

      JLabel lblNewLabel_1 = new JLabel(
            "\uC12D\uCDE8\uD55C \uC74C\uC2DD\uC758 \uC0AC\uC9C4\uC744 \uD074\uB9AD\uD558\uC138\uC694.");
      Á¦¸ñ.add(lblNewLabel_1, BorderLayout.CENTER);
      lblNewLabel_1.setBackground(Color.WHITE);
      lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

      JPanel ¸Þ´º = new JPanel();
      ¸Þ´º.setBackground(Color.WHITE);
      ¸Þ´º.setBounds(12, 44, 114, 23);
      CaloriesPanel.add(¸Þ´º);
      ¸Þ´º.setLayout(new BoxLayout(¸Þ´º, BoxLayout.X_AXIS));

      JButton btnNewButton_1 = new JButton("\uC2DD\uC0AC");
      btnNewButton_1.setForeground(new Color(0, 0, 0));
      btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      btnNewButton_1.setBackground(Color.PINK);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            °£½Ä.setVisible(false);
            ½Ä»ç.setVisible(true);
         }
      });
      ¸Þ´º.add(btnNewButton_1);

      JButton btnNewButton_2 = new JButton("\uAC04\uC2DD");
      btnNewButton_2.setForeground(Color.BLACK);
      btnNewButton_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      btnNewButton_2.setBackground(Color.PINK);
      ¸Þ´º.add(btnNewButton_2);

      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.PINK);
      panel_1.setBounds(12, 359, 599, 35);
      CaloriesPanel.add(panel_1);
      panel_1.setLayout(null);

      textField = new JTextField();
      textField.setBounds(0, 15, 409, 20);
      panel_1.add(textField);
      textField.setColumns(10);

      JLabel lblNewLabel_4 = new JLabel(
            "\uD574\uB2F9 \uC74C\uC2DD\uC758 \uCE7C\uB85C\uB9AC (\uD558\uB8E8 \uAD8C\uC7A5\uB7C9 \uAE30\uC900)");
      lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_4.setBounds(0, 0, 407, 15);
      panel_1.add(lblNewLabel_4);

      JButton button_17 = new JButton("\uB9AC\uC14B");
      button_17.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            result = 0;
            textArea.setText("");
            textField.setText("");
            textArea_1.setText("");
            textArea_2.setText("");
         }
      });
      button_17.setBackground(Color.WHITE);
      button_17.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      button_17.setBounds(502, 0, 97, 35);
      panel_1.add(button_17);

      JButton button_18 = new JButton("\uACC4\uC0B0");
      button_18.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (result > 2000) {
               textArea_1.append(" ÇÏ·ç ±ÇÀå Ä®·Î¸®¸¦ ³Ñ¾ú½À´Ï´Ù! ¼±ÅÃÀ» ÁÙÀÌ½Ê½Ã¿À!!!");
            }
            textArea_2.append(" => " + result + "   ");
         }
      });
      button_18.setBackground(Color.WHITE);
      button_18.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
      button_18.setBounds(407, 0, 97, 35);
      panel_1.add(button_18);

      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ½Ä»ç.setVisible(false);
            °£½Ä.setVisible(true);
         }
      });
   }
}