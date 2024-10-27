package org.example.behavioral.visitor.exercise;

import sun.reflect.generics.visitor.Visitor;

public interface DocumentProcessorVisitor {
    void visit(SpreedSheetDocumentProcessor spreedSheetDocumentProcessor);
    void visit(WordDocumentProcessor wordDocumentProcessor);
}
