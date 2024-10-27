package org.example.behavioral.visitor.practice;

import org.example.behavioral.visitor.practice.DayShiftScheduleManagement;
import org.example.behavioral.visitor.practice.NightShiftScheduleManagement;
import org.example.behavioral.visitor.practice.RemoteWorkScheduleManagement;

public interface ScheduleManagementVisitor {
    void visit(DayShiftScheduleManagement dayShiftScheduleManagement);
    void visit(NightShiftScheduleManagement dayShiftScheduleManagement);
    void visit(RemoteWorkScheduleManagement dayShiftScheduleManagement);

}
