package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });
    }

    public void order(){
        try{
            boolean food = false;
            boolean discount = false;
            double sum = 0;
            double total = 0;

            if(cPizza.isSelected()){
                sum+=100;
                food = true;
            }
            if(cBurger.isSelected()){
                sum+=80;
                food = true;
            }
            if(cFries.isSelected()){
                sum+=65;
                food = true;
            }
            if(cSoftDrinks.isSelected()){
                sum+=55;
                food = true;
            }
            if(cSoftDrinks.isSelected()){
                sum+=50;
                food = true;
            }
            if(cSundae.isSelected()){
                sum+=40;
                food = true;
            }
            
            
            
            if(rb5.isSelected()){
                total = sum * .5;
                sum = sum - total;
                discount =true;
            }else if(rb10.isSelected()){
                total = sum * .10;
                sum = sum - total;
                discount =true;
            }else if(rb15.isSelected()){
                total = sum * .15;
                sum = sum - total;
                discount =true;
            }else if(rbNone.isSelected()){
                total = total;
                discount = true;
            }
            
            if(food == false || discount == false){
                    throw new IllegalArgumentException("Hi! No food or discount chosen or I am mistaken?");
                }
            }
            JOptionPane.showMessageDialog(panel1, "The total is Php" + String.format("%.2f", sum));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void main(String[] args){
        FoodOrderGUI yum = new FoodOrderGUI();
        yum.setContentPane(yum.panel1);
        yum.setSize(500, 500);
        yum.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton another = new JButton("Another");
        yum.setVisible(true);
        yum.setTitle("Food Ordering System");
    }
}
