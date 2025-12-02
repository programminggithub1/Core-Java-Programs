package Polymorphism;

public class Farmer {
	int id;
	String name;
	String city;
	double annualincome;
	int NoOfRequirement;
	double landArea;

	Farmer()// default constructors
	{
		System.out.println("Farmer default constructor");
		this.id = 123;
		this.name = "Jotiram";
		this.city = "karad";
		this.annualincome = 456745;
		this.NoOfRequirement = 45;
		this.landArea = 45;
	}

	Farmer(int id, String name, String city, double annualincome, int NoOfRequirement, double landArea)// parameter
																										// constructors
	{
		System.out.println("Farmer parameter constructor");
		this.id = id;
		this.name = name;
		this.city = city;
		this.annualincome = annualincome;
		this.NoOfRequirement = NoOfRequirement;
		this.landArea = landArea;
	}

	void calsubsidy() {
		System.out.println("subsidy recived");
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getCity() {
		return city;
	}

	void setCity(String city) {
		this.city = city;
	}

	double getAnnualincome() {
		return annualincome;
	}

	void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	int getNoOfRequirement() {
		return NoOfRequirement;
	}

	void setNoOfRequirement(int noOfRequirement) {
		NoOfRequirement = noOfRequirement;
	}

	double getLandArea() {
		return landArea;
	}

	void setLandArea(double landArea) {
		this.landArea = landArea;
	}

	void display() {
		System.out.println("id is" + this.id);
		System.out.println("name is" + this.name);
		System.out.println("city is" + this.city);
		System.out.println("city is" + this.annualincome);
		System.out.println("NoOfRequirement is" + this.NoOfRequirement);
		System.out.println("landArea is " + this.landArea);
	}
}

class DairyFarmer extends Farmer {
	int nooocattles;
	double milkproduceperday;
	int dairyliceneno;

	DairyFarmer()// default constructors
	{
		super();
		System.out.println("Farmer default constructor");
		this.nooocattles = 523;
		this.milkproduceperday = 678;
		this.dairyliceneno = 45;
	}

	DairyFarmer(int id, String name, String city, double annualincome, int NoOfRequirement, double landArea,
			int nooocattles, double milkproduceperday, int dairyliceneno)// parameter constructors
	{
		super(id, name, city, annualincome, NoOfRequirement, landArea);
		System.out.println("Farmer parameter constructor");
		this.nooocattles = nooocattles;
		this.milkproduceperday = milkproduceperday;
		this.dairyliceneno = dairyliceneno;
	}

	void calsubsidy() {
		System.out.println("calculate based on number of cattles ");
	}

	int getNooocattles() {
		return nooocattles;
	}

	void setNooocattles(int nooocattles) {
		this.nooocattles = nooocattles;
	}

	double getMilkproduceperday() {
		return milkproduceperday;
	}

	void setMilkproduceperday(double milkproduceperday) {
		this.milkproduceperday = milkproduceperday;
	}

	int getDairyliceneno() {
		return dairyliceneno;
	}

	void setDairyliceneno(int dairyliceneno) {
		this.dairyliceneno = dairyliceneno;
	}

	void display() {
		super.display();
		System.out.println("nooocattles is" + this.nooocattles);
		System.out.println("milkproduceperday is" + this.milkproduceperday);
		System.out.println("dairyliceneno is" + this.dairyliceneno);
	}
}

class Poultryfarmer extends Farmer {
	int polrynumber;
	int noofchikens;
	int noofshades;
	double egsproductionperday;

	Poultryfarmer()// default constructors
	{
		super();
		System.out.println("Poultryfarmer default constructor");
		this.polrynumber = 523;
		this.noofchikens = 678;
		this.noofshades = 45;
		this.egsproductionperday = 45;
	}

