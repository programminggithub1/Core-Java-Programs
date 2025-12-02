package AbstractANDToString;

abstract class Defence {
    String NameOfHead;
    int NoOfMissionsPerformed;
    double budget;
    int NoOfDept;
    int NoOfCasualties;
    String LocationOfHeadQuarters;
    int NoOfTroops;
    int NoOfVehicles;
    int MapOwnerCount;

    Defence() { // default constructor
        System.out.println("Defence default constructor");
        NameOfHead = "Rohit";
        NoOfMissionsPerformed = 67;
        budget = 45678;
        NoOfDept = 30;
        NoOfCasualties = 43;
        LocationOfHeadQuarters = "Asam";
        NoOfTroops = 78;
        NoOfVehicles = 200;
        MapOwnerCount = 45;
    }

    Defence(String NameOfHead, int NoOfMissionsPerformed, double budget, int NoOfDept, int NoOfCasualties,
            String LocationOfHeadQuarters, int NoOfTroops, int NoOfVehicles, int MapOwnerCount) { // parameterized constructor
        System.out.println("Defence parameterized constructor");
        this.NameOfHead = NameOfHead;
        this.NoOfMissionsPerformed = NoOfMissionsPerformed;
        this.budget = budget;
        this.NoOfDept = NoOfDept;
        this.NoOfCasualties = NoOfCasualties;
        this.LocationOfHeadQuarters = LocationOfHeadQuarters;
        this.NoOfTroops = NoOfTroops;
        this.NoOfVehicles = NoOfVehicles;
        this.MapOwnerCount = MapOwnerCount;
    }

    abstract void attack();

    // Getters and Setters
    String getNameOfHead() { return NameOfHead; }
    void setNameOfHead(String NameOfHead) { this.NameOfHead = NameOfHead; }

    int getNoOfMissionsPerformed() { return NoOfMissionsPerformed; }
    void setNoOfMissionsPerformed(int NoOfMissionsPerformed) { this.NoOfMissionsPerformed = NoOfMissionsPerformed; }

    double getBudget() { return budget; }
    void setBudget(double budget) { this.budget = budget; }

    int getNoOfDept() { return NoOfDept; }
    void setNoOfDept(int NoOfDept) { this.NoOfDept = NoOfDept; }

    int getNoOfCasualties() { return NoOfCasualties; }
    void setNoOfCasualties(int NoOfCasualties) { this.NoOfCasualties = NoOfCasualties; }

    String getLocationOfHeadQuarters() { return LocationOfHeadQuarters; }
    void setLocationOfHeadQuarters(String LocationOfHeadQuarters) { this.LocationOfHeadQuarters = LocationOfHeadQuarters; }

    int getNoOfTroops() { return NoOfTroops; }
    void setNoOfTroops(int NoOfTroops) { this.NoOfTroops = NoOfTroops; }

    int getNoOfVehicles() { return NoOfVehicles; }
    void setNoOfVehicles(int NoOfVehicles) { this.NoOfVehicles = NoOfVehicles; }

    int getMapOwnerCount() { return MapOwnerCount; }
    void setMapOwnerCount(int MapOwnerCount) { this.MapOwnerCount = MapOwnerCount; }

    public String toString() {
        return "\nNameOfHead::" + NameOfHead + " NoOfMissionsPerformed::" + NoOfMissionsPerformed
                + " Budget::" + budget + " NoOfDept::" + NoOfDept + " NoOfCasualties::" + NoOfCasualties
                + " LocationOfHeadQuarters::" + LocationOfHeadQuarters + " NoOfTroops::" + NoOfTroops
                + " NoOfVehicles::" + NoOfVehicles + " MapOwnerCount::" + MapOwnerCount;
    }
} // Defence ends here

class Army extends Defence {
    int NoOfTanks;
    int NoOfGuns;
    int NoOfGranats;
    int NoOfButalian;

    Army() {
        super();
        System.out.println("Army default constructor");
        NoOfTanks = 56;
        NoOfGuns = 56;
        NoOfGranats = 89;
        NoOfButalian = 43;
    }

    Army(String NameOfHead, int NoOfMissionsPerformed, double budget, int NoOfDept, int NoOfCasualties,
            String LocationOfHeadQuarters, int NoOfTroops, int NoOfVehicles, int MapOwnerCount,
            int NoOfTanks, int NoOfGuns, int NoOfGranats, int NoOfButalian) {
        super(NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters,
                NoOfTroops, NoOfVehicles, MapOwnerCount);
        this.NoOfTanks = NoOfTanks;
        this.NoOfGuns = NoOfGuns;
        this.NoOfGranats = NoOfGranats;
        this.NoOfButalian = NoOfButalian;
    }

    void attack() {
        System.out.println("Attack on gun ways");
    }

    int getNoOfTanks() { return NoOfTanks; }
    void setNoOfTanks(int NoOfTanks) { this.NoOfTanks = NoOfTanks; }

