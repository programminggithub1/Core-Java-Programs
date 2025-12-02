package inheritance;

public class Game {
	    String name;
	    String type;
	    int noOfPlayers;
	    double durationMin;
	    String rules;
	    int score;
	    String location;
	    String startTime;
	    String endTime;
	    String team;
	    String winnerTeam;
	    String jerseyNo;

	    // Default constructor
	    Game() {
	        System.out.println("Game default constructor");
	        name = "Unknown";
	        type = "Unknown";
	        noOfPlayers = 0;
	        durationMin = 0.0;
	        rules = "Standard";
	        score = 0;
	        location = "Unknown";
	        startTime = "00:00";
	        endTime = "00:00";
	        team = "Team A";
	        winnerTeam = "N/A";
	        jerseyNo = "N/A";
	    }

	    // Parameterized constructor
	    Game(String name, String type, int noOfPlayers, double durationMin, String rules,
	         int score, String location, String startTime, String endTime,
	         String team, String winnerTeam, String jerseyNo) {

	        System.out.println("Game parameterized constructor");
	        this.name = name;
	        this.type = type;
	        this.noOfPlayers = noOfPlayers;
	        this.durationMin = durationMin;
	        this.rules = rules;
	        this.score = score;
	        this.location = location;
	        this.startTime = startTime;
	        this.endTime = endTime;
	        this.team = team;
	        this.winnerTeam = winnerTeam;
	        this.jerseyNo = jerseyNo;
	    }

	     String getName() {
			return name;
		}

		 void setName(String name) {
			this.name = name;
		}

		 String getType() {
			return type;
		}

		 void setType(String type) {
			this.type = type;
		}

		 int getNoOfPlayers() {
			return noOfPlayers;
		}

		 void setNoOfPlayers(int noOfPlayers) {
			this.noOfPlayers = noOfPlayers;
		}

		 double getDurationMin() {
			return durationMin;
		}

		 void setDurationMin(double durationMin) {
			this.durationMin = durationMin;
		}

		 String getRules() {
			return rules;
		}

		 void setRules(String rules) {
			this.rules = rules;
		}

		 int getScore() {
			return score;
		}

		 void setScore(int score) {
			this.score = score;
		}

		 String getLocation() {
			return location;
		}

		 void setLocation(String location) {
			this.location = location;
		}

		 String getStartTime() {
			return startTime;
		}

		 void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		 String getEndTime() {
			return endTime;
		}

		 void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		 String getTeam() {
			return team;
		}

		 void setTeam(String team) {
			this.team = team;
		}

		 String getWinnerTeam() {
			return winnerTeam;
		}

		 void setWinnerTeam(String winnerTeam) {
			this.winnerTeam = winnerTeam;
		}

		 String getJerseyNo() {
			return jerseyNo;
		}

		 void setJerseyNo(String jerseyNo) {
			this.jerseyNo = jerseyNo;
		}

