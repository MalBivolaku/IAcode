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
        //sort by grade
        boolean sorted = false;
        int j = 0;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < students.size() - 1 - j; i++){
                if (students.getStudent(i).grade > students.getStudent(i + 1).grade){
                    //TODO Swap student i with student i + 1
                    Student temp;
                    temp = students.getStudent(i+1);
                    students.getStudent(i);
                    sorted = false;
                }
            }
            j++;
        }
    }
}
//https://stackabuse.com/bubble-sort-in-java/