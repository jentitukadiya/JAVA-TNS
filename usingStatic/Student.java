package useStatic;

public class Student {
    private static int totalStudent;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudent += 1;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
