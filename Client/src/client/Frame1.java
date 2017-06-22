package client;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

public class Frame1 extends JFrame {
    private JButton Onea = new JButton();
    private JButton jButton1 = new JButton();
    private JFormattedTextField jFormattedTextField1 = new JFormattedTextField();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JButton jButton8 = new JButton();
    private JButton jButton9 = new JButton();
    private JButton jButton10 = new JButton();
    private JButton jButton11 = new JButton();
    private JButton jButton12 = new JButton();
    private JButton jButton13 = new JButton();
    private JButton jButton14 = new JButton();
    private JButton jButton15 = new JButton();
    int num1,num2;

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(421, 349));
        Onea.setText("1");
        Onea.setBounds(new Rectangle(55, 95, 45, 40));
        Onea.setFont(new Font("Tahoma", 1, 14));
        Onea.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jButton1.setText("2");
        jButton1.setBounds(new Rectangle(110, 95, 45, 40));
        jButton1.setFont(new Font("Tahoma", 1, 14));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jFormattedTextField1.setBounds(new Rectangle(50, 35, 280, 45));
        jButton2.setText("3");
        jButton2.setBounds(new Rectangle(165, 95, 45, 40));
        jButton2.setFont(new Font("Tahoma", 1, 14));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton3_actionPerformed(e);
                }
            });
        jButton3.setText("4");
        jButton3.setBounds(new Rectangle(220, 95, 45, 40));
        jButton3.setFont(new Font("Tahoma", 1, 14));
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton4_actionPerformed(e);
                }
            });
        jButton4.setText("5");
        jButton4.setBounds(new Rectangle(55, 150, 45, 40));
        jButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton5_actionPerformed(e);
                }
            });
        jButton5.setText("6");
        jButton5.setBounds(new Rectangle(110, 150, 45, 40));
        jButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton6_actionPerformed(e);
                }
            });
        jButton6.setText("7");
        jButton6.setBounds(new Rectangle(165, 150, 45, 40));
        jButton6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton7_actionPerformed(e);
                }
            });
        jButton7.setText("8");
        jButton7.setBounds(new Rectangle(220, 150, 45, 40));
        jButton7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton8_actionPerformed(e);
                }
            });
        jButton8.setText("9");
        jButton8.setBounds(new Rectangle(55, 205, 45, 40));
        jButton8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton9_actionPerformed(e);
                }
            });
        jButton9.setText("0");
        jButton9.setBounds(new Rectangle(110, 205, 40, 40));
        jButton9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton0_actionPerformed(e);
                }
            });
        jButton10.setText("C");
        jButton10.setBounds(new Rectangle(165, 205, 45, 40));
        jButton10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton10_actionPerformed(e);
                }
            });
        jButton11.setText("=");
        jButton11.setBounds(new Rectangle(220, 205, 45, 40));
        jButton11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton11_actionPerformed(e);
                }
            });
        jButton12.setText("+");
        jButton12.setBounds(new Rectangle(280, 95, 50, 45));
        jButton12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton12_actionPerformed(e);
                }
            });
        jButton13.setText("-");
        jButton13.setBounds(new Rectangle(280, 155, 50, 40));
        jButton13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton13_actionPerformed(e);
                }
            });
        jButton14.setText("*");
        jButton14.setBounds(new Rectangle(280, 205, 50, 40));
        jButton14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton14_actionPerformed(e);
                }
            });
        jButton15.setText("/");
        jButton15.setBounds(new Rectangle(235, 255, 80, 40));
        jButton15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton15_actionPerformed(e);
                }
            });
        this.getContentPane().add(jButton15, null);
        this.getContentPane().add(jButton14, null);
        this.getContentPane().add(jButton13, null);
        this.getContentPane().add(jButton12, null);
        this.getContentPane().add(jButton11, null);
        this.getContentPane().add(jButton10, null);
        this.getContentPane().add(jButton9, null);
        this.getContentPane().add(jButton8, null);
        this.getContentPane().add(jButton7, null);
        this.getContentPane().add(jButton6, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jFormattedTextField1, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(Onea, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"1");
    }

    private void jButton10_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText("");
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"2");
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"3");
    }

    private void jButton4_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"4");
    }

    private void jButton5_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"5");
    }

    private void jButton6_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"6");
    }

    private void jButton7_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"7");
    }

    private void jButton8_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"8");
    }

    private void jButton9_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"9");
    }

    private void jButton0_actionPerformed(ActionEvent e) {
        jFormattedTextField1.setText(jFormattedTextField1.getText() +"0");
    }

    private void jButton12_actionPerformed(ActionEvent e) {
        num = Double.parseDouble(jFormattedTextField1.getText());
        calculation = 1;
        jFormattedTextField1.setText("");
       //jFormattedTextField1.setText(jFormattedTextField1.getText() +"+");
    }

    private void jButton13_actionPerformed(ActionEvent e) {
        num = Double.parseDouble(jFormattedTextField1.getText());
        calculation = 2;
        jFormattedTextField1.setText("");
       // jFormattedTextField1.setText(jFormattedTextField1.getText() +"-");
    }

    private void jButton14_actionPerformed(ActionEvent e) {
        num = Double.parseDouble(jFormattedTextField1.getText());
        calculation = 3;
        jFormattedTextField1.setText("");
       //jFormattedTextField1.setText(jFormattedTextField1.getText() +"*");
    }

    private void jButton15_actionPerformed(ActionEvent e) {
       
        num = Double.parseDouble(jFormattedTextField1.getText());
        calculation = 4;
        jFormattedTextField1.setText("");
        //jFormattedTextField1.setText(jFormattedTextField1.getText() +"/");
    }
    
    double ans, num;
    int calculation;
   public void arithematic_Operation() {
       switch(calculation) {
       case 1: // Addition
           ans = num + Double.parseDouble(jFormattedTextField1.getText());
           jFormattedTextField1.setText(Double.toString(ans));
           break;
       
           case 2: //Subtraction
               ans = num - Double.parseDouble(jFormattedTextField1.getText());
               jFormattedTextField1.setText(Double.toString(ans));
               break;
       
       
           case 3: // Multiplication
               ans = num * Double.parseDouble(jFormattedTextField1.getText());
               jFormattedTextField1.setText(Double.toString(ans));
               break;
       
       
           case 4:
               ans = num / Double.parseDouble(jFormattedTextField1.getText());
               jFormattedTextField1.setText(Double.toString(ans));
               break;
       }
   }

    private void jButton11_actionPerformed(ActionEvent e) {
        arithematic_Operation();
    }
}
