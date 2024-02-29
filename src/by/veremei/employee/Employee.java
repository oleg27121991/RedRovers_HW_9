package by.veremei.employee;

import by.veremei.month.Month;

public final class Employee extends BaseEmployee {

    public Employee(String name, int age, String sex, double salaryInDay) {
        super(name, age, sex, salaryInDay);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkingDay() * getSalaryInDay();
        }
        return totalSalary;
    }
}
