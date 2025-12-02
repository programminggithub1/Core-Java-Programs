package AbstractANDToString;

abstract class Instrument {
    String name;
    String type;
    String material;
    double price;
    double weight;
    String originCountry;
    String brand;
    boolean isElectronic;

    // Default Constructor
    Instrument() {
        System.out.println("Instrument default constructor");
        this.name = "Unknown";
        this.type = "Not specified";
        this.material = "Wood";
        this.price = 0.0;
        this.weight = 0.0;
        this.originCountry = "Unknown";
        this.brand = "No Brand";
        this.isElectronic = false;
    }

    // Parameterized Constructor
    Instrument(String name, String type, String material, double price, double weight,
               String originCountry, String brand, boolean isElectronic) {
        System.out.println("Instrument parameterized constructor");
        this.name = name;
        this.type = type;
        this.material = material;
        this.price = price;
        this.weight = weight;
        this.originCountry = originCountry;
        this.brand = brand;
        this.isElectronic = isElectronic;
    }

    abstract void play();

    String getName() { return name; }
    void setName(String name) { this.name = name; }
    String getType() { return type; }
    void setType(String type) { this.type = type; }
    String getMaterial() { return material; }
    void setMaterial(String material) { this.material = material; }
    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }
    double getWeight() { return weight; }
    void setWeight(double weight) { this.weight = weight; }
    String getOriginCountry() { return originCountry; }
    void setOriginCountry(String originCountry) { this.originCountry = originCountry; }
    String getBrand() { return brand; }
    void setBrand(String brand) { this.brand = brand; }
    boolean isElectronic() { return isElectronic; }
    void setElectronic(boolean isElectronic) { this.isElectronic = isElectronic; }

    public String toString() {
        return "\nName::" + name + " Type::" + type + " Material::" + material +
               " Price::" + price + " Weight::" + weight + " Origin::" + originCountry +
               " Brand::" + brand + " Electronic::" + isElectronic;
    }
    // void display() { ... } optional
}

// ---------------------- Flute ----------------------
class Flute extends Instrument {
    int numberOfHoles;
    String keyType;
    double length;

    Flute() {
        super();
        System.out.println("Flute default constructor");
        this.numberOfHoles = 6;
        this.keyType = "C";
        this.length = 0.5;
    }

    Flute(String name, String type, String material, double price, double weight,
          String originCountry, String brand, boolean isElectronic,
          int numberOfHoles, String keyType, double length) {
        super(name, type, material, price, weight, originCountry, brand, isElectronic);
        System.out.println("Flute parameterized constructor");
        this.numberOfHoles = numberOfHoles;
        this.keyType = keyType;
        this.length = length;
    }

    void play() {
        System.out.println("Flute is playing melodious tunes.");
    }

    int getNumberOfHoles() { return numberOfHoles; }
    void setNumberOfHoles(int numberOfHoles) { this.numberOfHoles = numberOfHoles; }
    String getKeyType() { return keyType; }
    void setKeyType(String keyType) { this.keyType = keyType; }
    double getLength() { return length; }
    void setLength(double length) { this.length = length; }

    public String toString() {
        return super.toString() + " NumberOfHoles::" + numberOfHoles + " KeyType::" + keyType +
               " Length::" + length;
    }
}

// ---------------------- Tabla ----------------------
class Tabla extends Instrument {
    String materialOfDrum;
    double diameter;
    boolean hasSyahi;

    Tabla() {
        super();
        System.out.println("Tabla default constructor");
        this.materialOfDrum = "Wood and Leather";
        this.diameter = 0.4;
        this.hasSyahi = true;
    }

    Tabla(String name, String type, String material, double price, double weight,
          String originCountry, String brand, boolean isElectronic,
          String materialOfDrum, double diameter, boolean hasSyahi) {
        super(name, type, material, price, weight, originCountry, brand, isElectronic);
        System.out.println("Tabla parameterized constructor");
        this.materialOfDrum = materialOfDrum;
        this.diameter = diameter;
        this.hasSyahi = hasSyahi;
    }

    void play() {
        System.out.println("Tabla is producing rhythmic beats.");
    }

    String getMaterialOfDrum() { return materialOfDrum; }
    void setMaterialOfDrum(String materialOfDrum) { this.materialOfDrum = materialOfDrum; }
    double getDiameter() { return diameter; }
    void setDiameter(double diameter) { this.diameter = diameter; }
    boolean isHasSyahi() { return hasSyahi; }
    void setHasSyahi(boolean hasSyahi) { this.hasSyahi = hasSyahi; }

    public String toString() {
        return super.toString() + " DrumMaterial::" + materialOfDrum + " Diameter::" + diameter +
               " HasSyahi::" + hasSyahi;
    }
}

// ---------------------- Guitar ----------------------
class Guitar extends Instrument {
    int numberOfStrings;
    boolean hasAmplifier;
    String guitarType;

    Guitar() {
        super();
        System.out.println("Guitar default constructor");
        this.numberOfStrings = 6;
        this.hasAmplifier = false;
        this.guitarType = "Acoustic";
    }

    Guitar(String name, String type, String material, double price, double weight,
           String originCountry, String brand, boolean isElectronic,
           int numberOfStrings, boolean hasAmplifier, String guitarType) {
        super(name, type, material, price, weight, originCountry, brand, isElectronic);
        System.out.println("Guitar parameterized constructor");
        this.numberOfStrings = numberOfStrings;
        this.hasAmplifier = hasAmplifier;
        this.guitarType = guitarType;
    }

    void play() {
        System.out.println("Guitar is strumming beautiful chords.");
    }

    int getNumberOfStrings() { return numberOfStrings; }
    void setNumberOfStrings(int numberOfStrings) { this.numberOfStrings = numberOfStrings; }
    boolean isHasAmplifier() { return hasAmplifier; }
    void setHasAmplifier(boolean hasAmplifier) { this.hasAmplifier = hasAmplifier; }
    String getGuitarType() { return guitarType; }
    void setGuitarType(String guitarType) { this.guitarType = guitarType; }

    public String toString() {
        return super.toString() + " NumberOfStrings::" + numberOfStrings + " HasAmplifier::" + hasAmplifier +
               " GuitarType::" + guitarType;
    }
}

// ---------------------- DemoInstrument ----------------------
class DemoInstrument {
    public static void main(String[] args) {
        Instrument i1; // generic reference

        i1 = new Flute("Bansuri", "Wind", "Bamboo", 2500, 0.2,
                "India", "Saraswati", false, 6, "C", 0.45); // upcasting
        System.out.println(i1.toString());
        System.out.println(i1);
        System.out.println("\n");

        i1 = new Tabla("Tabla Set", "Percussion", "Wood & Leather",
                8500, 4.5, "India", "Rhythm", false, "Sheesham Wood", 0.42, true); // upcasting
        System.out.println(i1.toString());
        System.out.println(i1);
        System.out.println("\n");

        i1 = new Guitar("Yamaha F310", "String", "Wood", 12500, 3.2,
                "Japan", "Yamaha", false, 6, false, "Acoustic"); // upcasting
        System.out.println(i1.toString());
        System.out.println(i1);
    }
}
