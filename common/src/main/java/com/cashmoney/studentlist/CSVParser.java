package com.cashmoney.studentlist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVParser {
    public ArrayList<Student> allStudents(){
        ArrayList<Student> arrayList = new ArrayList<Student>();

        String csvFile = "students.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] studentInfo = line.split(cvsSplitBy);
                arrayList.add(new Student(studentInfo[0] + " " + studentInfo[1], studentInfo[2]));


            }
            return arrayList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }
}