    int getNoOfGuns() { return NoOfGuns; }
    void setNoOfGuns(int NoOfGuns) { this.NoOfGuns = NoOfGuns; }

    int getNoOfGranats() { return NoOfGranats; }
    void setNoOfGranats(int NoOfGranats) { this.NoOfGranats = NoOfGranats; }

    int getNoOfButalian() { return NoOfButalian; }
    void setNoOfButalian(int NoOfButalian) { this.NoOfButalian = NoOfButalian; }

    public String toString() {
        return super.toString() + " NoOfTanks::" + NoOfTanks + " NoOfGuns::" + NoOfGuns
                + " NoOfGranats::" + NoOfGranats + " NoOfButalian::" + NoOfButalian;
    }
} // Army ends here

class Navy extends Defence {
    int NoOfShips;
    int NoOfSubmariens;
    int NoOftorpedos;

    Navy() {
        super();
        System.out.println("Navy default constructor");
        NoOfShips = 56;
        NoOfSubmariens = 56;
        NoOftorpedos = 89;
    }

    Navy(String NameOfHead, int NoOfMissionsPerformed, double budget, int NoOfDept, int NoOfCasualties,
            String LocationOfHeadQuarters, int NoOfTroops, int NoOfVehicles, int MapOwnerCount,
            int NoOfShips, int NoOfSubmariens, int NoOftorpedos) {
        super(NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters,
                NoOfTroops, NoOfVehicles, MapOwnerCount);
        System.out.println("Navy parameterized constructor");
        this.NoOfShips = NoOfShips;
        this.NoOfSubmariens = NoOfSubmariens;
        this.NoOftorpedos = NoOftorpedos;
    }

    void attack() {
        System.out.println("Attack on torpedos ways");
    }

    int getNoOfShips() { return NoOfShips; }
    void setNoOfShips(int NoOfShips) { this.NoOfShips = NoOfShips; }

    int getNoOfSubmariens() { return NoOfSubmariens; }
    void setNoOfSubmariens(int NoOfSubmariens) { this.NoOfSubmariens = NoOfSubmariens; }

    int getNoOftorpedos() { return NoOftorpedos; }
    void setNoOftorpedos(int NoOftorpedos) { this.NoOftorpedos = NoOftorpedos; }

    public String toString() {
        return super.toString() + " NoOfShips::" + NoOfShips + " NoOfSubmariens::" + NoOfSubmariens
                + " NoOftorpedos::" + NoOftorpedos;
    }
} // Navy ends here

class AirForce extends Defence {
    int NoOfmisile;
    int NoOfaircrafts;
    int NoOfsqadron;

    AirForce() {
        super();
        System.out.println("AirForce default constructor");
        NoOfmisile = 56;
        NoOfaircrafts = 56;
        NoOfsqadron = 89;
    }

    AirForce(String NameOfHead, int NoOfMissionsPerformed, double budget, int NoOfDept, int NoOfCasualties,
            String LocationOfHeadQuarters, int NoOfTroops, int NoOfVehicles, int MapOwnerCount,
            int NoOfmisile, int NoOfaircrafts, int NoOfsqadron) {
        super(NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters,
                NoOfTroops, NoOfVehicles, MapOwnerCount);
        System.out.println("AirForce parameterized constructor");
        this.NoOfmisile = NoOfmisile;
        this.NoOfaircrafts = NoOfaircrafts;
        this.NoOfsqadron = NoOfsqadron;
    }

    void attack() {
        System.out.println("Attack on missiles ways");
    }

    int getNoOfmisile() { return NoOfmisile; }
    void setNoOfmisile(int NoOfmisile) { this.NoOfmisile = NoOfmisile; }

    int getNoOfaircrafts() { return NoOfaircrafts; }
    void setNoOfaircrafts(int NoOfaircrafts) { this.NoOfaircrafts = NoOfaircrafts; }

    int getNoOfsqadron() { return NoOfsqadron; }
    void setNoOfsqadron(int NoOfsqadron) { this.NoOfsqadron = NoOfsqadron; }

    public String toString() {
        return super.toString() + " NoOfmisile::" + NoOfmisile + " NoOfaircrafts::" + NoOfaircrafts
                + " NoOfsqadron::" + NoOfsqadron;
    }
} // AirForce ends here

class DemoDefence {
    public static void main(String[] args) {
        Defence d1; // generic reference

        System.out.println("\n--- Army (Parameterized) ---");
        d1 = new Army("General Singh", 120, 9500000, 10, 5, "Delhi", 500, 200, 25, 100, 300, 500, 8); // upcasting
        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("\n--- Navy (Parameterized) ---");
        d1 = new Navy("Admiral Rajesh", 80, 8000000, 8, 3, "Mumbai", 300, 150, 20, 20, 10, 50); // upcasting
        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("\n--- AirForce (Parameterized) ---");
        d1 = new AirForce("Air Marshal Verma", 150, 12000000, 12, 2, "Pune", 400, 180, 30, 60, 25, 5); // upcasting
        System.out.println(d1.toString());
        System.out.println(d1);
    }
}
