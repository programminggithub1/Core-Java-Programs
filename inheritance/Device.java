package inheritance;

public class Device {
    String brand;
    String model;
    double price;
    int storage;
    int ram;
    String processor;
    double screenSize;
    int batteryCapacity;

    //  Default Constructor
    Device() {
        System.out.println("Device default constructor");
        brand = "Unknown";
        model = "Not specified";
        price = 0.0;
        storage = 0;
        ram = 0;
        processor = "Unknown";
        screenSize = 0.0;
        batteryCapacity = 0;
    }

    //  Parameterized Constructor
    Device(String brand, String model, double price, int storage, int ram, 
           String processor, double screenSize, int batteryCapacity) {
        System.out.println("Device parameterized constructor");
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

     String getBrand() {
		return brand;
	}

	 void setBrand(String brand) {
		this.brand = brand;
	}

	 String getModel() {
		return model;
	}

	 void setModel(String model) {
		this.model = model;
	}

	 double getPrice() {
		return price;
	}

	 void setPrice(double price) {
		this.price = price;
	}

	 int getStorage() {
		return storage;
	}

	 void setStorage(int storage) {
		this.storage = storage;
	}

	 int getRam() {
		return ram;
	}

	 void setRam(int ram) {
		this.ram = ram;
	}

	 String getProcessor() {
		return processor;
	}

	 void setProcessor(String processor) {
		this.processor = processor;
	}

	 double getScreenSize() {
		return screenSize;
	}

	 void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	 int getBatteryCapacity() {
		return batteryCapacity;
	}

	 void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	//  Display Method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Battery: " + batteryCapacity + " mAh");
    }
}//device class ends here

//  Subclass 1: Laptop
class Laptop extends Device {
    boolean hasKeyboard;
    double batteryBackup;
    boolean hasCDDrive;

    Laptop() {
        super();
        System.out.println("Laptop default constructor");
        hasKeyboard = true;
        batteryBackup = 8.5;
        hasCDDrive = false;
    }

    Laptop(String brand, String model, double price, int storage, int ram,
           String processor, double screenSize, int batteryCapacity,
           boolean hasKeyboard, double batteryBackup, boolean hasCDDrive)
    {
    	
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("Laptop parameterized constructor");
        this.hasKeyboard = hasKeyboard;
        this.batteryBackup = batteryBackup;
        this.hasCDDrive = hasCDDrive;
    }

     boolean isHasKeyboard() {
		return hasKeyboard;
	}

	 void setHasKeyboard(boolean hasKeyboard) {
		this.hasKeyboard = hasKeyboard;
	}

	 double getBatteryBackup() {
		return batteryBackup;
	}

	 void setBatteryBackup(double batteryBackup) {
		this.batteryBackup = batteryBackup;
	}

	 boolean isHasCDDrive() {
		return hasCDDrive;
	}

	 void setHasCDDrive(boolean hasCDDrive) {
		this.hasCDDrive = hasCDDrive;
	}

	void display() {
        super.display();
        System.out.println("Has Keyboard: " + hasKeyboard);
        System.out.println("Battery Backup: " + batteryBackup + " hours");
        System.out.println("CD Drive Available: " + hasCDDrive);
    }
}//laptop class ends here

//  Subclass 2: Mobile
class Mobile extends Device {
    int cameraMP;
    boolean dualSim;
    String networkType;
    boolean hasFingerprintSensor;

    Mobile() {
        super();
        System.out.println("Mobile default constructor");
        cameraMP = 12;
        dualSim = true;
        networkType = "5G";
        hasFingerprintSensor = true;
    }

    Mobile(String brand, String model, double price, int storage, int ram,
           String processor, double screenSize, int batteryCapacity,
           int cameraMP, boolean dualSim, String networkType, boolean hasFingerprintSensor) 
    {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("Mobile parameterized constructor");
        this.cameraMP = cameraMP;
        this.dualSim = dualSim;
        this.networkType = networkType;
        this.hasFingerprintSensor = hasFingerprintSensor;
    }

