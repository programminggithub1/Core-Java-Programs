package inheritance;

 class Employee {

	int id;
	String name;
  	double salary;
  	
  	Employee()//default constructor
	{
	System.out.println("Constructor called");
	this.id=45;
	this.name="xyz";
	this.salary=4567;
	}
  	Employee(int id,String name,double salary)//parameterized   constructor
	{
	System.out.println("parameterized  Constructor called");
	this.id=id;
	this.name=name;
	this.salary=salary;
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
	 double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
	System.out.println("ID is::"+this.id);
	System.out.println("Name is::"+this.name);
	System.out.println("Salary is::"+this.salary);
	}
}//employee class ends here
class Admin extends Employee
{
	double allowance;
	
	Admin()//default constructor
	{
	super();
	System.out.println("Constructor called");
	allowance=2300;
	}
	
	Admin(int id,String name,double salary,double allowance)//parameterized   constructor
	{
	super(id, name, salary);
	System.out.println("  parameterized  Constructor called");
	this.allowance=allowance;
	}
	
 double getAllowance() {
		return allowance;
	}
	 void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display()
	{
	super.display();
	System.out.println("allowance is::"+this.allowance);
	}
}
class HR extends Employee
{
 	double commission;
 	
	HR()//default constructor
	{
		super();
	System.out.println("Constructor called");
 	this.commission=4000;
	}
	
	HR(int id,String name,double salary,double commission)//parameterized  constructor
	{
		super(id, name, salary);
		System.out.println(" parameterized Constructor called");
 	this.commission=commission;
	}
	
 double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	void display()
	{
	super.display();
	System.out.println("commission is::"+this.commission);
	}
}//HR class ends here
class SalesManager extends Employee
{
 	double incentive;
	double target;
	SalesManager()//default constructor
	{
	super();
	System.out.println("Constructor called");
	this.incentive=40099;
	this.target=3400;
	
	}
	
	SalesManager(int id,String name,double salary,double incentive,double target)//default constructor
	{
	super(id, name, salary);
	System.out.println(" parameterized Constructor called");
	this.incentive=incentive;
	this.target=target;
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

	void display()
	{
	super.display();
	System.out.println("incentive is::"+this.incentive);
	System.out.println("target is::"+this.target);
	}
}//sales manager class ends here
class AreaSalesManager extends SalesManager
{
	String area;
	AreaSalesManager()//default constructor
	{
	super();
	System.out.println("AreaSalesManager default Constructor called");
	this.area="pune";
	
	}
	
	AreaSalesManager(int id,String name,double salary,double incentive,double target,String area)//default constructor
	{
	super(id, name, salary,incentive,target);
	System.out.println("AreaSalesManager parameterized Constructor called");
	this.area=area;
	}
	
	 String getArea() {
		return area;
	}

	 void setArea(String area) {
		this.area = area;
	}

	void display()
	{
	super.display();
	System.out.println("arear is::"+this.area);
	}
}
class DemoEmployee
{
	public static void main(String[] args) {
		Admin a1 = new Admin();
		a1.display();
		Admin a2= new Admin(1,"Sanket",20000,5400);
		a2.display();
		System.out.println("\n");
		
		HR hr1 = new HR();
		hr1.display();
		HR hr2= new HR(1,"runali",98766,2200);
		hr2.display();
		System.out.println("\n");
		
		SalesManager s1 = new SalesManager();
		s1.display();
		SalesManager s2= new SalesManager(2,"shrinath",34567,4500,6032);
		s2.display();
		
		AreaSalesManager asm1 = new AreaSalesManager();
		asm1.display();
		AreaSalesManager asm2= new AreaSalesManager(22,"pruthvi",5600,2300,3020,"pune");
		asm2.display();
	}
}