		void display() {
	        System.out.println("Game Name     : " + name);
	        System.out.println("Type          : " + type);
	        System.out.println("Players       : " + noOfPlayers);
	        System.out.println("Duration (min): " + durationMin);
	        System.out.println("Rules         : " + rules);
	        System.out.println("Score         : " + score);
	        System.out.println("Location      : " + location);
	        System.out.println("Start Time    : " + startTime);
	        System.out.println("End Time      : " + endTime);
	        System.out.println("Team          : " + team);
	        System.out.println("Winner Team   : " + winnerTeam);
	        System.out.println("Jersey No.    : " + jerseyNo);
	    }
	}

	// ------------------- CRICKET -------------------
	class Cricket extends Game {
	    int overs;
	    int wickets;
	    int runs;
	    String battingTeam;
	    String bowlingTeam;
	    String stadiumName;
	    String umpireName;
	    
	    //default constructor
	    Cricket() {
	    	super();
	        System.out.println("Cricket default constructor");
	        this.overs = 45;
	        this.wickets = 5;
	        this.runs = 245;
	        this.battingTeam = "RCB";
	        this.bowlingTeam = "MI";
	        this.stadiumName = "Wankhede";
	        this.umpireName = "not awailable";
	    
	    }
	    // Parameterized constructor
	    Cricket(String name, String type, int noOfPlayers, double durationMin, String rules, int score,
	            String location, String startTime, String endTime, String team, String winnerTeam, String jerseyNo,
	            int overs, int wickets, int runs, String battingTeam, String bowlingTeam,
	            String stadiumName, String umpireName) {

	        super(name, type, noOfPlayers, durationMin, rules, score, location, startTime, endTime, team, winnerTeam, jerseyNo);
	        this.overs = overs;
	        this.wickets = wickets;
	        this.runs = runs;
	        this.battingTeam = battingTeam;
	        this.bowlingTeam = bowlingTeam;
	        this.stadiumName = stadiumName;
	        this.umpireName = umpireName;
	    }

	     int getOvers() {
			return overs;
		}

		 void setOvers(int overs) {
			this.overs = overs;
		}

		 int getWickets() {
			return wickets;
		}

		 void setWickets(int wickets) {
			this.wickets = wickets;
		}

		 int getRuns() {
			return runs;
		}

		 void setRuns(int runs) {
			this.runs = runs;
		}

		 String getBattingTeam() {
			return battingTeam;
		}

		 void setBattingTeam(String battingTeam) {
			this.battingTeam = battingTeam;
		}

		 String getBowlingTeam() {
			return bowlingTeam;
		}

		 void setBowlingTeam(String bowlingTeam) {
			this.bowlingTeam = bowlingTeam;
		}

		 String getStadiumName() {
			return stadiumName;
		}

		 void setStadiumName(String stadiumName) {
			this.stadiumName = stadiumName;
		}

		 String getUmpireName() {
			return umpireName;
		}

		 void setUmpireName(String umpireName) {
			this.umpireName = umpireName;
		}

		void display() {
	        super.display();
	        System.out.println("Overs         : " + overs);
	        System.out.println("Wickets       : " + wickets);
	        System.out.println("Runs          : " + runs);
	        System.out.println("Batting Team  : " + battingTeam);
	        System.out.println("Bowling Team  : " + bowlingTeam);
	        System.out.println("Stadium Name  : " + stadiumName);
	        System.out.println("Umpire Name   : " + umpireName);
	    }
	}

	// ------------------- FOOTBALL -------------------
	class Football extends Game {
	    int goals;
	    int yellowCards;
	    int redCards;
	    String teamName;
	    int penaltyCount;
	    String stadiumName;
	    
	    //default constructor
	    Football() {
	    	super();
	        System.out.println("Football default constructor");
	        this.goals = 12;
	        this.yellowCards = 7;
	        this.redCards = 3;
	        this.teamName = "xyz";
	        this.penaltyCount = 23;
	        this.stadiumName = "not awailable";
	    }
	        
	    // Parameterized constructor
	    Football(String name, String type, int noOfPlayers, double durationMin, String rules, int score,
	             String location, String startTime, String endTime, String team, String winnerTeam, String jerseyNo,
	             int goals, int yellowCards, int redCards, String teamName, int penaltyCount, String stadiumName) {

	        super(name, type, noOfPlayers, durationMin, rules, score, location, startTime, endTime, team, winnerTeam, jerseyNo);
	        this.goals = goals;
	        this.yellowCards = yellowCards;
	        this.redCards = redCards;
	        this.teamName = teamName;
	        this.penaltyCount = penaltyCount;
	        this.stadiumName = stadiumName;
	    }

	     int getGoals() {
			return goals;
		}

		 void setGoals(int goals) {
			this.goals = goals;
		}

		 int getYellowCards() {
			return yellowCards;
		}

		 void setYellowCards(int yellowCards) {
			this.yellowCards = yellowCards;
		}

		 int getRedCards() {
			return redCards;
		}

		 void setRedCards(int redCards) {
			this.redCards = redCards;
		}

		 String getTeamName() {
			return teamName;
		}

		 void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		 int getPenaltyCount() {
			return penaltyCount;
		}

		 void setPenaltyCount(int penaltyCount) {
			this.penaltyCount = penaltyCount;
		}

		 String getStadiumName() {
			return stadiumName;
		}

		 void setStadiumName(String stadiumName) {
			this.stadiumName = stadiumName;
		}

		void display() {
	        super.display();
	        System.out.println("Goals         : " + goals);
	        System.out.println("Yellow Cards  : " + yellowCards);
	        System.out.println("Red Cards     : " + redCards);
	        System.out.println("Team Name     : " + teamName);
	        System.out.println("Penalty Count : " + penaltyCount);
	        System.out.println("Stadium Name  : " + stadiumName);
	    }
	}

	// ------------------- BASKETBALL -------------------
	class Basketball extends Game {
	    int points;
	    int fouls;
	    int threePoints;
	    int freeThrows;
	    int teamTimeouts;
	    String courtType;
	    
	    //default constructor
	    Basketball() {
	    	super();
	        System.out.println("Basketball default constructor");
	        this.points = 45;
	        this.fouls = 4;
	        this.threePoints = 34;
	        this.freeThrows = 23;
	        this.teamTimeouts = 12;
	        this.courtType = "not awailable";
	    }
	    // Parameterized constructor
	    Basketball(String name, String type, int noOfPlayers, double durationMin, String rules, int score,
	               String location, String startTime, String endTime, String team, String winnerTeam, String jerseyNo,
	               int points, int fouls, int threePoints, int freeThrows, int teamTimeouts, String courtType) {

	        super(name, type, noOfPlayers, durationMin, rules, score, location, startTime, endTime, team, winnerTeam, jerseyNo);
	        this.points = points;
	        this.fouls = fouls;
	        this.threePoints = threePoints;
	        this.freeThrows = freeThrows;
	        this.teamTimeouts = teamTimeouts;
	        this.courtType = courtType;
	    }

	     int getPoints() {
			return points;
		}

		 void setPoints(int points) {
			this.points = points;
		}

		 int getFouls() {
			return fouls;
		}

		 void setFouls(int fouls) {
			this.fouls = fouls;
		}

		 int getThreePoints() {
			return threePoints;
		}

		 void setThreePoints(int threePoints) {
			this.threePoints = threePoints;
		}

		 int getFreeThrows() {
			return freeThrows;
		}

		 void setFreeThrows(int freeThrows) {
			this.freeThrows = freeThrows;
		}

		 int getTeamTimeouts() {
			return teamTimeouts;
		}

		 void setTeamTimeouts(int teamTimeouts) {
			this.teamTimeouts = teamTimeouts;
		}

		 String getCourtType() {
			return courtType;
		}

		 void setCourtType(String courtType) {
			this.courtType = courtType;
		}

		void display() {
	        super.display();
	        System.out.println("Points        : " + points);
	        System.out.println("Fouls         : " + fouls);
	        System.out.println("Three Points  : " + threePoints);
	        System.out.println("Free Throws   : " + freeThrows);
	        System.out.println("Team Timeouts : " + teamTimeouts);
	        System.out.println("Court Type    : " + courtType);
	    }
	}

	// ------------------- DEMO CLASS -------------------
	class DemoGame {
	    public static void main(String[] args) {
	        Cricket c = new Cricket("World Cup Final", "Outdoor", 11, 300, "Standard", 250,
	                "Ahmedabad", "14:00", "22:00", "India", "India", "10",
	                50, 10, 250, "India", "Australia", "Narendra Modi Stadium", "Kumar Dharmasena");
	        c.display();
	        System.out.println("\n");

	        Football f = new Football("Champions League Final", "Outdoor", 11, 90, "FIFA Rules", 3,
	                "London", "19:00", "21:00", "Real Madrid", "Real Madrid", "7",
	                3, 2, 0, "Real Madrid", 1, "Wembley Stadium");
	        f.display();
	        System.out.println("\n");

	        Basketball b = new Basketball("NBA Finals", "Indoor", 5, 48, "NBA Rules", 102,
	                "New York", "20:00", "22:00", "Lakers", "Lakers", "23",
	                102, 8, 15, 10, 6, "Hardwood");
	        b.display();
	    }
	}