	Poultryfarmer(int id, String name, String city, double annualincome, int NoOfRequirement, double landArea,
			int polrynumber, int noofchikens, int noofshades, double egsproductionperday)// parameter constructors
	{
		super(id, name, city, annualincome, NoOfRequirement, landArea);
		System.out.println("Poultryfarmer parameter constructor");
		this.polrynumber = polrynumber;
		this.noofchikens = noofchikens;
		this.noofshades = noofshades;
		this.egsproductionperday = egsproductionperday;
	}

	void calsubsidy() {
		System.out.println("calculate based on number of chickens ");
	}

	int getPolrynumber() {
		return polrynumber;
	}

	void setPolrynumber(int polrynumber) {
		this.polrynumber = polrynumber;
	}

	int getNoofchikens() {
		return noofchikens;
	}

	void setNoofchikens(int noofchikens) {
		this.noofchikens = noofchikens;
	}

	int getNoofshades() {
		return noofshades;
	}

	void setNoofshades(int noofshades) {
		this.noofshades = noofshades;
	}

	double getEgsproductionperday() {
		return egsproductionperday;
	}

	void setEgsproductionperday(double egsproductionperday) {
		this.egsproductionperday = egsproductionperday;
	}

	void display() {
		super.display();
		System.out.println("polrynumber is" + this.polrynumber);
		System.out.println("noofchikens is" + this.noofchikens);
		System.out.println("noofshades is" + this.noofshades);
		System.out.println("egsproductionperday is" + this.egsproductionperday);
	}
}// poultryfarmer class ends here

class OrganicFarmer extends Farmer {
	int organicid;
	String croptype;
	String fertilizeused;

	OrganicFarmer()// default constructors
	{
		super();
		System.out.println("Poultryfarmer default constructor");
		this.organicid = 523;
		this.croptype = "default";
		this.fertilizeused = "default";
	}

	OrganicFarmer(int id, String name, String city, double annualincome, int NoOfRequirement, double landArea,
			int organicid, String croptype, String fertilizeused)// parameterized constructor
	{
		super(id, name, city, annualincome, NoOfRequirement, landArea);
		System.out.println("Poultryfarmer parameter constructor");
		this.organicid = organicid;
		this.croptype = croptype;
		this.fertilizeused = fertilizeused;
	}

	void calsubsidy() {
		System.out.println("calculate based on number of grains ");
	}

	int getOrganicid() {
		return organicid;
	}

	void setOrganicid(int organicid) {
		this.organicid = organicid;
	}

	String getCroptype() {
		return croptype;
	}

	void setCroptype(String croptype) {
		this.croptype = croptype;
	}

	String getFertilizeused() {
		return fertilizeused;
	}

	void setFertilizeused(String fertilizeused) {
		this.fertilizeused = fertilizeused;
	}

	void display() {
		super.display();
		System.out.println("organicid is" + this.organicid);
		System.out.println("croptype is" + this.croptype);
		System.out.println("fertilizeused is" + this.fertilizeused);
	}
}

class DemoFarmer {
	public static void main(String[] args) {

		Farmer f1;// generic reference
		System.out.println("--- Farmer (Parameterized) ---");
		f1 = new Farmer(101, "Jotiram", "Karad", 450000, 20, 10.5);
		f1.calsubsidy();
		f1.display();

		System.out.println("\n--- Poultry Farmer (Parameterized) ---");
		f1 = new Poultryfarmer(201, "Ramesh", "Satara", 500000, 10, 5.5, 101, 250, 3, 450.75);// upcasting
		f1.calsubsidy();
		f1.display();

		System.out.println("\n--- Organic Farmer (Parameterized) ---");
		f1 = new OrganicFarmer(301, "Ganesh", "Kolhapur", 600000, 8, 6.8, 501, "Sugarcane", "Organic Compost");// upcasting
		f1.calsubsidy();
		f1.display();

		System.out.println("\n--- Dairy Farmer (Parameterized) ---");
		f1 = new DairyFarmer(401, "Suresh", "Pune", 700000, 12, 8.2, 50, 120.5, 9001);// upcasting
		f1.calsubsidy();
		f1.display();

	}

}
