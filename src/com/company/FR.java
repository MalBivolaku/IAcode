package com.company;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FR {
    public static ArrayList<String> read() {
        ArrayList<String>fileText = new ArrayList<String>();
        try {


            FileReader fr = new FileReader("IA File - Sheet 1.csv");
            BufferedReader br = new BufferedReader(fr);


            int i = 0;
            String line = br.readLine();


            while (line != null) {
                fileText.add(line);
                line = br.readLine();



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileText;
    }

}

