package org.femmefatale;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserCSV {

    public static List<List> validData(File csvFile) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line = "";
//        List<String> tempArr;
        List<List> mainArr = new ArrayList<>();

        while ((line = br.readLine()) != null) {

            List<String> convertedArrayPlease = Arrays.asList(line.split(",", -1));
            mainArr.add(convertedArrayPlease);
        }

        for(List<String> item : mainArr)    {
//            System.out.println(item);
        }

        return mainArr;
    }

    public static void main(String[] args) throws IOException {

        String path ="/Users/venuschappie/Desktop/student_work/Female-CEOs-Worldwide/Female-CEOs/TestData - Sheet1.csv";
        System.out.println(validData(new File(path)));
    }


}
