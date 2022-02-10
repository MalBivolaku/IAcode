package com.company;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeskLayout implements ActionListener , DocumentListener {
    private JFrame frame1;
    private JFrame frame2;
    JButton[] b;
    private int buttonWidth;
    private int buttonHeight;
    private JTextField gradeInput;
    private JButton enter;
    private SeatingPlan plan;


    public DeskLayout(SeatingPlan s) {
        plan = s;
        frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Enter Grade");


        buttonWidth = 50;
        buttonHeight = 30;
        title.setBounds(110, 30, 220, 40);
        frame2.add(title);
        gradeInput = new JTextField();
        gradeInput.setBounds(110, 70, 220, 40);
        gradeInput.getDocument().addDocumentListener((DocumentListener) this);
        frame2.add(gradeInput);
        enter = new JButton("Enter");
        enter.setBounds(110, 150, 110, 40);
        enter.addActionListener((ActionListener) this);
        frame2.add(enter);
        frame2.setSize(500, 400);
        frame2.setLayout(null);
        frame2.setVisible(true);

        frame1 = new JFrame("Class Layout");
        frame1.setSize(400,400);
        frame1.setLayout(new GridLayout(6,5,20,20));
        //frame1.setVisible(true);

        //create instance of JButton
        b = new JButton[30]; //instantiate array
        for (int i = 0; i < 30; i++) {
            //x position and y position
            int xPos = (i * buttonWidth) + 20;
            int yPos = 20;
            if (i > 5) {
                xPos = buttonHeight * (i - 3) + 20;
                yPos = buttonHeight + 20;
            }
            if (i > 10) {
                yPos = (buttonHeight * 2) + 20;
                xPos = (buttonWidth * (i - 6)) + 20;
            }
            b[i] = new JButton(String.valueOf(i + 1));
            b[i].setBounds(xPos, yPos, 150, 150);
        }
        //add buttons to JFrame
        for (int i = 0; i < 30; i++) {
            frame1.add(b[i]);
            frame1.setBackground(Color.blue);


        }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Enter")) {
            frame1.setVisible(true);

             TeachingClass room = new TeachingClass(true, 5);
             int boundary =Integer.parseInt(gradeInput.getText()) ;
             room.setGradeBoundary(boundary);
             TeachingClass filterSession = room.filterByGrade();
             room.display();

            filterSession.display();

            //new SeatingPlan(room, boundary , 0);
            plan.assignPlan();
        }
    }
    public void setDeskName(String name , int deskNumber){
        //set a student name at a given desk
        b[deskNumber].setText(name);

        String grade = gradeInput.getText();

    }


    @Override
    public void insertUpdate(DocumentEvent e) {
        System.out.println("input");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("remove");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("change");
    }
}

