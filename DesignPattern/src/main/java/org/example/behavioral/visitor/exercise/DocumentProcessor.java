package org.example.behavioral.visitor.exercise;

public interface DocumentProcessor {
    //old feature
    void extractText();

    //old feature
    void analyzeText();

    void accept(DocumentProcessorVisitor documentProcessorVisitor);
}
