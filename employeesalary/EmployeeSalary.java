package employeesalary;

public class EmployeeSalary {

    public static void main(String[] args) {

        double permanentSalary = 30000;
        double contractSalary = 20000;

        Employee permanent = new PermanentEmployee(permanentSalary);
        Employee contract = new ContractEmployee(contractSalary);

        Thread t1 = new Thread(permanent);
        Thread t2 = new Thread(contract);

        t1.start();
        t2.start();
    }
}
