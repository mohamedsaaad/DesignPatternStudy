package org.example.behavioral.visitor.exercise;

public class SpreedSheetDocumentProcessor implements DocumentProcessor{
    @Override
    public void extractText() {
        System.out.println("Extracting the text from spreed sheet file...");
    }

    @Override
    public void analyzeText() {
        System.out.println("analyzing the spreed sheet file...");
    }

    @Override
    public void accept(DocumentProcessorVisitor documentProcessorVisitor) {
        documentProcessorVisitor.visit(this);
    }
}
