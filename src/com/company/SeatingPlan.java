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
        for (int i = 0; i < students.size(); i++){
            for (int j = 0; j < students.size(); j++) {
                if(students[i] > students[j + 1]){
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }


        for (int i = 0; i< this.students.size(); i++){
            desks.setDeskName(this.students.getStudent(i).name , i);
        }
    }
}
