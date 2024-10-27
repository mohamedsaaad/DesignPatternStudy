package org.example.behavioral.visitor.violation;

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
    public void manageLeaveRequest() {
        System.out.println("managing the leave request for night shift...");
    }
}
