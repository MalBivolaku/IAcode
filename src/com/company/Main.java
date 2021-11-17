package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Classroom room = new Classroom(true, 5);
        int boundary = askForBoundary();
        room.setGradeBoundary(boundary);
        Classroom filterSession = room.filterByGrade();
        room.display();
        System.out.println("------------");
        System.out.println("PEOPLE WHO HAVE FAILED THE TEST AND REQUIRE FURTHER HELP SESSIONS");
        filterSession.display();

        new Desk();


    }

    public static int askForBoundary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Grade Boundary: ");
//dik
        int boundary = Integer.parseInt(input.nextLine());
        return boundary;



    }
}
