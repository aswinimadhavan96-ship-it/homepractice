package employeesalary;

public class ContractEmployee extends Employee {
    

   public ContractEmployee(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Contract Employee Salary Calculated");
    }
}
