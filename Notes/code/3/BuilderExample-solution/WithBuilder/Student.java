package WithBuilder;
import java.util.List;

// Step 1: Define the Student Class
public class Student {
    private String name;
    private int studentId;
    private List<String> majors;
    private String address;
    private String email;
    private Double gpa;

    // Private constructor to enforce object creation via Builder
    public Student(StudentBuilder builder) {
        this.name = builder.getName();
        this.studentId = builder.getStudentId();
        this.majors = builder.getMajors();
        this.address = builder.getAddress();
        this.email = builder.getEmail();
        this.gpa = builder.getGPA();
    }

    public String toString() {
        return "WithoutBuilder.Student [Name=" + name + ", Student ID=" + studentId + ", Address=" + address +
                ", Majors:" + majors.stream().reduce(" ", (a, b) -> a + " " + b) +
                ", Address=" + address + ", Email=" + email + "]";
    }
}