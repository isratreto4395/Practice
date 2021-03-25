package Midtermquestions;

public class CalculateEmployeeBonus {
    public static void main(String[] args) {
        calculateEmployeeBonus(7,4,55000);
        System.out.println(calculateEmployeeBonus1(55000,4));
    }
    public static double calculateEmployeeBonus(int employeePerformance, int numberOfYearsWithCompany, int employeeSalary) {
        double total = 0;
        if (numberOfYearsWithCompany >= 5 && employeePerformance >= 10) {
            total = employeeSalary * .1 * 12;
        } else if (numberOfYearsWithCompany >= 4 && employeePerformance >= 8) {
            total = employeeSalary * .08 * 12;
        } else if (numberOfYearsWithCompany >= 3 && employeePerformance >= 6) {
            total = employeeSalary * .06 * 12;
        } else if (numberOfYearsWithCompany < 2 && employeePerformance >= 5) {
            total = employeeSalary * .04 * 12;
        } else if (numberOfYearsWithCompany == 2 && employeePerformance >= 4) {
            total = employeeSalary * .02 * 12;
        } else {
            total = 0;
            System.out.println("Increase performance or you will be fired!");
        }
        System.out.println("Employee Bonus: "+total);
        return total;
    }

    public static double calculateEmployeeBonus1(int salary, int performance) {

        double yearlyBonus = 0;
        if (performance == 5) {
            yearlyBonus = salary * 0.1 * 12;
        } else if (performance == 4) {
            yearlyBonus = salary * 0.08 * 12;
        } else if (performance == 3) {
            yearlyBonus = salary * 0.06 * 12;
        } else if (performance == 2) {
            yearlyBonus = 0;
            System.out.println("performance is not upto the mark.");
        } else {
            yearlyBonus = 0;
            System.out.println("You are fired.");
        }
        return yearlyBonus;
    }
}
