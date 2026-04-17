public class Main {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        FullTimeEmployee emp1 = new FullTimeEmployee(
                "Alice", "ABCDE1234F", new java.util.Date(),
                "Engineer", 101, 50000, 10000, "SWE");

        ContractEmployee emp2 = new ContractEmployee(
                "Bob", "XYZAB1234K", new java.util.Date(),
                "Consultant", 102, 120, 500);

        Manager mgr = new Manager(
                "Charlie", "LMNOP5678Q", new java.util.Date(),
                "Manager", 103, 80000, 20000, "Manager",
                10000, 15000);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(mgr);

        payroll.generatePayroll();
    }
}