     int getCameraMP() {
		return cameraMP;
	}

	 void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}

	 boolean isDualSim() {
		return dualSim;
	}

	 void setDualSim(boolean dualSim) {
		this.dualSim = dualSim;
	}

	 String getNetworkType() {
		return networkType;
	}

	 void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	 boolean isHasFingerprintSensor() {
		return hasFingerprintSensor;
	}

	 void setHasFingerprintSensor(boolean hasFingerprintSensor) {
		this.hasFingerprintSensor = hasFingerprintSensor;
	}

	void display() {
        super.display();
        System.out.println("Camera: " + cameraMP + " MP");
        System.out.println("Dual SIM: " + dualSim);
        System.out.println("Network Type: " + networkType);
        System.out.println("Fingerprint Sensor: " + hasFingerprintSensor);
    }
}//mobile class ends here

//  Subclass 3: Tablet
class Tablet extends Device {
    boolean stylusSupport;
    boolean detachableKeyboard;
    boolean simSupport;

    Tablet() {
        super();
        System.out.println("Tablet default constructor");
        stylusSupport = true;
        detachableKeyboard = false;
        simSupport = true;
    }

    Tablet(String brand, String model, double price, int storage, int ram,
           String processor, double screenSize, int batteryCapacity,
           boolean stylusSupport, boolean detachableKeyboard, boolean simSupport) 
    {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("Tablet parameterized constructor");
        this.stylusSupport = stylusSupport;
        this.detachableKeyboard = detachableKeyboard;
        this.simSupport = simSupport;
    }

     boolean isStylusSupport() {
		return stylusSupport;
	}

	 void setStylusSupport(boolean stylusSupport) {
		this.stylusSupport = stylusSupport;
	}

	 boolean isDetachableKeyboard() {
		return detachableKeyboard;
	}

	 void setDetachableKeyboard(boolean detachableKeyboard) {
		this.detachableKeyboard = detachableKeyboard;
	}

	 boolean isSimSupport() {
		return simSupport;
	}

	 void setSimSupport(boolean simSupport) {
		this.simSupport = simSupport;
	}

	void display() {
        super.display();
        System.out.println("Stylus Support: " + stylusSupport);
        System.out.println("Detachable Keyboard: " + detachableKeyboard);
        System.out.println("SIM Support: " + simSupport);
    }
}//tablet class ends here

//  Demo Class
class DemoDevice {
    public static void main(String[] args) {
        System.out.println("\n--- Using Parameterized Constructors ---");
        Laptop l = new Laptop("Dell", "Inspiron 15", 70000, 512, 16, "Intel i7", 15.6, 6000, true, 10, false);
        Mobile m = new Mobile("Samsung", "Galaxy S24", 90000, 256, 12, "Snapdragon 8 Gen 3", 6.7, 5000, 200, true, "5G", true);
        Tablet t = new Tablet("Apple", "iPad Pro", 120000, 512, 8, "M2 Chip", 12.9, 10000, true, true, true);

        System.out.println("\n--- LAPTOP ---");
        l.display();

        System.out.println("\n--- MOBILE ---");
        m.display();

        System.out.println("\n--- LAPTOP ---");
        l.display();

        System.out.println("\n--- MOBILE ---");
        m.display();

        System.out.println("\n--- TABLET ---");
        t.display();

        System.out.println("\n--- Using Default Constructors ---");
        Laptop l2 = new Laptop();
        Mobile m2 = new Mobile();
        Tablet t2 = new Tablet();

        System.out.println("\n--- LAPTOP (Default) ---");
        l2.display();

        System.out.println("\n--- MOBILE (Default) ---");
        m2.display();

        System.out.println("\n--- TABLET (Default) ---");
        t2.display();
    }//main ends here
}








