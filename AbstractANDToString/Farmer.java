package AbstractANDToString;

abstract class Farmer {
    int id;
    String name;
    String city;
    double annualIncome;
    int noOfRequirement;
    double landArea;

    Farmer() {
        System.out.println("Farmer default constructor");
        this.id = 123;
        this.name = "Jotiram";
        this.city = "Karad";
        this.annualIncome = 456745;
        this.noOfRequirement = 45;
        this.landArea = 45;
    }

    Farmer(int id, String name, String city, double annualIncome, int noOfRequirement, double landArea) {
        System.out.println("Farmer parameterized constructor");
        this.id = id;
        this.name = name;
        this.city = city;
        this.annualIncome = annualIncome;
        this.noOfRequirement = noOfRequirement;
        this.landArea = landArea;
    }

    abstract void calSubsidy();

    int getId() { return id; }
    void setId(int id) { this.id = id; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getCity() { return city; }
    void setCity(String city) { this.city = city; }

    double getAnnualIncome() { return annualIncome; }
    void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }

    int getNoOfRequirement() { return noOfRequirement; }
    void setNoOfRequirement(int noOfRequirement) { this.noOfRequirement = noOfRequirement; }

    double getLandArea() { return landArea; }
    void setLandArea(double landArea) { this.landArea = landArea; }

    public String toString() {
        return "\nID::" + id + " Name::" + name + " City::" + city + " AnnualIncome::" + annualIncome
                + " NoOfRequirement::" + noOfRequirement + " LandArea::" + landArea;
    }
}

// DairyFarmer subclass
class DairyFarmer extends Farmer {
    int noOfCattles;
    double milkProducePerDay;
    int dairyLicenseNo;

    DairyFarmer() {
        super();
        System.out.println("DairyFarmer default constructor");
        this.noOfCattles = 523;
        this.milkProducePerDay = 678;
        this.dairyLicenseNo = 45;
    }

    DairyFarmer(int id, String name, String city, double annualIncome, int noOfRequirement, double landArea,
                int noOfCattles, double milkProducePerDay, int dairyLicenseNo) {
        super(id, name, city, annualIncome, noOfRequirement, landArea);
        System.out.println("DairyFarmer parameterized constructor");
        this.noOfCattles = noOfCattles;
        this.milkProducePerDay = milkProducePerDay;
        this.dairyLicenseNo = dairyLicenseNo;
    }

    void calSubsidy() {
        System.out.println("Calculate subsidy based on number of cattles");
    }

    int getNoOfCattles() { return noOfCattles; }
    void setNoOfCattles(int noOfCattles) { this.noOfCattles = noOfCattles; }

    double getMilkProducePerDay() { return milkProducePerDay; }
    void setMilkProducePerDay(double milkProducePerDay) { this.milkProducePerDay = milkProducePerDay; }

    int getDairyLicenseNo() { return dairyLicenseNo; }
    void setDairyLicenseNo(int dairyLicenseNo) { this.dairyLicenseNo = dairyLicenseNo; }

    public String toString() {
        return super.toString() + " NoOfCattles::" + noOfCattles + " MilkProducePerDay::" + milkProducePerDay
                + " DairyLicenseNo::" + dairyLicenseNo;
    }
}

// PoultryFarmer subclass
class PoultryFarmer extends Farmer {
    int poultryNumber;
    int noOfChickens;
    int noOfShades;
    double eggsProductionPerDay;

    PoultryFarmer() {
        super();
        System.out.println("PoultryFarmer default constructor");
        this.poultryNumber = 523;
        this.noOfChickens = 678;
        this.noOfShades = 45;
        this.eggsProductionPerDay = 45;
    }

    PoultryFarmer(int id, String name, String city, double annualIncome, int noOfRequirement, double landArea,
                  int poultryNumber, int noOfChickens, int noOfShades, double eggsProductionPerDay) {
        super(id, name, city, annualIncome, noOfRequirement, landArea);
        System.out.println("PoultryFarmer parameterized constructor");
        this.poultryNumber = poultryNumber;
        this.noOfChickens = noOfChickens;
        this.noOfShades = noOfShades;
        this.eggsProductionPerDay = eggsProductionPerDay;
    }

    void calSubsidy() {
        System.out.println("Calculate subsidy based on number of chickens");
    }

    int getPoultryNumber() { return poultryNumber; }
    void setPoultryNumber(int poultryNumber) { this.poultryNumber = poultryNumber; }

    int getNoOfChickens() { return noOfChickens; }
    void setNoOfChickens(int noOfChickens) { this.noOfChickens = noOfChickens; }

    int getNoOfShades() { return noOfShades; }
    void setNoOfShades(int noOfShades) { this.noOfShades = noOfShades; }

    double getEggsProductionPerDay() { return eggsProductionPerDay; }
    void setEggsProductionPerDay(double eggsProductionPerDay) { this.eggsProductionPerDay = eggsProductionPerDay; }

    public String toString() {
        return super.toString() + " PoultryNumber::" + poultryNumber + " NoOfChickens::" + noOfChickens
                + " NoOfShades::" + noOfShades + " EggsProductionPerDay::" + eggsProductionPerDay;
    }
}

// OrganicFarmer subclass
class OrganicFarmer extends Farmer {
    int organicId;
    String cropType;
    String fertilizerUsed;

    OrganicFarmer() {
        super();
        System.out.println("OrganicFarmer default constructor");
        this.organicId = 523;
        this.cropType = "default";
        this.fertilizerUsed = "default";
    }

    OrganicFarmer(int id, String name, String city, double annualIncome, int noOfRequirement, double landArea,
                  int organicId, String cropType, String fertilizerUsed) {
        super(id, name, city, annualIncome, noOfRequirement, landArea);
        System.out.println("OrganicFarmer parameterized constructor");
        this.organicId = organicId;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    void calSubsidy() {
        System.out.println("Calculate subsidy based on crop type");
    }

    int getOrganicId() { return organicId; }
    void setOrganicId(int organicId) { this.organicId = organicId; }

    String getCropType() { return cropType; }
    void setCropType(String cropType) { this.cropType = cropType; }

    String getFertilizerUsed() { return fertilizerUsed; }
    void setFertilizerUsed(String fertilizerUsed) { this.fertilizerUsed = fertilizerUsed; }

    public String toString() {
        return super.toString() + " OrganicId::" + organicId + " CropType::" + cropType
                + " FertilizerUsed::" + fertilizerUsed;
    }
}

// Demo class
class DemoFarmer {
    public static void main(String[] args) {
        Farmer f1; // generic reference

        System.out.println("\n--- Poultry Farmer (Parameterized) ---");
        f1 = new PoultryFarmer(201, "Ramesh", "Satara", 500000, 10, 5.5, 101, 250, 3, 450.75);
        System.out.println(f1.toString());
        System.out.println(f1);

        System.out.println("\n--- Organic Farmer (Parameterized) ---");
        f1 = new OrganicFarmer(301, "Ganesh", "Kolhapur", 600000, 8, 6.8, 501, "Sugarcane", "Organic Compost");
        System.out.println(f1.toString());
        System.out.println(f1);

        System.out.println("\n--- Dairy Farmer (Parameterized) ---");
        f1 = new DairyFarmer(401, "Suresh", "Pune", 700000, 12, 8.2, 50, 120.5, 9001);
        System.out.println(f1.toString());
        System.out.println(f1);
    }
}
