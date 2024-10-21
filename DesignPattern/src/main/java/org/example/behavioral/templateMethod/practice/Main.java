package org.example.behavioral.templateMethod.practice;

public class Main {
    public static void main(String[] args) {
        CVReportGeneration pdfCVReportGeneration= new PdfCVReportGeneration();
        GeneratedData pdfCVGeneratedData= pdfCVReportGeneration.generateCVReport("D://file/PDF");
        System.out.println(pdfCVGeneratedData.isPassed());

        CVReportGeneration wordCVReportGeneration= new WordCVReportGeneration();
        GeneratedData wordCVGeneratedData= wordCVReportGeneration.generateCVReport("D://file/WORD");
        System.out.println(wordCVGeneratedData.isPassed());
    }
}
