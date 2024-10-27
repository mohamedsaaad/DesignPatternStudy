package org.example.behavioral.visitor.exercise;

public class FormattingDocumentProcessorVisitor implements DocumentProcessorVisitor{
    @Override
    public void visit(SpreedSheetDocumentProcessor spreedSheetDocumentProcessor) {
        System.out.println("Formatting the spreed sheet file...");
    }

    @Override
    public void visit(WordDocumentProcessor wordDocumentProcessor) {
        System.out.println("Formatting the word file...");
    }
}
