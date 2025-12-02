package Polymorphism;

public class Instrument {
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
        name = "Unknown";
        type = "Not specified";
        material = "Wood";
        price = 0.0;
        weight = 0.0;
        originCountry = "Unknown";
        brand = "No Brand";
        isElectronic = false;
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

    void play() {
        System.out.println("Instrument is being played...");
    }

     String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 String getType() {
		return type;
	}

	 void setType(String type) {
		this.type = type;
	}

	 String getMaterial() {
		return material;
	}

	 void setMaterial(String material) {
		this.material = material;
	}

	 double getPrice() {
		return price;
	}

	 void setPrice(double price) {
		this.price = price;
	}

	 double getWeight() {
		return weight;
	}

	 void setWeight(double weight) {
		this.weight = weight;
	}

	 String getOriginCountry() {
		return originCountry;
	}

	 void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	 String getBrand() {
		return brand;
	}

	 void setBrand(String brand) {
		this.brand = brand;
	}

	 boolean isElectronic() {
		return isElectronic;
	}

	 void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
	}

	void display() {
        System.out.println("Instrument Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: ₹" + price);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Brand: " + brand);
        System.out.println("Electronic: " + isElectronic);
    }
} // Instrument class ends here


// ---------------------- 🎶 Flute ----------------------
class Flute extends Instrument {
    int numberOfHoles;
    String keyType; // e.g. C-key, D-key
    double length;

    // Default Constructor
    Flute() {
        super();
        System.out.println("Flute default constructor");
        numberOfHoles = 6;
        keyType = "C";
        length = 0.5;
    }

 // Parameterized Constructor
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
        System.out.println("Flute is playing melodious tunes through air flow.");
    }

     int getNumberOfHoles() {
		return numberOfHoles;
	}

	 void setNumberOfHoles(int numberOfHoles) {
		this.numberOfHoles = numberOfHoles;
	}

	 String getKeyType() {
		return keyType;
	}

	 void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	 double getLength() {
		return length;
	}

	 void setLength(double length) {
		this.length = length;
	}

	void display() {
        super.display();
        System.out.println("Number of Holes: " + numberOfHoles);
        System.out.println("Key Type: " + keyType);
        System.out.println("Length: " + length + " m");
    }
} // Flute ends here


// ---------------------- 🥁 Tabla ----------------------
class Tabla extends Instrument {
    String materialOfDrum;
    double diameter;
    boolean hasSyahi; // black spot in middle of tabla
    // Default Constructor
    Tabla() {
        super();
        System.out.println("Tabla default constructor");
        materialOfDrum = "Wood and Leather";
        diameter = 0.4;
        hasSyahi = true;
    }
 // Parameterized Constructor
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
        System.out.println("Tabla is producing rhythmic beats with hands.");
    }

     String getMaterialOfDrum() {
		return materialOfDrum;
	}
	 void setMaterialOfDrum(String materialOfDrum) {
		this.materialOfDrum = materialOfDrum;
	}
	 double getDiameter() {
		return diameter;
	}
	 void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	 boolean isHasSyahi() {
		return hasSyahi;
	}
	 void setHasSyahi(boolean hasSyahi) {
		this.hasSyahi = hasSyahi;
	}
	void display() {
        super.display();
        System.out.println("Drum Material: " + materialOfDrum);
        System.out.println("Diameter: " + diameter + " m");
        System.out.println("Has Syahi: " + hasSyahi);
    }
} // Tabla ends here


// ---------------------- 🎸 Guitar ----------------------
class Guitar extends Instrument {
    int numberOfStrings;
    boolean hasAmplifier;
    String guitarType; // Acoustic / Electric

    // Default Constructor
    Guitar() {
        super();
        System.out.println("Guitar default constructor");
        numberOfStrings = 6;
        hasAmplifier = false;
        guitarType = "Acoustic";
    }

 // Parameterized Constructor
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

     int getNumberOfStrings() {
		return numberOfStrings;
	}

	 void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	 boolean isHasAmplifier() {
		return hasAmplifier;
	}

	 void setHasAmplifier(boolean hasAmplifier) {
		this.hasAmplifier = hasAmplifier;
	}

	 String getGuitarType() {
		return guitarType;
	}

	 void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}

	void display() {
        super.display();
        System.out.println("Number of Strings: " + numberOfStrings);
        System.out.println("Has Amplifier: " + hasAmplifier);
        System.out.println("Guitar Type: " + guitarType);
    }
} // Guitar ends here


// ---------------------- 🎤 Demo Class ----------------------
class DemoInstrument {
    public static void main(String[] args) {
        System.out.println("\n--- Using Parameterized Constructors ---");

        Instrument i1;//generic reference

        i1 = new Flute("Bansuri", "Wind", "Bamboo", 2500, 0.2, 
        		"India", "Saraswati", false, 6, "C", 0.45);//upcasting
        i1.play();
        i1.display();
        System.out.println("\n");

        i1 = new Tabla("Tabla Set", "Percussion", "Wood & Leather",
        		8500, 4.5, "India", "Rhythm", false, "Sheesham Wood", 0.42, true);//upcasting
        i1.play();
        i1.display();
        System.out.println("\n");

        i1 = new Guitar("Yamaha F310", "String", "Wood", 12500, 3.2,
        		"Japan", "Yamaha", false, 6, false, "Acoustic");//upcasting
        i1.play();
        i1.display();
    }
}
