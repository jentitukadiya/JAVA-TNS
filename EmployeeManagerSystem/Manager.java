package EmployeeManagerSystem;

public class Manager extends Member{
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
            return "Manager{" +
                    "name='" + this.getName() + '\'' +
                    ", age=" + this.getAge() +
                    ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                    ", address='" + this.getAddress() + '\'' +
                    ", salary=" + this.getSalary() + '\'' +
                    ", department=" + this.getDepartment() +
                    '}';
    }
}
