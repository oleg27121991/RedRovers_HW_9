package by.veremei.manager;

import by.veremei.employee.Employee;
import by.veremei.month.Month;

public class Manager extends Employee {
    private final int countStuff;
    public Manager(String name, int age, String sex, double salaryInDay, int countStuff) {
        super(name, age, sex, salaryInDay);
        this.countStuff = countStuff;
    }

    public int getCountStuff() {
        return countStuff;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkingDay() * getSalaryInDay();
        }
        totalSalary += totalSalary * 0.01 * countStuff;
        return totalSalary;
    }
}
