package AbstractANDToString;

import java.util.Scanner;

abstract class ElectricityBill {
    String customerName;
    int units;

    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    void showUsage() {
        System.out.println("Customer: " + customerName + ", Units consumed: " + units);
    }

    abstract double calculateBill();

    final void generateBill() {
        double bill = calculateBill();
        bill += bill * 0.05; // 5% tax
        bill += 50;           // Fixed charge
        System.out.println("Final Bill for " + customerName + ": Rs." + bill);
    }
}

class ResidentialBill extends ElectricityBill {
    ResidentialBill(String customerName, int units) {
        super(customerName, units);
    }

    double calculateBill() {
        double bill = 0;
        if(units <= 100) {
            bill = units * 2.5;
        } else if(units <= 300) {
            bill = 100*2.5 + (units-100)*3.5;
        } else {
            bill = 100*2.5 + 200*3.5 + (units-300)*5;
        }

        if(units > 500) bill += 150; // extra surcharge
        return bill;
    }
}

class CommercialBill extends ElectricityBill {
    CommercialBill(String customerName, int units) {
        super(customerName, units);
    }

    double calculateBill() {
        double bill = units * 6.5;
        if(units < 200) bill = Math.max(bill, 1500);
        if(units > 1000) bill += (units*6.5)*0.08; // 8% surcharge
        return bill;
    }
}

// Main
 class DemoElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Type (1-Residential, 2-Commercial): ");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        ElectricityBill bill;
        if(type == 1) {
            bill = new ResidentialBill(name, units);
        } else {
            bill = new CommercialBill(name, units);
        }

        bill.showUsage();
        bill.generateBill();
        sc.close();
    }
}
