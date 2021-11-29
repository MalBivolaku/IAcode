package com.company;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
public class Student {
//TODO Make these private and use getters
    public int grade;
    public String name;

    public Student() {

    }
    public Student(String data){
        String[] fields = data.split(",");
        name = fields[0];
        //System.out.println(fields[1]);
        grade = Integer.parseInt(fields[1]);
    }
    public void display(){
        System.out.println(name+ " " + grade);
    }
}
