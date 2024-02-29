package by.veremei.month;

public final class Month {
    private final String name;
    private final int day;
    private final int workingDay;

    public Month(String name, int day, int workingDay) {
        this.name = name;
        this.day = day;
        this.workingDay = workingDay;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getWorkingDay() {
        return workingDay;
    }
}
