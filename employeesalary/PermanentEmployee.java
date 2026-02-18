package employeesalary;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Permanent Employee Salary Calculated");
    }
}
    

