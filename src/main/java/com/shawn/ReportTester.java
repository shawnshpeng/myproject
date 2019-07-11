package com.shawn;

import java.util.ArrayList;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinanceReport();
        HealthReport health = new HealthReport();
        ArrayList<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
