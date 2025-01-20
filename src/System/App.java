package System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class App extends JFrame implements ActionListener{

    App() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Heading 
        JLabel heading = new JLabel("Employee Management System");
        
        heading.setBounds(400, 50, 1200, 60);


        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);

        JButton clickhere = new JButton("Click Here to continue");
        clickhere.setBounds(400, 500, 300, 70);
        clickhere.setBackground(Color.RED);
        clickhere.setForeground(Color.WHITE);
        //next line to remove the border suurounding the text in the button
        clickhere.setBorder(BorderFactory.createEmptyBorder());
        clickhere.addActionListener(this);
        image.add(clickhere);

    
        setSize(1170,650);
        setLocation(200,100);
        setVisible(true);
        while(true){
            heading.setVisible(false);

            try{
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

            heading.setVisible(true);

            try{
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new App();
    }
}
