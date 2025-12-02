package AbstractANDToString;

import java.util.Scanner;

abstract class InsurancePremiumCalculator {
    String policyHolderName;
    double basePremium;

    InsurancePremiumCalculator(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    abstract double calculatePremium();

    void printPolicyDetails() {
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Base Premium: Rs." + basePremium);
        System.out.println("Final Premium: Rs." + calculatePremium());
    }
}

class CarInsurance extends InsurancePremiumCalculator {
    int carAgeInYears;
    boolean hadAccidentInLastYear;
    double carValue;

    CarInsurance(String name, double basePremium, int age, boolean accident, double value) {
        super(name, basePremium);
        this.carAgeInYears = age;
        this.hadAccidentInLastYear = accident;
        this.carValue = value;
    }

    
    double calculatePremium() {
        double premium = basePremium;
        if(carAgeInYears <= 3) premium += basePremium*0.10;
        else if(carAgeInYears <= 7) premium += basePremium*0.20;
        else premium += basePremium*0.30;

        if(hadAccidentInLastYear) premium += basePremium*0.25;
        else premium -= basePremium*0.10;

        if(carValue > 1000000) premium += 2000;

        return premium;
    }
}

class HealthInsurance extends InsurancePremiumCalculator {
    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;

    HealthInsurance(String name, double basePremium, int age, boolean smoker, boolean disease) {
        super(name, basePremium);
        this.age = age;
        this.isSmoker = smoker;
        this.hasPreExistingDisease = disease;
    }

  
    double calculatePremium() {
        double premium = basePremium;
        if(age < 30) premium += basePremium*0.10;
        else if(age <= 45) premium += basePremium*0.25;
        else premium += basePremium*0.40;

        if(isSmoker) premium += basePremium*0.30;
        else premium -= basePremium*0.05;

        if(hasPreExistingDisease) premium += basePremium*0.20;

        return premium;
    }
}

// Main
 class DemoInsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Insurance Type (1-Car, 2-Health): ");
        int type = sc.nextInt();
        sc.nextLine();

        if(type == 1) {
            System.out.print("Enter Policy Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Base Premium: ");
            double base = sc.nextDouble();
            System.out.print("Enter Car Age (years): ");
            int age = sc.nextInt();
            System.out.print("Had Accident Last Year? (true/false): ");
            boolean accident = sc.nextBoolean();
            System.out.print("Enter Car Value: ");
            double value = sc.nextDouble();

            InsurancePremiumCalculator policy = new CarInsurance(name, base, age, accident, value);
            policy.printPolicyDetails();
        } else {
            System.out.print("Enter Policy Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Base Premium: ");
            double base = sc.nextDouble();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Is Smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();
            System.out.print("Has Pre-existing Disease? (true/false): ");
            boolean disease = sc.nextBoolean();

            InsurancePremiumCalculator policy = new HealthInsurance(name, base, age, smoker, disease);
            policy.printPolicyDetails();
        }
        sc.close();
    }
}
