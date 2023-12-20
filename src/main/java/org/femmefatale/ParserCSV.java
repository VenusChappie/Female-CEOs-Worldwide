package org.femmefatale;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ParserCSV {

    public static ArrayList<String> validData(File csvFile) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line = "";
        String[] tempArr;
        ArrayList<String> mainArr = new ArrayList<>();

        while ((line = br.readLine()) != null) {

            tempArr = line.split(",");

            for (String item : tempArr)  {
                mainArr.add(item);
            }
            mainArr.add("\n");
        }
        System.out.println(mainArr);
        return mainArr;
    }

    public static void main(String[] args) throws IOException {

        String path ="/Users/venuschappie/Desktop/student_work/Female-CEOs-Worldwide/Female-CEOs/TestData - Sheet1.csv";
        System.out.println(validData(new File(path)));
    }


}
