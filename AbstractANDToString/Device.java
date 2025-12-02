package AbstractANDToString;

abstract class Device {
    String brand;
    String model;
    double price;
    int storage;
    int ram;
    String processor;
    double screenSize;
    int batteryCapacity;

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

    abstract void operate();

    // Getters and Setters
    String getBrand() { return brand; }
    void setBrand(String brand) { this.brand = brand; }

    String getModel() { return model; }
    void setModel(String model) { this.model = model; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    int getStorage() { return storage; }
    void setStorage(int storage) { this.storage = storage; }

    int getRam() { return ram; }
    void setRam(int ram) { this.ram = ram; }

    String getProcessor() { return processor; }
    void setProcessor(String processor) { this.processor = processor; }

    double getScreenSize() { return screenSize; }
    void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    int getBatteryCapacity() { return batteryCapacity; }
    void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    public String toString() {
        return "\nBrand::" + brand + " Model::" + model + " Price::" + price
                + " Storage::" + storage + " RAM::" + ram + " Processor::" + processor
                + " ScreenSize::" + screenSize + " Battery::" + batteryCapacity;
    }
}

// Subclass 1: Laptop
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
           boolean hasKeyboard, double batteryBackup, boolean hasCDDrive) {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("Laptop parameterized constructor");
        this.hasKeyboard = hasKeyboard;
        this.batteryBackup = batteryBackup;
        this.hasCDDrive = hasCDDrive;
    }

    void operate() {
        System.out.println("Laptop is operating using keyboard and touchpad.");
    }

    boolean isHasKeyboard() { return hasKeyboard; }
    void setHasKeyboard(boolean hasKeyboard) { this.hasKeyboard = hasKeyboard; }

    double getBatteryBackup() { return batteryBackup; }
    void setBatteryBackup(double batteryBackup) { this.batteryBackup = batteryBackup; }

    boolean isHasCDDrive() { return hasCDDrive; }
    void setHasCDDrive(boolean hasCDDrive) { this.hasCDDrive = hasCDDrive; }

    public String toString() {
        return super.toString() + " HasKeyboard::" + hasKeyboard + " BatteryBackup::" + batteryBackup
                + " HasCDDrive::" + hasCDDrive;
    }
}

// Subclass 2: SmartTV
class SmartTV extends Device {
    boolean wifiEnabled;
    boolean hasBluetooth;
    String panelType;

    SmartTV() {
        super();
        System.out.println("SmartTV default constructor");
        wifiEnabled = true;
        hasBluetooth = true;
        panelType = "LED";
    }

    SmartTV(String brand, String model, double price, int storage, int ram,
            String processor, double screenSize, int batteryCapacity,
            boolean wifiEnabled, boolean hasBluetooth, String panelType) {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("SmartTV parameterized constructor");
        this.wifiEnabled = wifiEnabled;
        this.hasBluetooth = hasBluetooth;
        this.panelType = panelType;
    }

    void operate() {
        System.out.println("SmartTV is streaming content and running apps.");
    }

    boolean isWifiEnabled() { return wifiEnabled; }
    void setWifiEnabled(boolean wifiEnabled) { this.wifiEnabled = wifiEnabled; }

    boolean isHasBluetooth() { return hasBluetooth; }
    void setHasBluetooth(boolean hasBluetooth) { this.hasBluetooth = hasBluetooth; }

    String getPanelType() { return panelType; }
    void setPanelType(String panelType) { this.panelType = panelType; }

    public String toString() {
        return super.toString() + " WifiEnabled::" + wifiEnabled + " Bluetooth::" + hasBluetooth
                + " PanelType::" + panelType;
    }
}

// Subclass 3: SmartWatch
class SmartWatch extends Device {
    boolean heartRateMonitor;
    boolean waterResistant;
    boolean gpsEnabled;

    SmartWatch() {
        super();
        System.out.println("SmartWatch default constructor");
        heartRateMonitor = true;
        waterResistant = true;
        gpsEnabled = false;
    }

    SmartWatch(String brand, String model, double price, int storage, int ram,
               String processor, double screenSize, int batteryCapacity,
               boolean heartRateMonitor, boolean waterResistant, boolean gpsEnabled) {
        super(brand, model, price, storage, ram, processor, screenSize, batteryCapacity);
        System.out.println("SmartWatch parameterized constructor");
        this.heartRateMonitor = heartRateMonitor;
        this.waterResistant = waterResistant;
        this.gpsEnabled = gpsEnabled;
    }

    void operate() {
        System.out.println("SmartWatch is tracking health and showing notifications.");
    }

    boolean isHeartRateMonitor() { return heartRateMonitor; }
    void setHeartRateMonitor(boolean heartRateMonitor) { this.heartRateMonitor = heartRateMonitor; }

    boolean isWaterResistant() { return waterResistant; }
    void setWaterResistant(boolean waterResistant) { this.waterResistant = waterResistant; }

    boolean isGpsEnabled() { return gpsEnabled; }
    void setGpsEnabled(boolean gpsEnabled) { this.gpsEnabled = gpsEnabled; }

    public String toString() {
        return super.toString() + " HeartRateMonitor::" + heartRateMonitor
                + " WaterResistant::" + waterResistant + " GPSEnabled::" + gpsEnabled;
    }
}

// Demo Class
class DemoDevice {
    public static void main(String[] args) {
        Device d1; // generic reference

        System.out.println("\n--- Laptop (Parameterized) ---");
        d1 = new Laptop("Dell", "Inspiron 15", 70000, 512, 16, "Intel i7",
                15.6, 6000, true, 10, false);
        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("\n--- SmartTV (Parameterized) ---");
        d1 = new SmartTV("Samsung", "Galaxy S24", 90000, 256, 12,
                "Snapdragon 8 Gen 3", 6.7, 5000, true, true, "LED");
        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("\n--- SmartWatch (Parameterized) ---");
        d1 = new SmartWatch("Apple", "iPad Pro", 120000, 512, 8, "M2 Chip",
                12.9, 10000, true, true, true);
        System.out.println(d1.toString());
        System.out.println(d1);
    }
}
