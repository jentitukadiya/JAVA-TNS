package usingStatic;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 21);
        Student s2 = new Student("EFG", 24);
        Student s3 = new Student("PQR", 23);
        Student s4 = new Student("XYZ", 19);

        System.out.println(Student.getTotalStudent());
    }
}
