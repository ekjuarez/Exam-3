public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: \nName = " + getName() +
                "\nAddress = " + getAddress() +
                "\nPhone Number = " + getPhoneNumber() +
                "\nEmail Address = " + getEmailAddress() +
                "\nDepartment = " + getDepartment() +
                "\nMonthly Salary = " + getMonthlySalary() +
                "\nDate Hired = " + getDateHired() +
                "\nTitle = " + getTitle();
    }
}
