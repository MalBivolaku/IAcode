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
        int temp;
        if (students.size() > 1) {//check if the number of orders is larger than 1
            for (int x=0; x < students.size(); x++){
                for (int i=0; i < students.size()-x-1; i++){
                    if (students.)
                }
            }

        }

        for (int i = 0; i< this.students.size(); i++){
            desks.setDeskName(this.students.getStudent(i).name , i);
        }
    }
}
