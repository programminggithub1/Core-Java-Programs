package inheritance;

public class Cource {

	String name;
	int duration;
	String startdate;
	String enddate;
	String Language;
	double fees;
	boolean CirfiticateAvailable;
	
	Cource()//default constructor
	{
		System.out.println("cource default  called");
		name="java";
		duration=4;
		startdate="23/4/25";
		enddate="23/12,25";
		Language="English";
		CirfiticateAvailable=true;
		fees=40000;
	}
	Cource(String name,int duration,String startdate,String enddate,String Language,boolean CirfiticateAvailable,int fees)//parameterized   constructor
	{
	System.out.println("cource parameterized  Constructor called");
	this.name=name;
	this.duration=duration;
	this.startdate=startdate;
	this.enddate=enddate;
	this.Language=Language;
	this.CirfiticateAvailable=CirfiticateAvailable;
	this.fees=fees;
	
	}
	
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getDuration() {
		return duration;
	}
	 void setDuration(int duration) {
		this.duration = duration;
	}
	 String getStartdate() {
		return startdate;
	}
	 void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	 String getEnddate() {
		return enddate;
	}
	 void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	 String getLanguage() {
		return Language;
	}
	 void setLanguage(String language) {
		Language = language;
	}
	 boolean isCirfiticateAvailable() {
		return CirfiticateAvailable;
	}
	 void setCirfiticateAvailable(boolean cirfiticateAvailable) {
		CirfiticateAvailable = cirfiticateAvailable;
	}
	
