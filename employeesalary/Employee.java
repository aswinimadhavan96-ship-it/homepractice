package employeesalary;

public class Employee implements Runnable {

    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        // Method to be overridden
    }

    @Override
    public void run() {
        calculateSalary();
    }
}
