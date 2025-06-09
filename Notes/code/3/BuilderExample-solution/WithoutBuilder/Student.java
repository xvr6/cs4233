package WithoutBuilder;

import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<String> majors;
    private String address;
    private String email;
    private Double gpa;

    // Constructor with all fields (Even if some are optional)
    public Student(String name, int studentId, List<String> majors, String address, String email, Double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.majors = majors;
        this.address = address;
        this.gpa = gpa;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Student ID=" + studentId + ", Address=" + address +
                ", Majors:"+ majors.stream().reduce(" ", (a, b) -> a + " " + b) +
                ", Address=" + address + ", Email=" + email + "]";
    }
}