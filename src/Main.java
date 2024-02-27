import by.veremei.employee.Employee;
import by.veremei.manager.Manager;
import by.veremei.month.utils.MonthUtils;

public class Main {
    public static void main(String[] args) {
        Employee chef = new Employee("Petr", 54, "Men", 2500.2);
        Employee chefWife = new Employee("Zhana", 22, "Women", 1300);

        System.out.println("Chef salary for 2 month: " + chef.getSalary(MonthUtils.SUMMER) + "$");
        System.out.println("Chef wife salary for 2 month: " + chefWife.getSalary(MonthUtils.SUMMER) + "$");

        Manager managerOleg = new Manager("Oleg", 32, "Men", 120, 2);
        System.out.println("Manager Oleg salary for 2 month: " + managerOleg.getSalary(MonthUtils.ALL_MONTH) + "$");
    }
}