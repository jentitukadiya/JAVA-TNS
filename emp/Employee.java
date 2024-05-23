public class Employee {
    private String empId, email;

    public Employee(String empId, String email) {
        this.empId = empId;
        this.email = email;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
