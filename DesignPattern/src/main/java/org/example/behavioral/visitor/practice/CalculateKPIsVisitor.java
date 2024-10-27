package org.example.behavioral.visitor.practice;

public class CalculateKPIsVisitor implements ScheduleManagementVisitor{
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Calculating the KPIs for day shift employee");
    }

    @Override
    public void visit(NightShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Calculating the KPIs for night shift employee");
    }

    @Override
    public void visit(RemoteWorkScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Calculating the KPIs for remote work employee");
    }
}
