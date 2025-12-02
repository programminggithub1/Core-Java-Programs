package AbstractANDToString;

abstract class Artist {
    String name;
    int age;
    String nationality;
    int yearsOfExperience;
    String artForm;
    double rating;
    String style;
    boolean awardWinner;

    // Default Constructor
    Artist() {
        System.out.println("Artist default constructor");
        name = "Unknown";
        age = 0;
        nationality = "Not specified";
        yearsOfExperience = 0;
        artForm = "None";
        rating = 0.0;
        style = "None";
        awardWinner = false;
    }

    // Parameterized Constructor
    Artist(String name, int age, String nationality, int yearsOfExperience,
           String artForm, double rating, String style, boolean awardWinner) {

        System.out.println("Artist parameterized constructor");
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.yearsOfExperience = yearsOfExperience;
        this.artForm = artForm;
        this.rating = rating;
        this.style = style;
        this.awardWinner = awardWinner;
    }

    abstract void perform();

    // Getters / Setters
     String getName() 
    { return name;
    }
     void setName(String name) { this.name = name; }

     int getAge() { return age; }
     void setAge(int age) { this.age = age; }

     String getNationality() { return nationality; }
     void setNationality(String nationality) { this.nationality = nationality; }

     int getYearsOfExperience() { return yearsOfExperience; }
     void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

     String getArtForm() { return artForm; }
     void setArtForm(String artForm) { this.artForm = artForm; }

     double getRating() { return rating; }
     void setRating(double rating) { this.rating = rating; }

     String getStyle() { return style; }
     void setStyle(String style) { this.style = style; }

     boolean isAwardWinner() { return awardWinner; }
     void setAwardWinner(boolean awardWinner) { this.awardWinner = awardWinner; }

    public String toString() {
        return "\nArtist Details -> " +
                "\nName: " + name +
                "\nAge: " + age +
                "\nNationality: " + nationality +
                "\nExperience: " + yearsOfExperience +
                "\nArt Form: " + artForm +
                "\nRating: " + rating +
                "\nStyle: " + style +
                "\nAward Winner: " + awardWinner;
    }
}


// ---------------------- Singer ----------------------
class Singer extends Artist {
    String genre;
    int albumsReleased;
    boolean playsInstrument;

    Singer() {
        super();
        System.out.println("Singer default constructor");
        genre = "Unknown";
        albumsReleased = 0;
        playsInstrument = false;
    }

    Singer(String name, int age, String nationality, int yearsOfExperience,
           String artForm, double rating, String style, boolean awardWinner,
           String genre, int albumsReleased, boolean playsInstrument) {

        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Singer parameterized constructor");
        this.genre = genre;
        this.albumsReleased = albumsReleased;
        this.playsInstrument = playsInstrument;
    }

    void perform() {
        System.out.println("Singer performing live in " + genre + " genre.");
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getAlbumsReleased() { return albumsReleased; }
    public void setAlbumsReleased(int albumsReleased) { this.albumsReleased = albumsReleased; }

    public boolean isPlaysInstrument() { return playsInstrument; }
    public void setPlaysInstrument(boolean playsInstrument) { this.playsInstrument = playsInstrument; }

    public String toString() {
        return super.toString() +
                "\nGenre: " + genre +
                "\nAlbums Released: " + albumsReleased +
                "\nPlays Instrument: " + playsInstrument;
    }
}


// ---------------------- Painter ----------------------
class Painter extends Artist {
    String mediumUsed;
    int paintingsCreated;
    boolean exhibitsInGallery;

    Painter() {
        super();
        System.out.println("Painter default constructor");
        mediumUsed = "Oil";
        paintingsCreated = 0;
        exhibitsInGallery = false;
    }

    Painter(String name, int age, String nationality, int yearsOfExperience,
            String artForm, double rating, String style, boolean awardWinner,
            String mediumUsed, int paintingsCreated, boolean exhibitsInGallery) {

        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Painter parameterized constructor");
        this.mediumUsed = mediumUsed;
        this.paintingsCreated = paintingsCreated;
        this.exhibitsInGallery = exhibitsInGallery;
    }

    void perform() {
        System.out.println("Painter creating artwork using " + mediumUsed + ".");
    }

     String getMediumUsed() { return mediumUsed; }
    void setMediumUsed(String mediumUsed) { this.mediumUsed = mediumUsed; }

     int getPaintingsCreated() { return paintingsCreated; }
     void setPaintingsCreated(int paintingsCreated) { this.paintingsCreated = paintingsCreated; }

     boolean isExhibitsInGallery() { return exhibitsInGallery; }
     void setExhibitsInGallery(boolean exhibitsInGallery) { this.exhibitsInGallery = exhibitsInGallery; }

    public String toString() {
        return super.toString() +
                "\nMedium Used: " + mediumUsed +
                "\nPaintings Created: " + paintingsCreated +
                "\nExhibits in Gallery: " + exhibitsInGallery;
    }
}


// ---------------------- Actor ----------------------
class Actor extends Artist {
    String filmIndustry;
    int moviesDone;
    boolean doesStunts;

    Actor() {
        super();
        System.out.println("Actor default constructor");
        filmIndustry = "Unknown";
        moviesDone = 0;
        doesStunts = false;
    }

    Actor(String name, int age, String nationality, int yearsOfExperience,
          String artForm, double rating, String style, boolean awardWinner,
          String filmIndustry, int moviesDone, boolean doesStunts) {

        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Actor parameterized constructor");
        this.filmIndustry = filmIndustry;
        this.moviesDone = moviesDone;
        this.doesStunts = doesStunts;
    }

    void perform() {
        System.out.println("Actor performing action scene in " + filmIndustry + ".");
    }

    public String getFilmIndustry() { return filmIndustry; }
    public void setFilmIndustry(String filmIndustry) { this.filmIndustry = filmIndustry; }

    public int getMoviesDone() { return moviesDone; }
    public void setMoviesDone(int moviesDone) { this.moviesDone = moviesDone; }

    public boolean isDoesStunts() { return doesStunts; }
    public void setDoesStunts(boolean doesStunts) { this.doesStunts = doesStunts; }

    public String toString() {
        return super.toString() +
                "\nFilm Industry: " + filmIndustry +
                "\nMovies Done: " + moviesDone +
                "\nPerforms Stunts: " + doesStunts;
    }
}



// ---------------------- DemoArtist ----------------------
class DemoArtist {
    public static void main(String[] args) {

        Artist a1; // generic reference

        a1 = new Singer("Arijit Singh", 36, "Indian", 15, "Singing",
                9.5, "Melodious", true,
                "Romantic", 12, true); // upcasting
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println("\n");

        a1 = new Painter("M. F. Husain", 91, "Indian", 70, "Painting",
                9.0, "Modern Art", true,
                "Oil", 500, true); // upcasting
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println("\n");

        a1 = new Actor("Shah Rukh Khan", 59, "Indian", 30, "Acting",
                9.7, "Romantic/Drama", true,
                "Bollywood", 90, true); // upcasting
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}
