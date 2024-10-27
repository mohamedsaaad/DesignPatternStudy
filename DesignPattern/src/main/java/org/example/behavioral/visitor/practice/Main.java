package org.example.behavioral.visitor.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ScheduleManagement>scheduleManagements= new ArrayList<>();
        scheduleManagements.add(new DayShiftScheduleManagement());
        scheduleManagements.add(new NightShiftScheduleManagement());
        scheduleManagements.add(new RemoteWorkScheduleManagement());

        scheduleManagements.forEach((scheduleManagement -> {
            scheduleManagement.accept(new ManageLeaveRequestVisitor());
            scheduleManagement.accept(new CalculateKPIsVisitor());
            System.out.println();
        }));
    }
}
