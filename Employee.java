public abstract class Employee extends Person {
    private String department;
    private double monthlySalary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getDateHired() {
        return dateHired;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: \nName = " + getName() +
                "\nAddress = " + getAddress() +
                "\nPhone Number = " + getPhoneNumber() +
                "\nEmail Address = " + getEmailAddress() +
                "\nDepartment = " + getDepartment() +
                "\nMonthly Salary = " + getMonthlySalary() +
                "\nDate Hired = " + getDateHired();
    }
}
