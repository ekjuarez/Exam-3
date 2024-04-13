public class Student extends Person {
    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: \nName = " + getName() +
                "\nAddress = " + getAddress() +
                "\nPhone Number = " + getPhoneNumber() +
                "\nEmail Address = " + getEmailAddress() +
                "\nStatus = " + getStatus();
    }
}