	 double getFees() {
		return fees;
	}
	 void setFees(double fees) {
		this.fees = fees;
	}
	void display()
	{
	System.out.println("name is::"+this.name);
	System.out.println("duration is::"+this.duration);
	System.out.println("startdate is::"+this.startdate);
	System.out.println("enddate is::"+this.enddate);
	System.out.println("Language is::"+this.Language);
	System.out.println("CirfiticateAvailable is::"+this.CirfiticateAvailable);
	System.out.println("fees is::"+this.fees);
	}
}//cource class ends here
	class OnlineCource extends Cource
	{
		String platformname;
		String lecturelink;
		boolean livesession;
		OnlineCource()//default constructor
		{
			super();
			System.out.println("cource default  called");
			platformname="java";
			lecturelink="link123445";
			livesession=true;
		}
		OnlineCource(String name,int duration,String startdate,String enddate,
				String Language,boolean CirfiticateAvailable,int fees,String platformname,String lecturelink,boolean livesession)//parameterized   constructor
		{
		super( name, duration, startdate, enddate, Language, CirfiticateAvailable,fees);
		System.out.println("cource parameterized  Constructor called");
		this.platformname=platformname;
		this.lecturelink=lecturelink;
		this.livesession=livesession;
		
		}
		 String getPlatformname() {
			return platformname;
		}
		 void setPlatformname(String platformname) {
			this.platformname = platformname;
		}
		 String getLecturelink() {
			return lecturelink;
		}
		 void setLecturelink(String lecturelink) {
			this.lecturelink = lecturelink;
		}
		 boolean isLivesession() {
			return livesession;
		}
		 void setLivesession(boolean livesession) {
			this.livesession = livesession;
		}
		
		void display()
		{
			super.display();
		System.out.println("platformname is::"+this.platformname);
		System.out.println("lecturelink is::"+this.lecturelink);
		System.out.println("livesession is::"+this.livesession);
		
		}
	}//online cource class ends here
	class offlineCource extends Cource
	{
		String roomno;
		String timing;
		int totalseats;
		int availableseats;
		boolean labaccess;
		offlineCource()//default constructor
		{
			super();
			System.out.println("cource default  called");
			roomno="fc17";
			timing="10 to 5";
			totalseats=80;
			availableseats=10;
			labaccess=true;
		}
		offlineCource(String name,int duration,String startdate,String enddate,
				String Language,boolean CirfiticateAvailable,int fees,
				String roomno,String timing,int totalseats,int availableseats,boolean labaccess)//parameterized   constructor
		{
		super( name, duration, startdate, enddate, Language, CirfiticateAvailable,fees);
		System.out.println("cource parameterized  Constructor called");
		this.roomno=roomno;
		this.timing=timing;
		this.totalseats=totalseats;
		this.availableseats=availableseats;
		this.labaccess=labaccess;
		}
		
		 String getRoomno() {
			return roomno;
		}
		 void setRoomno(String roomno) {
			this.roomno = roomno;
		}
		 String getTiming() {
			return timing;
		}
		 void setTiming(String timing) {
			this.timing = timing;
		}
		 int getTotalseats() {
			return totalseats;
		}
		 void setTotalseats(int totalseats) {
			this.totalseats = totalseats;
		}
		 int getAvailableseats() {
			return availableseats;
		}
		 void setAvailableseats(int availableseats) {
			this.availableseats = availableseats;
		}
		 boolean isLabaccess() {
			return labaccess;
		}
		 void setLabaccess(boolean labaccess) {
			this.labaccess = labaccess;
		}
		void display()
		{
			super.display();
		System.out.println("roomno is::"+this.roomno);
		System.out.println("timing is::"+this.timing);
		System.out.println("totalseats is::"+this.totalseats);
		System.out.println("availableseats is::"+this.availableseats);
		System.out.println("labaccess is::"+this.labaccess);
		
		}
	}//offlinecource class ends here
	class HybridCourse extends Cource {
	    String onlinePlatform;
	    String offlineCenter;
	    int onlineHoursPerWeek;
	    int offlineHoursPerWeek;
	    boolean flexibleMode;
	    
	    HybridCourse()//default constructor
		{
			super();
			System.out.println("cource default  called");
			onlinePlatform="zoom";
			offlineCenter="adityacentigra";
			onlineHoursPerWeek=80;
			offlineHoursPerWeek=50;
			flexibleMode=true;
		}
	    HybridCourse(String name,int duration,String startdate,String enddate,
				String Language,boolean CirfiticateAvailable,int fees,
				  String onlinePlatform,String offlineCenter,int onlineHoursPerWeek, int offlineHoursPerWeek,boolean flexibleMode)//parameterized   constructor
		{
		super( name, duration, startdate, enddate, Language, CirfiticateAvailable,fees);
		System.out.println("cource parameterized  Constructor called");
		this.onlinePlatform=onlinePlatform;
		this.offlineCenter=offlineCenter;
		this.onlineHoursPerWeek=onlineHoursPerWeek;
		this.offlineHoursPerWeek=offlineHoursPerWeek;
		this.flexibleMode=flexibleMode;
		}
	     String getOnlinePlatform() {
			return onlinePlatform;
		}

		 void setOnlinePlatform(String onlinePlatform) {
			this.onlinePlatform = onlinePlatform;
		}

		 String getOfflineCenter() {
			return offlineCenter;
		}

		 void setOfflineCenter(String offlineCenter) {
			this.offlineCenter = offlineCenter;
		}

		 int getOnlineHoursPerWeek() {
			return onlineHoursPerWeek;
		}

		 void setOnlineHoursPerWeek(int onlineHoursPerWeek) {
			this.onlineHoursPerWeek = onlineHoursPerWeek;
		}

		 int getOfflineHoursPerWeek() {
			return offlineHoursPerWeek;
		}

		 void setOfflineHoursPerWeek(int offlineHoursPerWeek) {
			this.offlineHoursPerWeek = offlineHoursPerWeek;
		}

		 boolean isFlexibleMode() {
			return flexibleMode;
		}

		 void setFlexibleMode(boolean flexibleMode) {
			this.flexibleMode = flexibleMode;
		}

		void display()
		{
			super.display();
		System.out.println("onlinePlatform is::"+this.onlinePlatform);
		System.out.println("offlineCenter is::"+this.offlineCenter);
		System.out.println("onlineHoursPerWeek is::"+this.onlineHoursPerWeek);
		System.out.println("offlineHoursPerWeek is::"+this.offlineHoursPerWeek);
		System.out.println("flexibleMode is::"+this.flexibleMode);
		
		}
	}//hybridcourse class ends here
	class DemoCource 
	{
	public static void main(String[] args) {
		 OnlineCource o1 = new OnlineCource("Java Full Stack", 6, "01/01/2025", "30/06/2025", "English", true, 50000, "Udemy", "https://udemy.com/java123", true); 
	        o1.display();
	        System.out.println("\n");
	        offlineCource off1 = new offlineCource("Data Science", 8, "10/02/2025", "10/10/2025", "English", true, 65000, "Room 204", "9 AM - 3 PM", 60, 12, true); 
	        off1.display();
	        System.out.println("\n");
	        HybridCourse h1 = new HybridCourse("AI and ML", 10, "05/03/2025", "05/12/2025", "English", true, 80000, "Zoom", "Pune Center", 8, 6, true); 
	        h1.display();

	}//main class ends here

}//DemoCource ends here
