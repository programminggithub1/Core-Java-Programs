package inheritance;

public class Defence {
	String NameOfHead;
	int NoOfMissionsPerformed;
	double budget;
	int NoOfDept;
	int NoOfCasualties;
	String LocationOfHeadQuarters;
	int NoOfTroops;
	int NoOfVehicles;
	int MapOwnerCount;
	Defence()//default constructors
	{
		System.out.println("Defence default constructor");
		NameOfHead="Rohit";
		NoOfMissionsPerformed=67;
		budget=45678;
		NoOfDept=30;
		NoOfCasualties=43;
		LocationOfHeadQuarters="Asam";
		NoOfTroops=78;
		NoOfVehicles=200;
		MapOwnerCount=45;
	}
	Defence(String NameOfHead,int NoOfMissionsPerformed,double budget,int NoOfDept,int NoOfCasualties,String LocationOfHeadQuarters,int NoOfTroops,	int NoOfVehicles,int MapOwnerCount)//parameterized constructors
	{
		System.out.println(" Defence parameterized  constructor");
		this.NameOfHead=NameOfHead;
		this.NoOfMissionsPerformed=NoOfMissionsPerformed;
		this.budget=budget;
		this.NoOfDept=NoOfDept;
		this.NoOfCasualties=NoOfCasualties;
		this.LocationOfHeadQuarters=LocationOfHeadQuarters;
		this.NoOfTroops=NoOfTroops;
		this.NoOfVehicles=NoOfVehicles;
		this.MapOwnerCount=MapOwnerCount;
	}
	
 String getNameOfHead() {
		return NameOfHead;
	}
	 void setNameOfHead(String nameOfHead) {
		NameOfHead = nameOfHead;
	}
	 int getNoOfMissionsPerformed() {
		return NoOfMissionsPerformed;
	}
	 void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
		NoOfMissionsPerformed = noOfMissionsPerformed;
	}
	 double getBudget() {
		return budget;
	}
	 void setBudget(double budget) {
		this.budget = budget;
	}
	 int getNoOfDept() {
		return NoOfDept;
	}
	 void setNoOfDept(int noOfDept) {
		NoOfDept = noOfDept;
	}
	 int getNoOfCasualties() {
		return NoOfCasualties;
	}
	 void setNoOfCasualties(int noOfCasualties) {
		NoOfCasualties = noOfCasualties;
	}
	 String getLocationOfHeadQuarters() {
		return LocationOfHeadQuarters;
	}
	 void setLocationOfHeadQuarters(String locationOfHeadQuarters) {
		LocationOfHeadQuarters = locationOfHeadQuarters;
	}
	 int getNoOfTroops() {
		return NoOfTroops;
	}
	 void setNoOfTroops(int noOfTroops) {
		NoOfTroops = noOfTroops;
	}
	 int getNoOfVehicles() {
		return NoOfVehicles;
	}
	 void setNoOfVehicles(int noOfVehicles) {
		NoOfVehicles = noOfVehicles;
	}
	 int getMapOwnerCount() {
		return MapOwnerCount;
	}
	 void setMapOwnerCount(int mapOwnerCount) {
		MapOwnerCount = mapOwnerCount;
	}
	void display()
	{
	System.out.println("ID is::"+this.NameOfHead);
	System.out.println("Name is::"+this.NoOfMissionsPerformed);
	System.out.println("Salary is::"+this.budget);
	System.out.println("ID is::"+this.NoOfDept);
	System.out.println("Name is::"+this.NoOfCasualties);
	System.out.println("Salary is::"+this.LocationOfHeadQuarters);
	System.out.println("Salary is::"+this.NoOfTroops);
	System.out.println("ID is::"+this.NoOfVehicles);
	System.out.println("Name is::"+this.MapOwnerCount);
	
	}

} //Defence class ends here
class Army extends Defence
{
int NoOfTanks;
int NoOfGuns;
int NoOfGranats;
int NoOfButalian;

Army()//default constructors
{ 
	super();
	System.out.println("Army default constructor");
	this.NoOfTanks=56;
	this.NoOfGuns=56;
	this.NoOfGranats=89;
	this.NoOfButalian=43;
}
Army(String NameOfHead,int NoOfMissionsPerformed,double budget,
	int NoOfDept,int NoOfCasualties,String LocationOfHeadQuarters,int NoOfTroops,	
	int NoOfVehicles,int MapOwnerCount,int NoOfTanks,int NoOfGuns,int NoOfGranats,int NoOfButalian)//parameterized constructors
{ 
	super( NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters, NoOfTroops, NoOfVehicles, MapOwnerCount);
	this.NoOfTanks=NoOfTanks;
	this.NoOfGuns=NoOfGuns;
	this.NoOfGranats=NoOfGranats;
	this.NoOfButalian=NoOfButalian;
}

