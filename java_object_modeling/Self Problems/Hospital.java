import java.util.ArrayList;

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName());
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Doctor doctor) {
        doctor.consult(this);
    }
}

class Hospital {
    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Brown");
        Doctor doctor2 = new Doctor("Dr. Green");

        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        patient1.consult(doctor1);
        patient2.consult(doctor2);
    }
}
