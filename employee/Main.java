package employee;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "XYZ", 21, 35000);
        Employee emp2 = new Employee(102, "ABC", 22, 45000);
        Employee emp3 = new Employee(103, "PQR", 20, 19500);

        emp1.setTax(CalculateEmpTax.calculateTax(emp1));
        emp2.setTax(CalculateEmpTax.calculateTax(emp2));
        emp3.setTax(CalculateEmpTax.calculateTax(emp3));

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
