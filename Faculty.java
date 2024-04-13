public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: \nName = " + getName() +
                "\nAddress = " + getAddress() +
                "\nPhone Number = " + getPhoneNumber() +
                "\nEmail Address = " + getEmailAddress() +
                "\nDepartment = " + getDepartment() +
                "\nMonthly Salary = " + getMonthlySalary() +
                "\nDate Hired = " + getDateHired() +
                "\nOffice Hours = " + getOfficeHours() +
                "\nRank = " + getRank();
    }
}
