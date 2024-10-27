package org.example.behavioral.visitor.exercise;

public class WordDocumentProcessor implements DocumentProcessor{
    @Override
    public void extractText() {
        System.out.println("Extracting the text from word file...");
    }

    @Override
    public void analyzeText() {
        System.out.println("analyzing the word text file...");
    }

    @Override
    public void accept(DocumentProcessorVisitor documentProcessorVisitor) {
        documentProcessorVisitor.visit(this);
    }
}
