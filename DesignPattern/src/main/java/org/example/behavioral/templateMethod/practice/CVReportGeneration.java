package org.example.behavioral.templateMethod.practice;

import java.io.File;

public abstract class CVReportGeneration {
    public GeneratedData generateCVReport(String filePath){
        Object file= readFile(filePath);
        Data extractedData=extractData((File) file);
        AnalyzedData analyzedData=analyzeData(extractedData);
        return generateReportOf(analyzedData);
    }
    private GeneratedData generateReportOf(AnalyzedData analyzedData) {
        System.out.println("generating Report...");
        return new GeneratedData(true);
    }
    private File readFile (String path){
        System.out.println("reading file.....");
        return null;
    }
    protected abstract Data extractData(File file);

    private AnalyzedData analyzeData(Data data){
        System.out.println("Analyzing Data.....");
        return null;
    }
}
