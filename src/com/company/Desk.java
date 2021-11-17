package com.company;

import javax.swing.*;
import java.awt.*;

public class Desk {
    JFrame f;
    JButton[] b;
    private int buttonWidth;
    private int buttonHeight;


    public Desk(){
        buttonWidth = 50;
        buttonHeight = 30;





        f = new JFrame("Class Layout");
        //create instance of JButton
        b = new JButton[30]; //instantiate array
        for (int i = 0; i<30; i++){
            //x position and y position
            int xPos = (i*buttonWidth) + 20;
            int yPos = 20;
            if (i>5  ) {
                xPos = buttonHeight * (i - 3) + 20;
                yPos = buttonHeight + 20;
            }
            if (i>10){
                yPos = (buttonHeight * 2 ) + 20;
                xPos = (buttonWidth * (i-6)) + 20;
            }
            b[i] = new JButton(String.valueOf(i+1));
            b[i].setBounds(xPos , yPos , 150 , 150);

        }
        //add buttons to JFrame
        for (int i = 0; i<30; i++){
            f.add(b[i]);
            f.setBackground(Color.blue);



        }


        f.setSize(400, 400);
        f.setLayout(new GridLayout(6 , 5 , 20 , 20));

        f.setVisible(true);
    }

}
