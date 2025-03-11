import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName + ", Taught by: " + professor.getName());
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " has enrolled in " + course);
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}

class University2{
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Watson");
        Course course = new Course("Physics 101");

        professor.assignCourse(course);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.enrollCourse(course);
        student2.enrollCourse(course);

        course.showCourseDetails();
    }
}
