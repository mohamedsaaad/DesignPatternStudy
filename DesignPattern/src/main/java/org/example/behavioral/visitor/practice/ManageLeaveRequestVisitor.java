package org.example.behavioral.visitor.practice;

public class ManageLeaveRequestVisitor implements ScheduleManagementVisitor{
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("managing the leave request for day shift...");
    }

    @Override
    public void visit(NightShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("managing the leave request for night shift...");
    }

    @Override
    public void visit(RemoteWorkScheduleManagement dayShiftScheduleManagement) {
        System.out.println("managing the leave request for remote work...");
    }
}
