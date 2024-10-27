package org.example.behavioral.visitor.violation;

public class RemoteWorkScheduleManagement implements ScheduleManagement{

    @Override
    public void generateReport() {
        System.out.println("generating report for remote work...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculating the overtime for remote work...");
    }

    @Override
    public void manageLeaveRequest() {
        System.out.println("managing the leave request for remote work...");
    }
}
