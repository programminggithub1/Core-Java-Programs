package Polymorphism;

public class HospitalStaff {
    String name;
    int id;
    int age;
    String gender;
    String department;
    double salary;
    int experience;
    String qualification;

    // Default Constructor
    HospitalStaff() {
        System.out.println("HospitalStaff default constructor");
        name = "Unknown";
        id = 0;
        age = 0;
        gender = "Not specified";
        department = "General";
        salary = 0.0;
        experience = 0;
        qualification = "Not specified";
    }

    // Parameterized Constructor
    HospitalStaff(String name, int id, int age, String gender, String department,
                  double salary, int experience, String qualification) {
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

     String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 int getId() {
		return id;
	}

	 void setId(int id) {
		this.id = id;
	}

	 int getAge() {
		return age;
	}

	 void setAge(int age) {
		this.age = age;
	}

	 String getGender() {
		return gender;
	}

	 void setGender(String gender) {
		this.gender = gender;
	}

	 String getDepartment() {
		return department;
	}

	 void setDepartment(String department) {
		this.department = department;
	}

	 double getSalary() {
		return salary;
	}

	 void setSalary(double salary) {
		this.salary = salary;
	}

	 int getExperience() {
		return experience;
	}

	 void setExperience(int experience) {
		this.experience = experience;
	}

	 String getQualification() {
		return qualification;
	}

	 void setQualification(String qualification) {
		this.qualification = qualification;
	}

	void performDuties() {
        System.out.println("Hospital staff is performing general duties...");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Qualification: " + qualification);
    }
} // HospitalStaff class ends here


//  ---------------------- Doctor ----------------------
class Doctor extends HospitalStaff {
    String specialization;
    int patientsPerDay;
    boolean onCall;
    // Default Constructor
    Doctor() {
        super();
        System.out.println("Doctor default constructor");
        specialization = "General Physician";
        patientsPerDay = 0;
        onCall = false;
    }
 // Parameterized Constructor
    Doctor(String name, int id, int age, String gender, String department,
           double salary, int experience, String qualification,
           String specialization, int patientsPerDay, boolean onCall) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Doctor parameterized constructor");
        this.specialization = specialization;
        this.patientsPerDay = patientsPerDay;
        this.onCall = onCall;
    }

     String getSpecialization() {
		return specialization;
	}
	 void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	 int getPatientsPerDay() {
		return patientsPerDay;
	}
	 void setPatientsPerDay(int patientsPerDay) {
		this.patientsPerDay = patientsPerDay;
	}
	 boolean isOnCall() {
		return onCall;
	}
	 void setOnCall(boolean onCall) {
		this.onCall = onCall;
	}
	void performDuties() {
        System.out.println("Doctor is diagnosing patients and prescribing treatments.");
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Patients per Day: " + patientsPerDay);
        System.out.println("On Call Duty: " + onCall);
    }
} // Doctor ends here


//---------------------- Nurse ----------------------
class Nurse extends HospitalStaff {
    String shiftTiming;
    int patientsAssigned;
    boolean trainedForEmergency;
    
    // Default Constructor
    Nurse() {
        super();
        System.out.println("Nurse default constructor");
        shiftTiming = "Day";
        patientsAssigned = 0;
        trainedForEmergency = false;
    }

 // Parameterized Constructor
    Nurse(String name, int id, int age, String gender, String department,
          double salary, int experience, String qualification,
          String shiftTiming, int patientsAssigned, boolean trainedForEmergency) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Nurse parameterized constructor");
        this.shiftTiming = shiftTiming;
        this.patientsAssigned = patientsAssigned;
        this.trainedForEmergency = trainedForEmergency;
    }

     String getShiftTiming() {
		return shiftTiming;
	}

	 void setShiftTiming(String shiftTiming) {
		this.shiftTiming = shiftTiming;
	}

	 int getPatientsAssigned() {
		return patientsAssigned;
	}

	 void setPatientsAssigned(int patientsAssigned) {
		this.patientsAssigned = patientsAssigned;
	}

	 boolean isTrainedForEmergency() {
		return trainedForEmergency;
	}

	 void setTrainedForEmergency(boolean trainedForEmergency) {
		this.trainedForEmergency = trainedForEmergency;
	}

	void performDuties() {
        System.out.println("Nurse is monitoring patients and assisting doctors.");
    }

    void display() {
        super.display();
        System.out.println("Shift Timing: " + shiftTiming);
        System.out.println("Patients Assigned: " + patientsAssigned);
        System.out.println("Trained for Emergency: " + trainedForEmergency);
    }
} // Nurse ends here


//  ---------------------- Technician ----------------------
class Technician extends HospitalStaff {
    String machineHandled;
    boolean certified;
    int reportsGeneratedPerDay;
    
    // Default Constructor
    Technician() {
        super();
        System.out.println("Technician default constructor");
        machineHandled = "X-Ray Machine";
        certified = false;
        reportsGeneratedPerDay = 0;
    }
 // Parameterized Constructor
    Technician(String name, int id, int age, String gender, String department,
               double salary, int experience, String qualification,
               String machineHandled, boolean certified, int reportsGeneratedPerDay) {
        super(name, id, age, gender, department, salary, experience, qualification);
        System.out.println("Technician parameterized constructor");
        this.machineHandled = machineHandled;
        this.certified = certified;
        this.reportsGeneratedPerDay = reportsGeneratedPerDay;
    }

     String getMachineHandled() {
		return machineHandled;
	}
	 void setMachineHandled(String machineHandled) {
		this.machineHandled = machineHandled;
	}
	 boolean isCertified() {
		return certified;
	}
	 void setCertified(boolean certified) {
		this.certified = certified;
	}
	 int getReportsGeneratedPerDay() {
		return reportsGeneratedPerDay;
	}
	 void setReportsGeneratedPerDay(int reportsGeneratedPerDay) {
		this.reportsGeneratedPerDay = reportsGeneratedPerDay;
	}
	void performDuties() {
        System.out.println("Technician is operating machines and preparing reports.");
    }

    void display() {
        super.display();
        System.out.println("Machine Handled: " + machineHandled);
        System.out.println("Certified: " + certified);
        System.out.println("Reports Generated per Day: " + reportsGeneratedPerDay);
    }
} // Technician ends here


// ---------------------- DemoHospitalStaff ----------------------
class DemoHospitalStaff {
    public static void main(String[] args) {
        System.out.println("\n--- Using Parameterized Constructors ---");

        HospitalStaff s1;//generic reference

        s1 = new Doctor("Dr. Meera Nair", 101, 45, "Female", "Cardiology", 
                120000, 20, "MBBS, MD", "Cardiologist", 25, true);//upcasting
        s1.performDuties();
        s1.display();
        System.out.println("\n");

        s1 = new Nurse("Anita Sharma", 202, 30, "Female", "ICU", 
                55000, 8, "B.Sc Nursing", "Night", 10, true);//upcasting
        s1.performDuties();
        s1.display();
        System.out.println("\n");

        s1 = new Technician("Ravi Kumar", 303, 28, "Male", "Radiology", 
                40000, 5, "Diploma in Medical Lab Tech", "MRI Machine", true, 15);//upcasting
        s1.performDuties();
        s1.display();
    }
}
