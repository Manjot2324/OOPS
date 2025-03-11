import java.util.ArrayList;

class Employee {
    private String employeeName;
    private String position;

    public Employee(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee[Name: " + employeeName + ", Position: " + position + "]";
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }

    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department department1 = new Department("IT");
        Department department2 = new Department("HR");

        Employee employee1 = new Employee("Alice", "Software Engineer");
        Employee employee2 = new Employee("Bob", "HR Manager");

        department1.addEmployee(employee1);
        department2.addEmployee(employee2);

        company.addDepartment(department1);
        company.addDepartment(department2);

        company.displayCompanyDetails();
    }
}
