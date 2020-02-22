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

// ���Ĺ� Į�θ� ��� �� ���� �ڵ�
public class Calories extends JFrame {
;
   private JTextField textField;
   JPanel CaloriesPanel;
   public int result = 0;
   public int ������, ���, �ʹ�, ġŲ, ¥���, ����, �ܹ���, ��ä, ������ũ, �ø�, ���, �ҹ�, ������, ����, ����;
   public int ����Ƣ��, ����, ��, ��, ��ī��, �ؾ, ���, �Ƹ޸�ī��, �Ƹ��, ���̽�ũ��, ����, ���ݸ�, ����ũ, ��Ű, �丶��;
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

      JPanel ��� = new JPanel();
      ���.setBackground(Color.PINK);
      ���.setBounds(12, 394, 599, 71);
      CaloriesPanel.add(���);
      ���.setLayout(null);

      JTextArea textArea = new JTextArea();
      textArea.setBounds(90, 25, 507, 21);
      ���.add(textArea);

      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBounds(90, 2, 507, 21);
      ���.add(textArea_1);

      JLabel lblNewLabel_5 = new JLabel(" \uACBD\uACE0 \uBA54\uC2DC\uC9C0");
      lblNewLabel_5.setFont(new Font("���� ���", Font.PLAIN, 12));
      lblNewLabel_5.setBackground(Color.WHITE);
      lblNewLabel_5.setBounds(0, 2, 87, 19);
      ���.add(lblNewLabel_5);

      JLabel label_29 = new JLabel(" \uC120\uD0DD \uBA54\uB274");
      label_29.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_29.setBackground(Color.WHITE);
      label_29.setBounds(0, 25, 87, 19);
      ���.add(label_29);

      JLabel label = new JLabel(" \uCD1D \uCE7C\uB85C\uB9AC");
      label.setFont(new Font("���� ���", Font.PLAIN, 12));
      label.setBackground(Color.WHITE);
      label.setBounds(0, 48, 87, 19);
      ���.add(label);

      JTextArea textArea_2 = new JTextArea();
      textArea_2.setBounds(90, 48, 507, 21);
      ���.add(textArea_2);



      JPanel ���� = new JPanel();
      ����.setBounds(12, 66, 599, 292);
      CaloriesPanel.add(����);
      ����.setBackground(Color.WHITE);
      ����.setVisible(false);
      ����.setLayout(null);

