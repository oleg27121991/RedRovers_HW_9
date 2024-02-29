package by.veremei.employee;

import by.veremei.month.Month;

public abstract class BaseEmployee {
    private final String name;
    private final int age;
    private final String sex;
    private final double salaryInDay;

    public BaseEmployee(String name, int age, String sex, double salaryInDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryInDay = salaryInDay;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    protected abstract double getSalary(Month[] monthArray);

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
