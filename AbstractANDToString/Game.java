package AbstractANDToString;

class Game {
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

    Game() { // default constructor
        System.out.println("Game default constructor");
        name = "Unknown";
        type = "Unknown";
        noOfPlayers = 0;
        durationMin = 0;
        rules = "Standard";
        score = 0;
        location = "Unknown";
        startTime = "00:00";
        endTime = "00:00";
        team = "Team A";
        winnerTeam = "N/A";
        jerseyNo = "N/A";
    }

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

    double calculateScore() {
        return score;
    }

    // Getters and Setters
    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    int getNoOfPlayers() { return noOfPlayers; }
    void setNoOfPlayers(int noOfPlayers) { this.noOfPlayers = noOfPlayers; }

    double getDurationMin() { return durationMin; }
    void setDurationMin(double durationMin) { this.durationMin = durationMin; }

    String getRules() { return rules; }
    void setRules(String rules) { this.rules = rules; }

    int getScore() { return score; }
    void setScore(int score) { this.score = score; }

    String getLocation() { return location; }
    void setLocation(String location) { this.location = location; }

    String getStartTime() { return startTime; }
    void setStartTime(String startTime) { this.startTime = startTime; }

    String getEndTime() { return endTime; }
    void setEndTime(String endTime) { this.endTime = endTime; }

    String getTeam() { return team; }
    void setTeam(String team) { this.team = team; }

    String getWinnerTeam() { return winnerTeam; }
    void setWinnerTeam(String winnerTeam) { this.winnerTeam = winnerTeam; }

    String getJerseyNo() { return jerseyNo; }
    void setJerseyNo(String jerseyNo) { this.jerseyNo = jerseyNo; }

    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Players: " + noOfPlayers +
                ", Duration: " + durationMin + ", Rules: " + rules + ", Score: " + score +
                ", Location: " + location + ", Start: " + startTime + ", End: " + endTime +
                ", Team: " + team + ", Winner: " + winnerTeam + ", Jersey: " + jerseyNo;
    }
}

// ---------------- Cricket ----------------
class Cricket extends Game {
    int overs;
    int wickets;
    int runs;
    String battingTeam;
    String bowlingTeam;
    String stadiumName;
    String umpireName;

    Cricket() { // default constructor
        super();
        System.out.println("Cricket default constructor");
        overs = 50;
        wickets = 10;
        runs = 300;
        battingTeam = "Team A";
        bowlingTeam = "Team B";
        stadiumName = "Unknown";
        umpireName = "Unknown";
    }

    Cricket(String name, String type, int noOfPlayers, double durationMin, String rules, int score,
            String location, String startTime, String endTime, String team, String winnerTeam, String jerseyNo,
            int overs, int wickets, int runs, String battingTeam, String bowlingTeam, String stadiumName, String umpireName) {
        super(name, type, noOfPlayers, durationMin, rules, score, location, startTime, endTime, team, winnerTeam, jerseyNo);
        System.out.println("Cricket parameterized constructor");
        this.overs = overs;
        this.wickets = wickets;
        this.runs = runs;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.stadiumName = stadiumName;
        this.umpireName = umpireName;
    }

    double calculateScore() {
        return runs - (wickets * 5);
    }

    // Getters and Setters
    int getOvers() { return overs; }
    void setOvers(int overs) { this.overs = overs; }

    int getWickets() { return wickets; }
    void setWickets(int wickets) { this.wickets = wickets; }

    int getRuns() { return runs; }
    void setRuns(int runs) { this.runs = runs; }

    String getBattingTeam() { return battingTeam; }
    void setBattingTeam(String battingTeam) { this.battingTeam = battingTeam; }

    String getBowlingTeam() { return bowlingTeam; }
    void setBowlingTeam(String bowlingTeam) { this.bowlingTeam = bowlingTeam; }

    String getStadiumName() { return stadiumName; }
    void setStadiumName(String stadiumName) { this.stadiumName = stadiumName; }

    String getUmpireName() { return umpireName; }
    void setUmpireName(String umpireName) { this.umpireName = umpireName; }

    public String toString() {
        return super.toString() + ", Overs: " + overs + ", Wickets: " + wickets + ", Runs: " + runs +
                ", Batting Team: " + battingTeam + ", Bowling Team: " + bowlingTeam +
                ", Stadium: " + stadiumName + ", Umpire: " + umpireName;
    }
}

// ---------------- Football ----------------
class Football extends Game {
    int goals;
    int yellowCards;
    int redCards;
    String teamName;
    int penaltyCount;
    String stadiumName;

    Football() {
        super();
        System.out.println("Football default constructor");
        goals = 0;
        yellowCards = 0;
        redCards = 0;
        teamName = "Unknown";
        penaltyCount = 0;
        stadiumName = "Unknown";
    }

    Football(String name, String type, int noOfPlayers, double durationMin, String rules, int score,
             String location, String startTime, String endTime, String team, String winnerTeam, String jerseyNo,
             int goals, int yellowCards, int redCards, String teamName, int penaltyCount, String stadiumName) {
        super(name, type, noOfPlayers, durationMin, rules, score, location, startTime, endTime, team, winnerTeam, jerseyNo);
        System.out.println("Football parameterized constructor");
        this.goals = goals;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.teamName = teamName;
        this.penaltyCount = penaltyCount;
        this.stadiumName = stadiumName;
    }

    double calculateScore() {
        return (goals * 10) - (penaltyCount * 2);
    }

    // Getters and Setters
    int getGoals() { return goals; }
    void setGoals(int goals) { this.goals = goals; }

    int getYellowCards() { return yellowCards; }
    void setYellowCards(int yellowCards) { this.yellowCards = yellowCards; }

    int getRedCards() { return redCards; }
    void setRedCards(int redCards) { this.redCards = redCards; }

    String getTeamName() { return teamName; }
    void setTeamName(String teamName) { this.teamName = teamName; }

    int getPenaltyCount() { return penaltyCount; }
    void setPenaltyCount(int penaltyCount) { this.penaltyCount = penaltyCount; }

    String getStadiumName() { return stadiumName; }
    void setStadiumName(String stadiumName) { this.stadiumName = stadiumName; }

    public String toString() {
        return super.toString() + ", Goals: " + goals + ", Yellow Cards: " + yellowCards +
                ", Red Cards: " + redCards + ", Team Name: " + teamName + ", Penalty Count: " + penaltyCount +
                ", Stadium: " + stadiumName;
    }
}

// ---------------- Demo ----------------
class DemoGame {
    public static void main(String[] args) {
        Game g1; // generic reference

        g1 = new Cricket("World Cup Final", "Outdoor", 11, 300, "Standard", 250,
                "Ahmedabad", "14:00", "22:00", "India", "India", "10",
                50, 10, 250, "India", "Australia", "Narendra Modi Stadium", "Kumar Dharmasena"); // upcasting
        System.out.println(g1);
        System.out.println(g1.toString());
        System.out.println("\n");

        g1 = new Football("Champions League Final", "Outdoor", 11, 90, "FIFA Rules", 3,
                "London", "19:00", "21:00", "Real Madrid", "Real Madrid", "7",
                3, 2, 0, "Real Madrid", 1, "Wembley Stadium"); // upcasting
        System.out.println(g1);
        System.out.println(g1.toString());
    }
}
