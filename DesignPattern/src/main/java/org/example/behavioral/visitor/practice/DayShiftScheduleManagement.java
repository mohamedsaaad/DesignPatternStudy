package org.example.behavioral.visitor.practice;

public class DayShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("generating report for day shift...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculating the overtime for day shift...");
    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
