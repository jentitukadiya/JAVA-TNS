package student;

public class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        Student s1 = new Student("James");
        System.out.println(s1.name);
    }
}
