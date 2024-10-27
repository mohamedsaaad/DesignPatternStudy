package org.example.behavioral.visitor.practice;

public class NightShiftScheduleManagement implements ScheduleManagement {

    @Override
    public void generateReport() {
        System.out.println("generating report for night shift...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculating the overtime for night shift...");
    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
