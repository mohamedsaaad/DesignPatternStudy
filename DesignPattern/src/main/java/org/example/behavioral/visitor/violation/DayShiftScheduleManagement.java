package org.example.behavioral.visitor.violation;

public class DayShiftScheduleManagement implements ScheduleManagement{
    @Override
    public void generateReport() {
        System.out.println("generating report for day shift...");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("calculating the overtime for day shift...");
    }

    @Override
    public void manageLeaveRequest() {
        System.out.println("managing the leave request for day shift...");
    }
}
