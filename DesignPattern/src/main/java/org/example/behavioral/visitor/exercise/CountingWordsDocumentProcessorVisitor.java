package org.example.behavioral.visitor.exercise;

public class CountingWordsDocumentProcessorVisitor implements DocumentProcessorVisitor{
    @Override
    public void visit(SpreedSheetDocumentProcessor spreedSheetDocumentProcessor) {
        System.out.println("counting the words in the spreed sheet file...");
    }

    @Override
    public void visit(WordDocumentProcessor wordDocumentProcessor) {
        System.out.println("counting the words in the word file...");
    }
}
