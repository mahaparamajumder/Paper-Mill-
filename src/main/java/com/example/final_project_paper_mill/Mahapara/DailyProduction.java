package com.example.final_project_paper_mill.Mahapara;

import java.time.LocalDate;

public class DailyProduction {

    private LocalDate date;
    private String line;
    private int outputQuantity;
    private int target;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(int outputQuantity) {
        this.outputQuantity = outputQuantity;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "DailyProduction{" +
                "date=" + date +
                ", line='" + line + '\'' +
                ", outputQuantity=" + outputQuantity +
                ", target=" + target +
                '}';
    }
}
