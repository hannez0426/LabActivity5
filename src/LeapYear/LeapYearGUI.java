package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;
import java.lang.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckerYear;

    public LeapYearGUI(){
        
        btnCheckerYear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    double year = Double.parseDouble(tfYear.getText());
                    boolean isleap = false;
                        if (year % 4 == 0) {
                            if (year % 100 == 0) {
                                if (year % 400 == 0) {
                                    isleap = true;
                                }
                            }
                            isleap = true;
                        }

                        if (isleap == true) {
                            JOptionPane.showMessageDialog(panel1, "Leap Year");
                        } else {
                            JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
                        }
            }
        });
    }

    public static void main(String[] args){
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.panel1);
        leap.setSize(500, 500);
        leap.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton another = new JButton("Another");
        leap.setVisible(true);
        leap.setTitle("Leap Year Checker");

    }
}


