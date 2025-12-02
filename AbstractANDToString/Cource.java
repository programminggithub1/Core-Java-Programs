package AbstractANDToString;

abstract class Cource {

    String name;
    int duration;
    String startdate;
    String enddate;
    String Language;
    double fees;
    boolean CirfiticateAvailable;

    Cource() // default constructor
    {
        System.out.println("Constructor called");
        this.name = "Java";
        this.duration = 4;
        this.startdate = "23/4/25";
        this.enddate = "23/12/25";
        this.Language = "English";
        this.CirfiticateAvailable = true;
        this.fees = 40000;
    }

    Cource(String name, int duration, String startdate, String enddate, String Language, boolean CirfiticateAvailable, double fees) // parameterized constructor
    {
        System.out.println("Parameterized Constructor called");
        this.name = name;
        this.duration = duration;
        this.startdate = startdate;
        this.enddate = enddate;
        this.Language = Language;
        this.CirfiticateAvailable = CirfiticateAvailable;
        this.fees = fees;
    }

    abstract void conduct(); // abstract method

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

    public String toString() {
        return "\nname is::" + this.name + " duration is::" + this.duration + " startdate::" + this.startdate
                + " enddate::" + this.enddate + " Language::" + this.Language + " CirfiticateAvailable::"
                + this.CirfiticateAvailable + " fees::" + this.fees;
    }

}// Cource ends here

class OnlineCource extends Cource {
    String platformname;
    String lecturelink;
    boolean livesession;

    OnlineCource() {
        super();
        System.out.println("Constructor called");
        this.platformname = "Udemy";
        this.lecturelink = "link123";
        this.livesession = true;
    }

    OnlineCource(String name, int duration, String startdate, String enddate, String Language,
            boolean CirfiticateAvailable, double fees, String platformname, String lecturelink, boolean livesession) {
        super(name, duration, startdate, enddate, Language, CirfiticateAvailable, fees);
        System.out.println("Parameterized Constructor called");
        this.platformname = platformname;
        this.lecturelink = lecturelink;
        this.livesession = livesession;
    }

    void conduct() {
        System.out.println("Course is conducted online via platform");
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

    public String toString() {
        return super.toString() + " platformname::" + this.platformname + " lecturelink::" + this.lecturelink
                + " livesession::" + this.livesession;
    }
}// OnlineCource ends here

class OfflineCource extends Cource {
    String roomno;
    String timing;
    int totalseats;
    int availableseats;
    boolean labaccess;

    OfflineCource() {
        super();
        System.out.println("Constructor called");
        this.roomno = "fc17";
        this.timing = "10 to 5";
        this.totalseats = 80;
        this.availableseats = 10;
        this.labaccess = true;
    }

    OfflineCource(String name, int duration, String startdate, String enddate, String Language,
            boolean CirfiticateAvailable, double fees, String roomno, String timing, int totalseats, int availableseats,
            boolean labaccess) {
        super(name, duration, startdate, enddate, Language, CirfiticateAvailable, fees);
        System.out.println("Parameterized Constructor called");
        this.roomno = roomno;
        this.timing = timing;
        this.totalseats = totalseats;
        this.availableseats = availableseats;
        this.labaccess = labaccess;
    }

    void conduct() {
        System.out.println("Course is conducted offline in classroom");
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

    public String toString() {
        return super.toString() + " roomno::" + this.roomno + " timing::" + this.timing + " totalseats::" + this.totalseats
                + " availableseats::" + this.availableseats + " labaccess::" + this.labaccess;
    }

}// OfflineCource ends here

class HybridCource extends Cource {
    String onlinePlatform;
    String offlineCenter;
    int onlineHoursPerWeek;
    int offlineHoursPerWeek;
    boolean flexibleMode;

    HybridCource() {
        super();
        System.out.println("Constructor called");
        this.onlinePlatform = "Zoom";
        this.offlineCenter = "Pune Center";
        this.onlineHoursPerWeek = 8;
        this.offlineHoursPerWeek = 6;
        this.flexibleMode = true;
    }

    HybridCource(String name, int duration, String startdate, String enddate, String Language,
            boolean CirfiticateAvailable, double fees, String onlinePlatform, String offlineCenter,
            int onlineHoursPerWeek, int offlineHoursPerWeek, boolean flexibleMode) {
        super(name, duration, startdate, enddate, Language, CirfiticateAvailable, fees);
        System.out.println("Parameterized Constructor called");
        this.onlinePlatform = onlinePlatform;
        this.offlineCenter = offlineCenter;
        this.onlineHoursPerWeek = onlineHoursPerWeek;
        this.offlineHoursPerWeek = offlineHoursPerWeek;
        this.flexibleMode = flexibleMode;
    }

    void conduct() {
        System.out.println("Course is conducted in hybrid mode (online + offline)");
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

    public String toString() {
        return super.toString() + " onlinePlatform::" + this.onlinePlatform + " offlineCenter::" + this.offlineCenter
                + " onlineHoursPerWeek::" + this.onlineHoursPerWeek + " offlineHoursPerWeek::"
                + this.offlineHoursPerWeek + " flexibleMode::" + this.flexibleMode;
    }

}// HybridCource ends here

class DemoCource {
    public static void main(String[] args) {
        Cource c1; // generic reference

        c1 = new OnlineCource("Java Full Stack", 6, "01/01/2025", "30/06/2025", "English", true, 50000, "Udemy",
                "https://udemy.com/java123", true); // upcasting
        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println("\n");

        c1 = new OfflineCource("Data Science", 8, "10/02/2025", "10/10/2025", "English", true, 65000, "Room 204",
                "9 AM - 3 PM", 60, 12, true); // upcasting
        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println("\n");

        c1 = new HybridCource("AI and ML", 10, "05/03/2025", "05/12/2025", "English", true, 80000, "Zoom",
                "Pune Center", 8, 6, true); // upcasting
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
