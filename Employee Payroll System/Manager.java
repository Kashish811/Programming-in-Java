import java.util.Date;

class Manager extends FullTimeEmployee {
    private double travelAllowance;
    private double eduAllowance;

    public Manager(String name, String panNo, Date joiningDate, String designation,
                   int empId, double baseSalary, double perfBonus, String role,
                   double travelAllowance, double eduAllowance) {
        super(name, panNo, joiningDate, designation, empId, baseSalary, perfBonus, role);
        this.travelAllowance = travelAllowance;
        this.eduAllowance = eduAllowance;
    }

    @Override
    public double calcCTC() {
        return baseSalary + perfBonus + travelAllowance + eduAllowance;
    }
}