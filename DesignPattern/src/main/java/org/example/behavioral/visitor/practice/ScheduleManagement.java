package org.example.behavioral.visitor.practice;

public interface ScheduleManagement {
    void generateReport();
    void calculateOverTime();
    void accept(ScheduleManagementVisitor scheduleManagementVisitor);
}
