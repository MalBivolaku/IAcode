package com.company;

public class SeatingPlan {
    private TeachingClass students;
    private DeskLayout desks;

    public SeatingPlan(TeachingClass students , int boundary){
        students.setGradeBoundary(boundary);
        this.students = students.filterByGrade();
        this.desks = new DeskLayout();
        //assign students desks
        //TODO Option to assign by alphabetically or by grade

        for (int i = 0; i< this.students.size(); i++){
            desks.setDeskName(this.students.getStudent(i).name , i);
        }
    }
}