      JButton button_21 = new JButton(new ImageIcon("Image/����Ƣ��.png"));
      button_21.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ����Ƣ�� = 306;
            textField.setText("����Ƣ�� Į�θ� : " + ����Ƣ�� + "Kcal (100g)");
            result += ����Ƣ��;
            textArea.append("����Ƣ�� ");
            textArea_2.append(" " + ����Ƣ��);
         }
      });
      button_21.setBounds(2, 0, 119, 74);
      ����.add(button_21);

      JButton button_22 = new JButton(new ImageIcon("Image/����.png"));
      button_22.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ���� = 131;
            textField.setText("���� Į�θ� : " + ���� + "Kcal (100g)");
            result += ����;
            textArea.append("���� ");
            textArea_2.append(" " + ����);
         }
      });
      button_22.setBounds(121, 0, 119, 74);
      ����.add(button_22);

      JButton button_23 = new JButton(new ImageIcon("Image/��.png"));
      button_23.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �� = 34;
            textField.setText("�� Į�θ� : " + �� + "Kcal (100g)");
            result += ��;
            textArea.append("�� ");
            textArea_2.append(" " + ��);
         }
      });
      button_23.setBounds(240, 0, 119, 74);
      ����.add(button_23);

      JButton button_24 = new JButton(new ImageIcon("Image/��.png"));
      button_24.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �� = 250;
            textField.setText("�� Į�θ� : " + �� + "Kcal (5��)");
            result += ��;
            textArea.append("�� ");
            textArea_2.append(" " + ��);
         }
      });
      button_24.setBounds(359, 0, 119, 74);
      ����.add(button_24);

      JButton button_25 = new JButton(new ImageIcon("Image/��ī��.png"));
      button_25.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ��ī�� = 159;
            textField.setText("��ī�� Į�θ� : " + ��ī�� + "Kcal (159g)");
            result += ��ī��;
            textArea.append("��ī�� ");
            textArea_2.append(" " + ��ī��);
         }
      });
      button_25.setBounds(478, 0, 119, 74);
      ����.add(button_25);

      JButton button_26 = new JButton(new ImageIcon("Image/�ؾ.png"));
      button_26.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �ؾ = 106;
            textField.setText("�ؾ Į�θ� : " + �ؾ + "Kcal (50g)");
            result += �ؾ;
            textArea.append("�ؾ ");
            textArea_2.append(" " + �ؾ);
         }
      });
      button_26.setBounds(2, 97, 119, 74);
      ����.add(button_26);

      JButton button_27 = new JButton(new ImageIcon("Image/���.png"));
      button_27.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ��� = 57;
            textField.setText("��� Į�θ� : " + ��� + "Kcal (100g)");
            result += ���;
            textArea.append("��� ");
            textArea_2.append(" " + ���);
         }
      });
      button_27.setBounds(121, 97, 119, 74);
      ����.add(button_27);

      JButton button_28 = new JButton(new ImageIcon("Image/�Ƹ޸�ī��.png"));
      button_28.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �Ƹ޸�ī�� = 10;
            textField.setText("�Ƹ޸�ī�� Į�θ� : " + �Ƹ޸�ī�� + "Kcal (1��)");
            result += �Ƹ޸�ī��;
            textArea.append("�Ƹ޸�ī�� ");
            textArea_2.append(" " + �Ƹ޸�ī��);
         }
      });
      button_28.setBounds(240, 97, 119, 74);
      ����.add(button_28);

      JButton button_29 = new JButton(new ImageIcon("Image/�Ƹ��.png"));
      button_29.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �Ƹ�� = 6;
            textField.setText("�Ƹ�� Į�θ� : " + �Ƹ�� + "Kcal (1��)");
            result += �Ƹ��;
            textArea.append("�Ƹ�� ");
            textArea_2.append(" " + �Ƹ��);
         }
      });
      button_29.setBounds(359, 97, 119, 74);
      ����.add(button_29);

      JButton button_30 = new JButton(new ImageIcon("Image/���̽�ũ��.png"));
      button_30.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ���̽�ũ�� = 130;
            textField.setText("���̽�ũ�� Į�θ� : " + ���̽�ũ�� + "Kcal (1��)");
            result += ���̽�ũ��;
            textArea.append("���̽�ũ�� ");
            textArea_2.append(" " + ���̽�ũ��);
         }
      });
      button_30.setBounds(478, 97, 119, 74);
      ����.add(button_30);

      JButton button_31 = new JButton(new ImageIcon("Image/����.png"));
      button_31.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ���� = 66;
            textField.setText("���� Į�θ� : " + ���� + "Kcal (100g)");
            result += ����;
            textArea.append("���� ");
            textArea_2.append(" " + ����);
         }
      });
      button_31.setBounds(2, 194, 119, 74);
      ����.add(button_31);

      JButton button_32 = new JButton(new ImageIcon("Image/���ݸ�.png"));
      button_32.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ���ݸ� = 550;
            textField.setText("���ݸ� Į�θ� : " + ���ݸ� + "Kcal (100g)");
            result += ���ݸ�;
            textArea.append("���ݸ� ");
            textArea_2.append(" " + ���ݸ�);
         }
      });
      button_32.setBounds(121, 194, 119, 74);
      ����.add(button_32);

      JButton button_33 = new JButton(new ImageIcon("Image/����ũ.png"));
      button_33.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ����ũ = 220;
            textField.setText("����ũ Į�θ� : " + ����ũ + "Kcal (55g)");
            result += ����ũ;
            textArea.append("����ũ ");
            textArea_2.append(" " + ����ũ);
         }
      });
      button_33.setBounds(240, 194, 119, 74);
      ����.add(button_33);

      JButton button_34 = new JButton(new ImageIcon("Image/��Ű.png"));
      button_34.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ��Ű = 45;
            textField.setText("��Ű Į�θ� : " + ��Ű + "Kcal (30g)");
            result += ��Ű;
            textArea.append("��Ű ");
            textArea_2.append(" " + ��Ű);
         }
      });
      button_34.setBounds(359, 194, 119, 74);
      ����.add(button_34);

      JButton button_35 = new JButton(new ImageIcon("Image/�丶��.png"));
      button_35.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �丶�� = 22;
            textField.setText("�丶�� Į�θ� : " + �丶�� + "Kcal (22g)");
            result += �丶��;
            textArea.append("�丶�� ");
            textArea_2.append(" " + �丶��);
         }
      });
      button_35.setBounds(478, 194, 119, 74);
      ����.add(button_35);

      JLabel lblNewLabel_3 = new JLabel("\uAC10\uC790\uD280\uAE40");
      lblNewLabel_3.setFont(new Font("���� ���", Font.PLAIN, 12));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_3.setBounds(2, 72, 119, 26);
      ����.add(lblNewLabel_3);

      JLabel label_15 = new JLabel("\uACE0\uAD6C\uB9C8");
      label_15.setHorizontalAlignment(SwingConstants.CENTER);
      label_15.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_15.setBounds(121, 72, 119, 26);
      ����.add(label_15);

      JLabel label_16 = new JLabel("\uADE4");
      label_16.setHorizontalAlignment(SwingConstants.CENTER);
      label_16.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_16.setBounds(240, 72, 119, 26);
      ����.add(label_16);

      JLabel label_17 = new JLabel("\uB5A1");
      label_17.setHorizontalAlignment(SwingConstants.CENTER);
      label_17.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_17.setBounds(359, 72, 119, 26);
      ����.add(label_17);

      JLabel label_18 = new JLabel("\uB9C8\uCE74\uB871");
      label_18.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_18.setHorizontalAlignment(SwingConstants.CENTER);
      label_18.setBounds(478, 72, 119, 26);
      ����.add(label_18);

      JLabel label_19 = new JLabel("\uBD95\uC5B4\uBE75");
      label_19.setHorizontalAlignment(SwingConstants.CENTER);
      label_19.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_19.setBounds(2, 168, 119, 26);
      ����.add(label_19);

      JLabel label_20 = new JLabel("\uC0AC\uACFC");
      label_20.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_20.setHorizontalAlignment(SwingConstants.CENTER);
      label_20.setBounds(121, 168, 119, 26);
      ����.add(label_20);

      JLabel label_21 = new JLabel("\uC544\uBA54\uB9AC\uCE74\uB178");
      label_21.setHorizontalAlignment(SwingConstants.CENTER);
      label_21.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_21.setBounds(240, 168, 119, 26);
      ����.add(label_21);

      JLabel label_22 = new JLabel("\uC544\uBAAC\uB4DC");
      label_22.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_22.setHorizontalAlignment(SwingConstants.CENTER);
      label_22.setBounds(359, 168, 119, 26);
      ����.add(label_22);

      JLabel label_23 = new JLabel("\uC544\uC774\uC2A4\uD06C\uB9BC");
      label_23.setHorizontalAlignment(SwingConstants.CENTER);
      label_23.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_23.setBounds(478, 168, 119, 26);
      ����.add(label_23);

      JLabel label_24 = new JLabel("\uC6B0\uC720");
      label_24.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_24.setHorizontalAlignment(SwingConstants.CENTER);
      label_24.setBounds(2, 266, 119, 26);
      ����.add(label_24);

      JLabel label_25 = new JLabel("\uCD08\uCF5C\uB9BF");
      label_25.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_25.setHorizontalAlignment(SwingConstants.CENTER);
      label_25.setBounds(121, 266, 119, 26);
      ����.add(label_25);

      JLabel label_26 = new JLabel("\uCF00\uC774\uD06C");
      label_26.setHorizontalAlignment(SwingConstants.CENTER);
      label_26.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_26.setBounds(240, 266, 119, 26);
      ����.add(label_26);

      JLabel label_27 = new JLabel("\uCFE0\uD0A4");
      label_27.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_27.setHorizontalAlignment(SwingConstants.CENTER);
      label_27.setBounds(359, 266, 119, 26);
      ����.add(label_27);

      JLabel label_28 = new JLabel("\uD1A0\uB9C8\uD1A0");
      label_28.setHorizontalAlignment(SwingConstants.CENTER);
      label_28.setFont(new Font("���� ���", Font.PLAIN, 12));
      label_28.setBounds(478, 266, 119, 26);
      ����.add(label_28);

      JPanel �Ļ� = new JPanel();
      �Ļ�.setBounds(12, 66, 599, 292);
      CaloriesPanel.add(�Ļ�);
      �Ļ�.setBackground(Color.WHITE);
      �Ļ�.setVisible(false);
      �Ļ�.setLayout(null);

      /*
      JButton button = new JButton("\uCE7C\uB85C\uB9AC \uACC4\uC0B0");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            CaloriesPanel.setVisible(true);
            �Ļ�.setVisible(false);
            ����.setVisible(false);
         }
      });
      button.setForeground(Color.BLACK);
      button.setBackground(Color.PINK);
      button.setFont(new Font("���� ���", Font.BOLD, 12));
      button.setBounds(12, 147, 105, 31);
      panel.add(button);

      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(153, 10, 623, 467);
      contentPane.add(panel_2);
      

      button_2.setForeground(Color.BLACK);
      button_2.setBackground(Color.PINK);
      button_2.setFont(new Font("���� ���", Font.BOLD, 12));
      button_2.setBounds(12, 368, 105, 31);
      panel.add(button_2);
*/
      JButton btnNewButton_3 = new JButton(new ImageIcon("Image/������.png"));
      btnNewButton_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ������ = 306;
            textField.setText("������ Į�θ� : " + ������ + "Kcal (200g)");
            result += ������;
            textArea.append("������ ");
            textArea_2.append(" " + ������);
         }
      });
      btnNewButton_3.setBounds(2, 0, 119, 74);
      �Ļ�.add(btnNewButton_3);

      JButton button_3 = new JButton(new ImageIcon("Image/���.png"));
      button_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ��� = 317;
            textField.setText("��� Į�θ� : " + ��� + "Kcal (200g)");
            result += ���;
            textArea.append("��� ");
            textArea_2.append(" " + ���);
         }
      });
      button_3.setBounds(121, 0, 119, 74);
      �Ļ�.add(button_3);

      JButton button_4 = new JButton(new ImageIcon("Image/ġŲ.png"));
      button_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ġŲ = 309;
            textField.setText("ġŲ Į�θ� : " + ġŲ + "Kcal (200g)");
            result += ġŲ;
            textArea.append("ġŲ ");
            textArea_2.append(" " + ġŲ);
         }
      });
      button_4.setBounds(240, 0, 119, 74);
      �Ļ�.add(button_4);

      JButton button_5 = new JButton(new ImageIcon("Image/¥���.png"));
      button_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ¥��� = 122;
            textField.setText("¥��� Į�θ� : " + ¥��� + "Kcal (100g)");
            result += ¥���;
            textArea.append("¥��� ");
            textArea_2.append(" " + ¥���);
         }
      });
      button_5.setBounds(359, 0, 119, 74);
      �Ļ�.add(button_5);

      JButton button_6 = new JButton(new ImageIcon("Image/����.png"));
      button_6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ���� = 393;
            textField.setText("���� Į�θ� : " + ���� + "Kcal (150g)");
            result += ����;
            textArea.append("���� ");
            textArea_2.append(" " + ����);
         }
      });
      button_6.setBounds(478, 0, 119, 74);
      �Ļ�.add(button_6);

      JButton button_7 = new JButton(new ImageIcon("Image/�ܹ���.png"));
      button_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            �ܹ��� = 558;
            textField.setText("�ܹ��� Į�θ� : " + �ܹ��� + "Kcal (200g)");
            result += �ܹ���;
            textArea.append("�ܹ��� ");
            textArea_2.append(" " + �ܹ���);
         }
      });
      button_7.setBounds(2, 97, 119, 74);
      �Ļ�.add(button_7);

      JButton button_8 = new JButton(new ImageIcon("Image/�ʹ�.png"));
      button_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            �ʹ� = 400;
            textField.setText("�ʹ� Į�θ� : " + �ʹ� + "Kcal (10��)");
            result += �ʹ�;
            textArea.append("�ʹ� ");
            textArea_2.append(" " + �ʹ�);
         }
      });
      button_8.setBounds(121, 97, 119, 74);
      �Ļ�.add(button_8);

      JButton button_9 = new JButton(new ImageIcon("Image/��ä.png"));
      button_9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ��ä = 191;
            textField.setText("��ä Į�θ� : " + ��ä + "Kcal (200g)");
            result += ��ä;
            textArea.append("��ä ");
            textArea_2.append(" " + ��ä);
         }
      });
      button_9.setBounds(240, 97, 119, 74);
      �Ļ�.add(button_9);

      JButton button_10 = new JButton(new ImageIcon("Image/������ũ.png"));
      button_10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ������ũ = 240;
            textField.setText("������ũ Į�θ� : " + ������ũ + "Kcal (100g)");
            result += ������ũ;
            textArea.append("������ũ ");
            textArea_2.append(" " + ������ũ);
         }
      });
      button_10.setBounds(359, 97, 119, 74);
      �Ļ�.add(button_10);

      JButton button_11 = new JButton(new ImageIcon("Image/�ø�.png"));
      button_11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            �ø� = 540;
            textField.setText("�ø� Į�θ� : " + �ø� + "Kcal (200g)");
            result += �ø�;
            textArea.append("�ø� ");
            textArea_2.append(" " + �ø�);
         }
      });
      button_11.setBounds(478, 97, 119, 74);
      �Ļ�.add(button_11);

      JButton button_12 = new JButton(new ImageIcon("Image/���.png"));
      button_12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ��� = 133;
            textField.setText("��� Į�θ� : " + ��� + "Kcal (100g)");
            result += ���;
            textArea.append("��� ");
            textArea_2.append(" " + ���);
         }
      });
      button_12.setBounds(2, 194, 119, 74);
      �Ļ�.add(button_12);

      JButton button_13 = new JButton(new ImageIcon("Image/�ҹ�.png"));
      button_13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            �ҹ� = 272;
            textField.setText("�ҹ� Į�θ� : " + �ҹ� + "Kcal (200g)");
            result += �ҹ�;
            textArea.append("�ҹ� ");
            textArea_2.append(" " + �ҹ�);
         }
      });
      button_13.setBounds(121, 194, 119, 74);
      �Ļ�.add(button_13);

      JButton button_14 = new JButton(new ImageIcon("Image/������.png"));
      button_14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ������ = 295;
            textField.setText("���������� Į�θ� : " + ������ + "Kcal (200g)");
            result += ������;
            textArea.append("���������� ");
            textArea_2.append(" " + ������);
         }
      });
      button_14.setBounds(240, 194, 119, 74);
      �Ļ�.add(button_14);

      JButton button_15 = new JButton(new ImageIcon("Image/����.png"));
      button_15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ���� = 330;
            textField.setText("���� Į�θ� : " + ���� + "Kcal (100g)");
            result += ����;
            textArea.append("���� ");
            textArea_2.append(" " + ����);
         }
      });
      button_15.setBounds(359, 194, 119, 74);
      �Ļ�.add(button_15);

      JButton button_16 = new JButton(new ImageIcon("Image/����.png"));
      button_16.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ���� = 348;
            textField.setText("���� Į�θ� : " + ���� + "Kcal (100g)");
            result += ����;
            textArea.append("���� ");
            textArea_2.append(" " + ����);
         }
      });
      button_16.setBounds(478, 194, 119, 74);
      �Ļ�.add(button_16);

      JLabel lblNewLabel_2 = new JLabel("\uB5A1\uBCF6\uC774");
      lblNewLabel_2.setBackground(Color.WHITE);
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_2.setFont(new Font("Gulim", Font.PLAIN, 12));
      lblNewLabel_2.setBounds(2, 72, 119, 27);
      �Ļ�.add(lblNewLabel_2);

      JLabel label_1 = new JLabel("\uAE40\uBC25");
      label_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1.setFont(new Font("����", Font.PLAIN, 12));
      label_1.setBackground(Color.WHITE);
      label_1.setBounds(121, 72, 119, 27);
      �Ļ�.add(label_1);

      JLabel label_2 = new JLabel("\uCE58\uD0A8");
      label_2.setHorizontalAlignment(SwingConstants.CENTER);
      label_2.setFont(new Font("����", Font.PLAIN, 12));
      label_2.setBackground(Color.WHITE);
      label_2.setBounds(240, 72, 119, 27);
      �Ļ�.add(label_2);

      JLabel label_3 = new JLabel("\uC9DC\uC7A5\uBA74");
      label_3.setHorizontalAlignment(SwingConstants.CENTER);
      label_3.setFont(new Font("����", Font.PLAIN, 12));
      label_3.setBackground(Color.WHITE);
      label_3.setBounds(359, 72, 119, 27);
      �Ļ�.add(label_3);

      JLabel label_4 = new JLabel("\uC871\uBC1C");
      label_4.setHorizontalAlignment(SwingConstants.CENTER);
      label_4.setFont(new Font("����", Font.PLAIN, 12));
      label_4.setBackground(Color.WHITE);
      label_4.setBounds(478, 72, 119, 27);
      �Ļ�.add(label_4);

      JLabel label_5 = new JLabel("\uD584\uBC84\uAC70");
      label_5.setHorizontalAlignment(SwingConstants.CENTER);
      label_5.setFont(new Font("����", Font.PLAIN, 12));
      label_5.setBackground(Color.WHITE);
      label_5.setBounds(2, 170, 119, 27);
      �Ļ�.add(label_5);

      JLabel label_6 = new JLabel("\uCD08\uBC25");
      label_6.setHorizontalAlignment(SwingConstants.CENTER);
      label_6.setFont(new Font("����", Font.PLAIN, 12));
      label_6.setBackground(Color.WHITE);
      label_6.setBounds(121, 170, 119, 27);
      �Ļ�.add(label_6);

      JLabel label_7 = new JLabel("\uC7A1\uCC44");
      label_7.setHorizontalAlignment(SwingConstants.CENTER);
      label_7.setFont(new Font("����", Font.PLAIN, 12));
      label_7.setBackground(Color.WHITE);
      label_7.setBounds(240, 170, 119, 27);
      �Ļ�.add(label_7);

      JLabel label_8 = new JLabel("\uC2A4\uD14C\uC774\uD06C");
      label_8.setHorizontalAlignment(SwingConstants.CENTER);
      label_8.setFont(new Font("����", Font.PLAIN, 12));
      label_8.setBackground(Color.WHITE);
      label_8.setBounds(359, 170, 119, 27);
      �Ļ�.add(label_8);

      JLabel label_9 = new JLabel("\uB0C9\uBA74");
      label_9.setHorizontalAlignment(SwingConstants.CENTER);
      label_9.setFont(new Font("����", Font.PLAIN, 12));
      label_9.setBackground(Color.WHITE);
      label_9.setBounds(478, 170, 119, 27);
      �Ļ�.add(label_9);

      JLabel label_10 = new JLabel("\uB3C8\uAE4C\uC2A4");
      label_10.setHorizontalAlignment(SwingConstants.CENTER);
      label_10.setFont(new Font("����", Font.PLAIN, 12));
      label_10.setBackground(Color.WHITE);
      label_10.setBounds(2, 265, 119, 27);
      �Ļ�.add(label_10);

      JLabel label_11 = new JLabel("\uC300\uBC25");
      label_11.setHorizontalAlignment(SwingConstants.CENTER);
      label_11.setFont(new Font("����", Font.PLAIN, 12));
      label_11.setBackground(Color.WHITE);
      label_11.setBounds(121, 265, 119, 27);
      �Ļ�.add(label_11);

      JLabel label_12 = new JLabel("\uAC08\uBE44\uCC1C");
      label_12.setHorizontalAlignment(SwingConstants.CENTER);
      label_12.setFont(new Font("����", Font.PLAIN, 12));
      label_12.setBackground(Color.WHITE);
      label_12.setBounds(240, 265, 119, 27);
      �Ļ�.add(label_12);

      JLabel label_13 = new JLabel("\uD53C\uC790");
      label_13.setHorizontalAlignment(SwingConstants.CENTER);
      label_13.setFont(new Font("����", Font.PLAIN, 12));
      label_13.setBackground(Color.WHITE);
      label_13.setBounds(359, 265, 119, 27);
      �Ļ�.add(label_13);

      JLabel label_14 = new JLabel("\uC0BC\uACB9\uC0B4");
      label_14.setHorizontalAlignment(SwingConstants.CENTER);
      label_14.setFont(new Font("����", Font.PLAIN, 12));
      label_14.setBackground(Color.WHITE);
      label_14.setBounds(478, 265, 119, 27);
      �Ļ�.add(label_14);

      JPanel ���� = new JPanel();
      ����.setBounds(12, 0, 599, 44);
      CaloriesPanel.add(����);
      ����.setBackground(Color.WHITE);
      ����.setLayout(new BorderLayout(0, 0));

      JLabel lblNewLabel = new JLabel("\uCE7C\uB85C\uB9AC \uACC4\uC0B0");
      ����.add(lblNewLabel, BorderLayout.NORTH);
      lblNewLabel.setBackground(Color.WHITE);
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setForeground(new Color(0, 0, 0));
      lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 18));

      JLabel lblNewLabel_1 = new JLabel(
            "\uC12D\uCDE8\uD55C \uC74C\uC2DD\uC758 \uC0AC\uC9C4\uC744 \uD074\uB9AD\uD558\uC138\uC694.");
      ����.add(lblNewLabel_1, BorderLayout.CENTER);
      lblNewLabel_1.setBackground(Color.WHITE);
      lblNewLabel_1.setFont(new Font("���� ���", Font.PLAIN, 12));
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

      JPanel �޴� = new JPanel();
      �޴�.setBackground(Color.WHITE);
      �޴�.setBounds(12, 44, 114, 23);
      CaloriesPanel.add(�޴�);
      �޴�.setLayout(new BoxLayout(�޴�, BoxLayout.X_AXIS));

      JButton btnNewButton_1 = new JButton("\uC2DD\uC0AC");
      btnNewButton_1.setForeground(new Color(0, 0, 0));
      btnNewButton_1.setFont(new Font("���� ���", Font.PLAIN, 12));
      btnNewButton_1.setBackground(Color.PINK);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            ����.setVisible(false);
            �Ļ�.setVisible(true);
         }
      });
      �޴�.add(btnNewButton_1);

      JButton btnNewButton_2 = new JButton("\uAC04\uC2DD");
      btnNewButton_2.setForeground(Color.BLACK);
      btnNewButton_2.setFont(new Font("���� ���", Font.PLAIN, 12));
      btnNewButton_2.setBackground(Color.PINK);
      �޴�.add(btnNewButton_2);

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
      lblNewLabel_4.setFont(new Font("���� ���", Font.PLAIN, 12));
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
      button_17.setFont(new Font("���� ���", Font.PLAIN, 12));
      button_17.setBounds(502, 0, 97, 35);
      panel_1.add(button_17);

      JButton button_18 = new JButton("\uACC4\uC0B0");
      button_18.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (result > 2000) {
               textArea_1.append(" �Ϸ� ���� Į�θ��� �Ѿ����ϴ�! ������ ���̽ʽÿ�!!!");
            }
            textArea_2.append(" => " + result + "   ");
         }
      });
      button_18.setBackground(Color.WHITE);
      button_18.setFont(new Font("���� ���", Font.PLAIN, 12));
      button_18.setBounds(407, 0, 97, 35);
      panel_1.add(button_18);

      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            �Ļ�.setVisible(false);
            ����.setVisible(true);
         }
      });
   }
}