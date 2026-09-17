public class Employee {

    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    public Employee(String employeeName, double basicSalary, int performanceRating) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;

        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            this.performanceRating = 1;
        }
    }

    public double calculateBonus() {

        double bonus = 0;

        if (performanceRating == 5) {
            bonus = basicSalary * 20 / 100;
        } else if (performanceRating == 4) {
            bonus = basicSalary * 15 / 100;
        } else if (performanceRating == 3) {
            bonus = basicSalary * 10 / 100;
        } else if (performanceRating == 2) {
            bonus = basicSalary * 5 / 100;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
