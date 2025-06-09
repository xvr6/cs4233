package WithBuilder;
import java.util.List;

// Step 2: Define the Builder Class
public class StudentBuilder {
    // Required fields
    private String name;
    private int studentId;

    // Optional fields with default values
    private List<String> majors = List.of();
    private String address = "Not Provided";
    private String email = "Not Provided";
    private Double gpa = 0.0;

    // Constructor with required fields
    public StudentBuilder(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Methods to get private attributes
    public int getStudentId() { return this.studentId; }
    public String getName() { return this.name; }
    public List<String> getMajors(){ return this.majors;}
    public String getAddress(){ return this.address;}
    public String getEmail(){ return this.email;}
    public Double getGPA(){ return this.gpa;}

    // Methods to set optional parameters
    public StudentBuilder setMajors(List<String> majors) {
        this.majors = majors;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setGPA(Double gpa) {
        this.gpa = gpa;
        return this;
    }

    // Build method to return the final Student object
    public Student build() {
        return new Student(this);
    }
}
