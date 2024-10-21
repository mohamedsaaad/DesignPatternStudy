package org.example.behavioral.templateMethod.practice;

import java.io.File;

public class WordCVReportGeneration extends CVReportGeneration {
    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data.....");
        return null;
    }
}
