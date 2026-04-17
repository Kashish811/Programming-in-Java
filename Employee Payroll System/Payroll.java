import java.util.ArrayList;
import java.util.List;

class Payroll {
    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void generatePayroll() {
        for (Employee emp : employees) {
            System.out.println("Emp ID: " + emp.empId +
                    ", Name: " + emp.name +
                    ", CTC: " + emp.calcCTC());
        }
    }
}