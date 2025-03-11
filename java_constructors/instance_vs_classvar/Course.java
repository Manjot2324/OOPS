import java.util.*;

class Course {
    private String courseName;
    private int duration;
    private double fee;
    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 300.0);
        Course c2 = new Course("Web Development", 4, 400.0);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
