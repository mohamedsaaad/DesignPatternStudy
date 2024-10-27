package org.example.behavioral.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentProcessor> documentProcessors=new ArrayList<>();
        documentProcessors.add(new WordDocumentProcessor());
        documentProcessors.add(new SpreedSheetDocumentProcessor());

        documentProcessors.forEach(documentProcessor -> {
            //the old features
            documentProcessor.extractText();
            documentProcessor.analyzeText();
            System.out.println();
            // adding new features counting words & Formatting files without touching the legacy base
            documentProcessor.accept(new CountingWordsDocumentProcessorVisitor());
            documentProcessor.accept(new FormattingDocumentProcessorVisitor());
            System.out.println();
        });
    }
}
