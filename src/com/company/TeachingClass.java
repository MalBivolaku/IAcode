package com.company;
import java.util.ArrayList;

public class TeachingClass {
    ArrayList<Student>studentList;
    public int gradeBoundary; //If the grades of the students below this grade boundary then they will be separated into the new help session
    public boolean needHelp; //This will be assigned to the students that need help to allow the program to clearly separate the students
    public ArrayList<Student>helpSession; //This will be the ArrayList that all the students who need help will go into

    public TeachingClass(boolean needHelp , int gradeBoundary){

        this.gradeBoundary = gradeBoundary;
        this.needHelp = needHelp;




        studentList = new ArrayList<Student>();
        helpSession = new ArrayList<Student>();

        ArrayList<String> studentData = FR.read();
        for (int i = 0; i < studentData.size(); i++){
            Student student = new Student(studentData.get(i));
            studentList.add(student);
            //  System.out.println(studentList.get(i).name);
        }
    }
    public TeachingClass(ArrayList<Student> session , boolean needHelp , int gradeBoundary){
        studentList = session;
        this.needHelp = needHelp;
        this.gradeBoundary = gradeBoundary;
    }
    public void display(){
        for (Student s : studentList) {
            s.display();
        }
    }
    public TeachingClass filterByGrade(){

        ArrayList<Student>matching = new ArrayList<Student>();

        for (int i = 0; i < studentList.size(); i++){
            if ((studentList.get(i).grade < gradeBoundary && needHelp) || (studentList.get(i).grade > gradeBoundary && ! needHelp)){
                matching.add(studentList.get(i));
            }
        }
        return new TeachingClass(matching , needHelp , gradeBoundary);

    }
    public void setGradeBoundary(int boundary){

        gradeBoundary = boundary;

    }
    public Student getStudent(int pos){
        return studentList.get(pos);
        //TODO Validate pos is in range
    }
    public int size(){
        return studentList.size();
    }
    public void setStudent(int pos , Student studentNewPos){
        studentList.add(pos , studentNewPos);
    }
}
