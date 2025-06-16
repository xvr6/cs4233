package WithoutBuilder;

import java.util.List;

public class StudentExample {
    public static void main(String[] args) {
        // Creating a student - Hard to read
        Student student = new Student("Alice", 101,
                List.of("CS", "RBE", "DS"), "WPI","snow@wpi.edu", 4.0);
        System.out.println(student);
    }
}
