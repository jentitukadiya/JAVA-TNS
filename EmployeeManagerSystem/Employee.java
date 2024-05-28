package EmployeeManagerSystem;

public class Employee extends Member{
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        super(name, age, phoneNumber, address, salary);
    }

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", salary=" + this.getSalary() + '\'' +
                ", specialization=" + this.getSpecialization() +
                '}';
    }
}
