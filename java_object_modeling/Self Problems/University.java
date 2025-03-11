import java.util.ArrayList;

class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Faculty> faculties;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.getFacultyName());
        }
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartments() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.showFaculties();
        }
    }

    public static void main(String[] args) {
        University university = new University("Tech University");

        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);

        university.addDepartment(department1);
        university.addDepartment(department2);

        university.showDepartments();
    }
}
