package org.example.behavioral.templateMethod.violation;

import java.io.File;

public interface CVReportGeneration {
    GeneratedData generateCVReport(String filePath);
    File readFile (String path);
    Data extractData(File file);
    AnalyzedData analyzeData(Data data);
}
