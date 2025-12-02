package Polymorphism;
class Date
{
	int day,month,year;
	String dow;

	Date()//default constructor
	{
	System.out.println("Constructor called");
	this.day=26;
	this.month=11;
	this.year=2003;
	this.dow="friday";
	}

	Date(int d,int m,int y,String str)//default constructor
	{
	System.out.println("Parameterized Constructor called");
	this.day=d;
	this.month=m;
	this.year=y;
	this.dow=str;
	}
	void setDay(int d)
	{
		this.day=d;
	}
	void setMonth(int m)
	{
		this.month=m;
	}
	void setYear(int y)
	{
		this.year=y;
	}
	void setDOW(String str)
	{
		this.dow=str;
	}
	int getDay()
	{
	return this.day;
	}

	int getMonth()
	{
	return this.month;
	}

	int getYear()
	{
	return this.year;
	}
	public String toString()
	{
		return "Date is::"+this.day+"/"+this.month+"/"+this.year;
	}
	void display()
	{
	System.out.println("Date is::"+this.day);
	System.out.println("month is::"+this.month);
	System.out.println("year is::"+this.year);
	System.out.println("Day is::"+this.dow);
	}

	//String getDOW()
	//{
	//return this.dow;
	//}
}//Date class ends here
class TestDate
{
	public static void main(String [] args)
	{
		int i;
		Date arr[] = new Date[3];
		arr[0]=new Date();
		arr[1]=new Date(7,11,2025,"friday");
		arr[2]=new Date();
		  for (i = 0; i < arr.length; i++)
       		 {
         		   arr[i].display();
        		}


		Date d1,d2,d3,d4; //reference
		d1= new Date(); //object
		d2= new Date();//object
		d3= new Date();//object
		d4= new Date(26,11,2025,"monday");//object
		d4.display();
		d1.setDay(31);
		d1.setMonth(10);
		d1.setYear(2025);
		d1.setDOW("Friday");
		d2.setDay(03);
		d2.setMonth(11);
		d2.setYear(2025);
		d2.setDOW("Monday");
		if(d1.getDay() > d2.getDay())
		{
		System.out.println("d1 is younger");
		}
		else
		{
		System.out.println("d2 is younger");
		}
		
		if(d1.getMonth() > d2.getMonth())
		{
		System.out.println("d1 is younger");
		}
		else
		{
		System.out.println("d2 is younger");
		}

		if(d1.getYear() > d2.getYear())
		{
		System.out.println("d1 is younger");
		}
		else
		{
		System.out.println("d2 is younger");
		}

		//if(d1.getDOW() > d2.getDOW())
		//{
		//System.out.println("d1 is younger");
		//}
		//else
		//{
		//System.out.println("d2 is younger");
		//}
		d1.display();
		d2.display();
		
		System.out.println("Date is::"+d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("Day is::"+d1.dow);
		System.out.println("Date is::"+d2.day+"/"+d2.month+"/"+d2.year);
		System.out.println("Day is::"+d2.dow);
		
		System.out.println(d1);
		System.out.println(d1.toString());
	} //Main ends here
} //TestDate class ends here