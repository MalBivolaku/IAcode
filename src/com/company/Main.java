package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TeachingClass room = new TeachingClass(true, 5);
        int boundary = askForBoundary();
        room.setGradeBoundary(boundary);
        TeachingClass filterSession = room.filterByGrade();
        room.display();
        System.out.println("------------");
        System.out.println("PEOPLE WHO HAVE FAILED THE TEST AND REQUIRE FURTHER HELP SESSIONS");
        filterSession.display();

        new SeatingPlan(room, boundary , 0);



    }

    public static int askForBoundary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Grade Boundary: ");

        int boundary = Integer.parseInt(input.nextLine());
        return boundary;



    }
}
