package Polymorphism;

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
    void operate() {
        System.out.println("Device is operating...");
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
    void operate() {
        System.out.println("Laptop is operating using keyboard and touchpad.");
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
class SmartTV extends Device {
    boolean wifiEnabled;
    boolean hasBluetooth;
    String panelType; // OLED, LED, QLED

    SmartTV()//default constructor
    {
        super();
        System.out.println("SmartTV default constructor");
        wifiEnabled = true;
        hasBluetooth = true;
        panelType = "LED";
    }

    SmartTV(String brand, String model, double price, int storage, int ram,
            String processor, double screenSize, int batteryCapacity,
            boolean wifiEnabled, boolean hasBluetooth, String panelType) // parameterized constructor
    {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("SmartTV parameterized constructor");
        this.wifiEnabled = wifiEnabled;
        this.hasBluetooth = hasBluetooth;
        this.panelType = panelType;
    }

    void operate() {
        System.out.println("SmartTV is streaming content and running apps.");
    }

     boolean isWifiEnabled() {
		return wifiEnabled;
	}

	 void setWifiEnabled(boolean wifiEnabled) {
		this.wifiEnabled = wifiEnabled;
	}

	 boolean isHasBluetooth() {
		return hasBluetooth;
	}

	 void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	 String getPanelType() {
		return panelType;
	}

	 void setPanelType(String panelType) {
		this.panelType = panelType;
	}

	void display() {
        super.display();
        System.out.println("WiFi Enabled: " + wifiEnabled);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Panel Type: " + panelType);
    }
}//smarttv  class ends here

//  Subclass 3: SmartWatch
class SmartWatch extends Device {
    boolean heartRateMonitor;
    boolean waterResistant;
    boolean gpsEnabled;

    SmartWatch()//default constructor
    {
        super();
        System.out.println("SmartWatch default constructor");
        heartRateMonitor = true;
        waterResistant = true;
        gpsEnabled = false;
    }

    SmartWatch(String brand, String model, double price, int storage, int ram,
               String processor, double screenSize, int batteryCapacity,
               boolean heartRateMonitor, boolean waterResistant, boolean gpsEnabled) // parameterized constructor
    {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("SmartWatch parameterized constructor");
        this.heartRateMonitor = heartRateMonitor;
        this.waterResistant = waterResistant;
        this.gpsEnabled = gpsEnabled;
    }

    void operate() {
        System.out.println("SmartWatch is tracking health and showing notifications.");
    }

     boolean isHeartRateMonitor() {
		return heartRateMonitor;
	}

	 void setHeartRateMonitor(boolean heartRateMonitor) {
		this.heartRateMonitor = heartRateMonitor;
	}

	 boolean isWaterResistant() {
		return waterResistant;
	}

	 void setWaterResistant(boolean waterResistant) {
		this.waterResistant = waterResistant;
	}

	 boolean isGpsEnabled() {
		return gpsEnabled;
	}

	 void setGpsEnabled(boolean gpsEnabled) {
		this.gpsEnabled = gpsEnabled;
	}

	void display() {
        super.display();
        System.out.println("Heart Rate Monitor: " + heartRateMonitor);
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("GPS Enabled: " + gpsEnabled);
    }

}//smart watch class ends here

//  Demo Class
class DemoDevice {
    public static void main(String[] args) {
        System.out.println("\n--- Using Parameterized Constructors ---");
        Device d1;//generic reference
        d1 = new Laptop("Dell", "Inspiron 15", 70000, 512, 16, "Intel i7",
        		15.6, 6000, true, 10, false);//upcasting
       d1.operate();
       d1.display();
       System.out.println("\n");
       
      d1 = new SmartTV("Samsung", "Galaxy S24", 90000, 256, 12,
    		  "Snapdragon 8 Gen 3", 6.7, 5000,  true, true,"LED");//upcasting
      d1.operate(); 
      d1.display();
        System.out.println("\n");
        
       d1= new SmartWatch("Apple", "iPad Pro", 120000, 512, 8, "M2 Chip", 
    		   12.9, 10000, true, true, true);//upcasting
       d1.operate();
       d1.display();
       
    }//main ends here
}








