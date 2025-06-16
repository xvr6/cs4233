package WithBuilder;
import java.util.List;
import WithBuilder.Student;

// Step 3: Use the Builder Pattern in Main Method
public class StudentwithBuilder  {
    public static void main(String[] args) {
        // Creating a student with full details
        Student student1 = new StudentBuilder("Snow", 251)
                .setMajors(List.of("CS","RBE","DS"))
                .setAddress("WPI")
                .setEmail("snow@wpi.edu")
                .setGPA(4.0)
                .build();

        // Creating a student with only required details
        Student student2 = new StudentBuilder("Cookie", 451).build();

        // Creating a student with gpa and email  only
        Student student3 = new StudentBuilder("Cat", 122)
                .setGPA(3.5)
                .setEmail("cat@wpi.edu")
                .build();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
