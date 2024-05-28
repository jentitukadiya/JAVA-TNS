package EmployeeManagerSystem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Virat", 38, "9988006600", "21,xyz appartment, near this road, this city, 380001",120000);
        Manager member = new Manager("Rohit", 45, "1122334455", "10 abc house, near this station, that city, 382044", 500000, "Sales");

        System.out.println("Employee salary: "+employee.getSalary());
        System.out.println("Member salary: "+member.getSalary());

        System.out.println(employee);
        System.out.println(member);
    }

}
