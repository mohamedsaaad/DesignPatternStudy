package org.example.behavioral.templateMethod.violation;

import java.io.File;

public class WordCVReportGeneration implements CVReportGeneration{
    @Override
    public GeneratedData generateCVReport(String filePath) {
        Object file= readFile(filePath);
        Data extractedData=extractData((File) file);
        AnalyzedData analyzedData=analyzeData(extractedData);
        return generateReportOf(analyzedData);
    }

    private GeneratedData generateReportOf(AnalyzedData analyzedData) {
        System.out.println("generating Report...");
        return new GeneratedData(false);
    }

    @Override
    public File readFile(String path) {
        System.out.println("reading file.....");
        return null;
    }

    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data.....");
        return null;
    }

    @Override
    public AnalyzedData analyzeData(Data data) {
        System.out.println("Analyzing Data.....");
        return null;
    }
}
