package employee;

public class CalculateEmpTax {
    public static double calculateTax(Employee emp){
        if(emp.getSalary()<5000){
            return 0;
        } else if (emp.getSalary() > 5000 && emp.getSalary() < 10000) {
            return emp.getSalary() * 0.05;
        } else if (emp.getSalary() > 10001 && emp.getSalary() < 25000) {
            return emp.getSalary() * 0.08;
        } else if (emp.getSalary() > 25001 && emp.getSalary() < 50000) {
            return emp.getSalary() * 0.1;
        } else if (emp.getSalary() > 50001 && emp.getSalary() < 100000) {
            return emp.getSalary() * 0.15;
        } else {
            return emp.getSalary() * 0.2;
        }
    }
}
