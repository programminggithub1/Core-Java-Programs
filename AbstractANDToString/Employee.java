package AbstractANDToString;

abstract class Employee {

	int id;
	String name;
	double salary;

	Employee()// default constructor
	{
		System.out.println("Constructor called");
		this.id = 45;
		this.name = "xyz";
		this.salary = 4567;
	}

	Employee(int id, String name, double salary)// parameterized constructor
	{
		System.out.println("parameterized  Constructor called");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	abstract double calSalary();//abstract functon

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

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "\n id is::" + this.id + "name is::" + this.name + "Salary " + this.salary;
	}
//	void display()
//	{
//	System.out.println("ID is::"+this.id);
//	System.out.println("Name is::"+this.name);
//	System.out.println("Salary is::"+this.salary);
//	}
}// employee class ends here

class Admin extends Employee {
	double allowance;

	Admin()// default constructor
	{
		super();
		System.out.println("Constructor called");
		allowance = 2300;
	}

	Admin(int id, String name, double salary, double allowance)// parameterized constructor
	{
		super(id, name, salary);
		System.out.println("  parameterized  Constructor called");
		this.allowance = allowance;
	}

	double calSalary() {
		return this.salary + this.allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public String toString() {

		return super.toString() + "allowance is::" + this.allowance;
	}
//	void display()
//	{
//	super.display();
//	System.out.println("allowance is::"+this.allowance);
//	}
}

class HR extends Employee {
	double commission;

	HR()// default constructor
	{
		super();
		System.out.println("Constructor called");
		this.commission = 4000;
	}

	HR(int id, String name, double salary, double commission)// parameterized constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
		this.commission = commission;
	}

	double calSalary() {
		return this.salary + this.commission;
	}

	double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String toString() {
		super.toString();
		return super.toString() + "commission is::" + this.commission;
	}
//	void display()
//	{
//	super.display();
//	System.out.println("commission is::"+this.commission);
//	}
}// HR class ends here

class SalesManager extends Employee {
	double incentive;
	double target;

	SalesManager()// default constructor
	{
		super();
		System.out.println("Constructor called");
		this.incentive = 40099;
		this.target = 3400;

	}

	SalesManager(int id, String name, double salary, double incentive, double target)// default constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
		this.incentive = incentive;
		this.target = target;
	}

	double calSalary() {
		return this.salary + this.incentive;

	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	public String toString() {
		return super.toString() + "incentive is::" + this.incentive + "target is" + this.target;

	}

//	void display()
//	{
//	super.display();
//	System.out.println("incentive is::"+this.incentive);
//	System.out.println("target is::"+this.target);
//	}
}// sales manager class ends here

class AreaSalesManager extends SalesManager {
	String area;

	AreaSalesManager()// default constructor
	{
		super();
		System.out.println("AreaSalesManager default Constructor called");
		this.area = "pune";

	}

	AreaSalesManager(int id, String name, double salary, double incentive, double target, String area)// default
																										// constructor
	{
		super(id, name, salary, incentive, target);
		System.out.println("AreaSalesManager parameterized Constructor called");
		this.area = area;
	}

	String getArea() {
		return area;
	}

	void setArea(String area) {
		this.area = area;
	}

	public String toString() {

		return super.toString() + "area is::" + this.area;
	}
//	void display()
//	{
//	super.display();
//	System.out.println("arear is::"+this.area);
//	}
}

class DemoEmployee {
	public static void main(String[] args) {
		//Employee e1;// generic reference

//		e1 = new Admin(1, "Sanket", 20000, 5400);// upcasting
//		System.out.println(e1);
//		System.out.println(e1.toString());
//		System.out.println("\n");
////		 System.out.println("calculate salary"+e1.calSalary());
////		System.out.println("\n");
////		
//		e1 = new HR(1, "runali", 98766, 2200);// upcasting
//		System.out.println(e1);
//		System.out.println(e1.toString());
//		System.out.println("\n");
//
////		 System.out.println("calculate salary"+e1.calSalary());
////		e1.display();
////		System.out.println("\n");
////		
//		e1 = new SalesManager(2, "shrinath", 34567, 4500, 6032);// upcasting
//		System.out.println(e1);
//		System.out.println(e1.toString());
////		 System.out.println("calculate salary"+e1.calSalary());
////		e1.display();
////		
////		System.out.println("\n");
////		e1= new AreaSalesManager(22,"pruthvi",5600,2300,3020,"pune");//upcasting
////		 System.out.println("calculate salary"+e1.calSalary());
////		e1.display();

		DemoEmployee.giveBonus(new Admin(1, "Sanket", 20000, 5400));// downcasting

//		System.out.println(e1);
	}// main class ends here
	static void giveBonus(Employee e1)
	{
		if(e1 instanceof Admin)
		{
		Admin a1 = (Admin) e1;
		a1.setAllowance(2300);
		}
	}
}