 int getNoOfTanks() {
	return NoOfTanks;
}
 void setNoOfTanks(int noOfTanks) {
	NoOfTanks = noOfTanks;
}
 int getNoOfGuns() {
	return NoOfGuns;
}
 void setNoOfGuns(int noOfGuns) {
	NoOfGuns = noOfGuns;
}
 int getNoOfGranats() {
	return NoOfGranats;
}
 void setNoOfGranats(int noOfGranats) {
	NoOfGranats = noOfGranats;
}
 int getNoOfButalian() {
	return NoOfButalian;
}
 void setNoOfButalian(int noOfButalian) {
	NoOfButalian = noOfButalian;
}
void display()
{
	super.display();
System.out.println("ID is::"+this.NoOfTanks);
System.out.println("Name is::"+this.NoOfGuns);
System.out.println("Salary is::"+this.NoOfGranats);
System.out.println("ID is::"+this.NoOfButalian);

}

}//army class ends here
class Navy extends Defence
{
int NoOfShips;
int NoOfSubmariens;
int NoOftorpedos;

Navy()//default constructors
{ 
	super();
	System.out.println("navy default constructor");
	this.NoOfShips=56;
	this.NoOfSubmariens=56;
	this.NoOftorpedos=89;
	
}
Navy(String NameOfHead,int NoOfMissionsPerformed,double budget,
	int NoOfDept,int NoOfCasualties,String LocationOfHeadQuarters,int NoOfTroops,	
	int NoOfVehicles,int MapOwnerCount,int NoOfShips,int NoOfSubmariens,int NoOftorpedos)//parameterized constructors
{ 
	super( NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters, NoOfTroops, NoOfVehicles, MapOwnerCount);
	System.out.println("navy parameterized constructor");
	this.NoOfShips=NoOfShips;
	this.NoOfSubmariens=NoOfSubmariens;
	this.NoOftorpedos=NoOftorpedos;
}

 int getNoOfShips() {
	return NoOfShips;
}
 void setNoOfShips(int noOfShips) {
	NoOfShips = noOfShips;
}
 int getNoOfSubmariens() {
	return NoOfSubmariens;
}
 void setNoOfSubmariens(int noOfSubmariens) {
	NoOfSubmariens = noOfSubmariens;
}
 int getNoOftorpedos() {
	return NoOftorpedos;
}
 void setNoOftorpedos(int noOftorpedos) {
	NoOftorpedos = noOftorpedos;
}
void display()
{
	super.display();
System.out.println("ID is::"+this.NoOfShips);
System.out.println("Name is::"+this.NoOfSubmariens);
System.out.println("Salary is::"+this.NoOftorpedos);

}
}//navy class ends here
class AirForce extends Defence
{
int NoOfmisile;
int NoOfaircrafts;
int NoOfsqadron;

AirForce()//default constructors
{ 
	super();
	System.out.println("airforce default constructor");
	this.NoOfmisile=56;
	this.NoOfaircrafts=56;
	this.NoOfsqadron=89;
	
}
AirForce(String NameOfHead,int NoOfMissionsPerformed,double budget,
	int NoOfDept,int NoOfCasualties,String LocationOfHeadQuarters,int NoOfTroops,	
	int NoOfVehicles,int MapOwnerCount,int NoOfmisile,int NoOfaircrafts,int NoOfsqadron)//parameterized constructors
{ 
	super( NameOfHead, NoOfMissionsPerformed, budget, NoOfDept, NoOfCasualties, LocationOfHeadQuarters, NoOfTroops, NoOfVehicles, MapOwnerCount);
	System.out.println("airforce parameterized constructor");
	this.NoOfmisile=NoOfmisile;
	this.NoOfaircrafts=NoOfaircrafts;
	this.NoOfsqadron=NoOfsqadron;
}

 int getNoOfmisile() {
	return NoOfmisile;
}
 void setNoOfmisile(int noOfmisile) {
	NoOfmisile = noOfmisile;
}
 int getNoOfaircrafts() {
	return NoOfaircrafts;
}
 void setNoOfaircrafts(int noOfaircrafts) {
	NoOfaircrafts = noOfaircrafts;
}
 int getNoOfsqadron() {
	return NoOfsqadron;
}
 void setNoOfsqadron(int noOfsqadron) {
	NoOfsqadron = noOfsqadron;
}
void display()
{
	super.display();
System.out.println("ID is::"+this.NoOfmisile);
System.out.println("Name is::"+this.NoOfaircrafts);
System.out.println("Salary is::"+this.NoOfsqadron);
}
}//airforce class ends here
class DemoDefence
{
	public static void main(String[] args) {
		

        System.out.println("\n--- Army (Parameterized) ---");
        Army a1 = new Army("General Singh", 120, 9500000, 10, 5, "Delhi", 500, 200, 25,
                           100, 300, 500, 8);
        a1.display();

        System.out.println("\n--- Navy (Parameterized) ---");
        Navy n1 = new Navy("Admiral Rajesh", 80, 8000000, 8, 3, "Mumbai", 300, 150, 20,
                           20, 10, 50);
        n1.display();

        System.out.println("\n--- AirForce (Parameterized) ---");
        AirForce af1 = new AirForce("Air Marshal Verma", 150, 12000000, 12, 2, "Pune", 400, 180, 30,
                                    60, 25, 5);
        af1.display();
	}

}
