package org.example.behavioral.visitor.practice;

public class RemoteWorkScheduleManagement implements ScheduleManagement {

    @Override
    public void generateReport() {
        System.out.println("generating report for remote work...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculating the overtime for remote work...");
    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
