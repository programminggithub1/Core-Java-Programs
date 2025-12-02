package AbstractANDToString;

abstract class HospitalStaff {
    String name;
    int id;
    int age;
    String gender;
    String department;
    double salary;
    int experience;
    String qualification;

    HospitalStaff() { // default constructor
        System.out.println("HospitalStaff default constructor");
        this.name = "Unknown";
        this.id = 0;
        this.age = 0;
        this.gender = "Not specified";
        this.department = "General";
        this.salary = 0.0;
        this.experience = 0;
        this.qualification = "Not specified";
    }

    HospitalStaff(String name, int id, int age, String gender, String department,
                  double salary, int experience, String qualification) { // parameterized constructor
        System.out.println("HospitalStaff parameterized constructor");
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.qualification = qualification;
    }

    abstract void performDuties();

    String getName() { return name; }
    void setName(String name) { this.name = name; }
    int getId() { return id; }
    void setId(int id) { this.id = id; }
    int getAge() { return age; }
    void setAge(int age) { this.age = age; }
    String getGender() { return gender; }
    void setGender(String gender) { this.gender = gender; }
    String getDepartment() { return department; }
    void setDepartment(String department) { this.department = department; }
    double getSalary() { return salary; }
    void setSalary(double salary) { this.salary = salary; }
    int getExperience() { return experience; }
    void setExperience(int experience) { this.experience = experience; }
    String getQualification() { return qualification; }
    void setQualification(String qualification) { this.qualification = qualification; }

    public String toString() {
        return "\nName::" + name + " ID::" + id + " Age::" + age + " Gender::" + gender +
               " Department::" + department + " Salary::" + salary + " Experience::" + experience +
               " Qualification::" + qualification;
    }
    // void display() { ... } optional
}

// ---------------------- Doctor ----------------------
class Doctor extends HospitalStaff {
    String specialization;
    int patientsPerDay;
    boolean onCall;

    Doctor() {
        super();
        System.out.println("Doctor default constructor");
        specialization = "General Physician";
        patientsPerDay = 0;
        onCall = false;
    }

    Doctor(String name, int id, int age, String gender, String department,
           double salary, int experience, String qualification,
           String specialization, int patientsPerDay, boolean onCall) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Doctor parameterized constructor");
        this.specialization = specialization;
        this.patientsPerDay = patientsPerDay;
        this.onCall = onCall;
    }

    void performDuties() {
        System.out.println("Doctor is diagnosing patients and prescribing treatments.");
    }

    String getSpecialization() { return specialization; }
    void setSpecialization(String specialization) { this.specialization = specialization; }
    int getPatientsPerDay() { return patientsPerDay; }
    void setPatientsPerDay(int patientsPerDay) { this.patientsPerDay = patientsPerDay; }
    boolean isOnCall() { return onCall; }
    void setOnCall(boolean onCall) { this.onCall = onCall; }

    public String toString() {
        return super.toString() + " Specialization::" + specialization + " PatientsPerDay::" + patientsPerDay + " OnCall::" + onCall;
    }
}

// ---------------------- Nurse ----------------------
class Nurse extends HospitalStaff {
    String shiftTiming;
    int patientsAssigned;
    boolean trainedForEmergency;

    Nurse() {
        super();
        System.out.println("Nurse default constructor");
        shiftTiming = "Day";
        patientsAssigned = 0;
        trainedForEmergency = false;
    }

    Nurse(String name, int id, int age, String gender, String department,
          double salary, int experience, String qualification,
          String shiftTiming, int patientsAssigned, boolean trainedForEmergency) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Nurse parameterized constructor");
        this.shiftTiming = shiftTiming;
        this.patientsAssigned = patientsAssigned;
        this.trainedForEmergency = trainedForEmergency;
    }

    void performDuties() {
        System.out.println("Nurse is monitoring patients and assisting doctors.");
    }

    String getShiftTiming() { return shiftTiming; }
    void setShiftTiming(String shiftTiming) { this.shiftTiming = shiftTiming; }
    int getPatientsAssigned() { return patientsAssigned; }
    void setPatientsAssigned(int patientsAssigned) { this.patientsAssigned = patientsAssigned; }
    boolean isTrainedForEmergency() { return trainedForEmergency; }
    void setTrainedForEmergency(boolean trainedForEmergency) { this.trainedForEmergency = trainedForEmergency; }

    public String toString() {
        return super.toString() + " ShiftTiming::" + shiftTiming + " PatientsAssigned::" + patientsAssigned +
               " TrainedForEmergency::" + trainedForEmergency;
    }
}

// ---------------------- Technician ----------------------
class Technician extends HospitalStaff {
    String machineHandled;
    boolean certified;
    int reportsGeneratedPerDay;

    Technician() {
        super();
        System.out.println("Technician default constructor");
        machineHandled = "X-Ray Machine";
        certified = false;
        reportsGeneratedPerDay = 0;
    }

    Technician(String name, int id, int age, String gender, String department,
               double salary, int experience, String qualification,
               String machineHandled, boolean certified, int reportsGeneratedPerDay) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Technician parameterized constructor");
        this.machineHandled = machineHandled;
        this.certified = certified;
        this.reportsGeneratedPerDay = reportsGeneratedPerDay;
    }

    void performDuties() {
        System.out.println("Technician is operating machines and preparing reports.");
    }

    String getMachineHandled() { return machineHandled; }
    void setMachineHandled(String machineHandled) { this.machineHandled = machineHandled; }
    boolean isCertified() { return certified; }
    void setCertified(boolean certified) { this.certified = certified; }
    int getReportsGeneratedPerDay() { return reportsGeneratedPerDay; }
    void setReportsGeneratedPerDay(int reportsGeneratedPerDay) { this.reportsGeneratedPerDay = reportsGeneratedPerDay; }

    public String toString() {
        return super.toString() + " MachineHandled::" + machineHandled + " Certified::" + certified +
               " ReportsGeneratedPerDay::" + reportsGeneratedPerDay;
    }
}

// ---------------------- DemoHospitalStaff ----------------------
class DemoHospitalStaff {
    public static void main(String[] args) {
        HospitalStaff s1; // generic reference

        s1 = new Doctor("Dr. Meera Nair", 101, 45, "Female", "Cardiology", 
                120000, 20, "MBBS, MD", "Cardiologist", 25, true); // upcasting
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println("\n");

        s1 = new Nurse("Anita Sharma", 202, 30, "Female", "ICU", 
                55000, 8, "B.Sc Nursing", "Night", 10, true); // upcasting
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println("\n");

        s1 = new Technician("Ravi Kumar", 303, 28, "Male", "Radiology", 
                40000, 5, "Diploma in Medical Lab Tech", "MRI Machine", true, 15); // upcasting
        System.out.println(s1.toString());
        System.out.println(s1);
    }
}
