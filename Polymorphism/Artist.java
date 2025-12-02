package Polymorphism;
public class Artist {
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
           String artForm, double rating, String style, boolean awardWinner)
    {
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

    void perform() {
        System.out.println("Artist is performing...");
    }

     String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 int getAge() {
		return age;
	}

	 void setAge(int age) {
		this.age = age;
	}

	 String getNationality() {
		return nationality;
	}

	 void setNationality(String nationality) {
		this.nationality = nationality;
	}

	 int getYearsOfExperience() {
		return yearsOfExperience;
	}

	 void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	 String getArtForm() {
		return artForm;
	}

	 void setArtForm(String artForm) {
		this.artForm = artForm;
	}

	 double getRating() {
		return rating;
	}

	 void setRating(double rating) {
		this.rating = rating;
	}

	 String getStyle() {
		return style;
	}

	 void setStyle(String style) {
		this.style = style;
	}

	 boolean isAwardWinner() {
		return awardWinner;
	}

	 void setAwardWinner(boolean awardWinner) {
		this.awardWinner = awardWinner;
	}

	void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("Art Form: " + artForm);
        System.out.println("Rating: " + rating);
        System.out.println("Style: " + style);
        System.out.println("Award Winner: " + awardWinner);
    }
} // Artist class ends here


//  ---------------------- Singer ----------------------
class Singer extends Artist {
    String genre;           
    int albumsReleased;
    boolean playsInstrument;

    Singer() // Default Constructor
    {
        super();
        System.out.println("Singer default constructor");
        genre = "Unknown";
        albumsReleased = 0;
        playsInstrument = false;
    }

    Singer(String name, int age, String nationality, int yearsOfExperience, 
           String artForm, double rating, String style, boolean awardWinner,
           String genre, int albumsReleased, boolean playsInstrument) //parameterized constructor
    {
        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Singer parameterized constructor");
        this.genre = genre;
        this.albumsReleased = albumsReleased;
        this.playsInstrument = playsInstrument;
    }

    void perform() {
        System.out.println("Singer is performing a live concert in " + genre + " style.");
    }

     String getGenre() {
		return genre;
	}

	 void setGenre(String genre) {
		this.genre = genre;
	}

	 int getAlbumsReleased() {
		return albumsReleased;
	}

	 void setAlbumsReleased(int albumsReleased) {
		this.albumsReleased = albumsReleased;
	}

	 boolean isPlaysInstrument() {
		return playsInstrument;
	}

	 void setPlaysInstrument(boolean playsInstrument) {
		this.playsInstrument = playsInstrument;
	}

	void display() {
        super.display();
        System.out.println("Genre: " + genre);
        System.out.println("Albums Released: " + albumsReleased);
        System.out.println("Plays Instrument: " + playsInstrument);
    }
} // Singer ends here


//  ---------------------- Painter ----------------------
class Painter extends Artist {
    String mediumUsed;      // e.g. Oil, Acrylic, Watercolor
    int paintingsCreated;
    boolean exhibitsInGallery;

    Painter()  // Default Constructor
    {
        super();
        System.out.println("Painter default constructor");
        mediumUsed = "Oil";
        paintingsCreated = 0;
        exhibitsInGallery = false;
    }

    Painter(String name, int age, String nationality, int yearsOfExperience, 
            String artForm, double rating, String style, boolean awardWinner,
            String mediumUsed, int paintingsCreated, boolean exhibitsInGallery)//parameterized constructor
    {
        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Painter parameterized constructor");
        this.mediumUsed = mediumUsed;
        this.paintingsCreated = paintingsCreated;
        this.exhibitsInGallery = exhibitsInGallery;
    }

    void perform() {
        System.out.println("Painter is creating a masterpiece using " + mediumUsed + ".");
    }

     String getMediumUsed() {
		return mediumUsed;
	}

	 void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}

	 int getPaintingsCreated() {
		return paintingsCreated;
	}

	 void setPaintingsCreated(int paintingsCreated) {
		this.paintingsCreated = paintingsCreated;
	}

	 boolean isExhibitsInGallery() {
		return exhibitsInGallery;
	}

	 void setExhibitsInGallery(boolean exhibitsInGallery) {
		this.exhibitsInGallery = exhibitsInGallery;
	}

	void display() {
        super.display();
        System.out.println("Medium Used: " + mediumUsed);
        System.out.println("Paintings Created: " + paintingsCreated);
        System.out.println("Exhibits in Gallery: " + exhibitsInGallery);
    }
} // Painter ends here


//  ---------------------- Actor ----------------------
class Actor extends Artist {
    String filmIndustry;    // e.g. Bollywood, Hollywood
    int moviesDone;
    boolean doesStunts;

    Actor() // Default Constructor
    {
        super();
        System.out.println("Actor default constructor");
        filmIndustry = "Unknown";
        moviesDone = 0;
        doesStunts = false;
    }

    Actor(String name, int age, String nationality, int yearsOfExperience, 
          String artForm, double rating, String style, boolean awardWinner,
          String filmIndustry, int moviesDone, boolean doesStunts) //parameterized constructor
    {
        super(name, age, nationality, yearsOfExperience, artForm, rating, style, awardWinner);
        System.out.println("Actor parameterized constructor");
        this.filmIndustry = filmIndustry;
        this.moviesDone = moviesDone;
        this.doesStunts = doesStunts;
    }

    void perform() {
        System.out.println("Actor is performing a dramatic scene in " + filmIndustry + " movie.");
    }

     String getFilmIndustry() {
		return filmIndustry;
	}

	 void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}

	 int getMoviesDone() {
		return moviesDone;
	}

	 void setMoviesDone(int moviesDone) {
		this.moviesDone = moviesDone;
	}

	 boolean isDoesStunts() {
		return doesStunts;
	}

	 void setDoesStunts(boolean doesStunts) {
		this.doesStunts = doesStunts;
	}

	void display() {
        super.display();
        System.out.println("Film Industry: " + filmIndustry);
        System.out.println("Movies Done: " + moviesDone);
        System.out.println("Performs Own Stunts: " + doesStunts);
    }
} // Actor ends here


//  ---------------------- DemoArtist ----------------------
class DemoArtist {
    public static void main(String[] args) {
        System.out.println("\n--- Using Parameterized Constructors ---");

        Artist a1;//generic reference

        a1 = new Singer("Arijit Singh", 36, "Indian", 15, "Singing", 9.5, "Melodious", true,
                "Romantic", 12, true);//upcasting
        a1.perform();
        a1.display();
        System.out.println("\n");

        a1 = new Painter("M. F. Husain", 91, "Indian", 70, "Painting", 9.0, "Modern Art", true,
                "Oil", 500, true);//upcasting
        a1.perform();
        a1.display();
        System.out.println("\n");

        a1 = new Actor("Shah Rukh Khan", 59, "Indian", 30, "Acting", 9.7, "Romantic/Drama", true,
                "Bollywood", 90, true);//upcasting
        a1.perform();
        a1.display();
    }
}
