package com.company;

import java.util.ArrayList;

public class SeatingPlan {
    private TeachingClass students;
    private DeskLayout desks;
    private int id;

    public SeatingPlan(TeachingClass students , int boundary , int id){
        students.setGradeBoundary(boundary);
        this.students = students.filterByGrade();
        this.desks = new DeskLayout();
        this.id = id;
        //assign students desks
        //TODO Option to assign by alphabetically or by grade
      int temp;
      boolean sorted = false;


        for (int i = 0; i< this.students.size(); i++){
            desks.setDeskName(this.students.getStudent(i).name , i);
        }
    }
    public TeachingClass getStudents(){
        return students;
    }

    public int getId(){
        return id;
    }
    public int compareTo(SeatingPlan seatingPlan){
        int res = 0;
        if (this.id < seatingPlan.getId()){
            res = -1;
        }
        if (this.id > seatingPlan.getId()){
            return res = 1;
        }
        return res;
    }
    public void bubbleSortStudents(){
        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < students.size(); i++){
                if (students.get)
            }
        }
    }
}
//https://stackabuse.com/bubble-sort-in-java/