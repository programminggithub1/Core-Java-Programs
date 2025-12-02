package inheritance;

public class SocialMediaAccount {
	    String username;
	    boolean isPersonal;
	    boolean isPublic;
	    boolean isVerified;
	    String countryOfOrigin;
	    int noOfPosts;
	    int noOfLikes;
	    int noOfComments;
	    int noOfFollowers;
	    String createdDate;
	    int impressions;

	    // Default Constructor
	    SocialMediaAccount() {
	        System.out.println("SocialMediaAccount default constructor");
	        username = "UnknownUser";
	        isPersonal = true;
	        isPublic = true;
	        isVerified = false;
	        countryOfOrigin = "Unknown";
	        noOfPosts = 0;
	        noOfLikes = 0;
	        noOfComments = 0;
	        noOfFollowers = 0;
	        createdDate = "01-01-2025";
	        impressions = 0;
	    }

	    // Parameterized Constructor
	    SocialMediaAccount(String username, boolean isPersonal, boolean isPublic, boolean isVerified,
	                       String countryOfOrigin, int noOfPosts, int noOfLikes, int noOfComments,
	                       int noOfFollowers, String createdDate, int impressions) {
	        System.out.println("SocialMediaAccount parameterized constructor");
	        this.username = username;
	        this.isPersonal = isPersonal;
	        this.isPublic = isPublic;
	        this.isVerified = isVerified;
	        this.countryOfOrigin = countryOfOrigin;
	        this.noOfPosts = noOfPosts;
	        this.noOfLikes = noOfLikes;
	        this.noOfComments = noOfComments;
	        this.noOfFollowers = noOfFollowers;
	        this.createdDate = createdDate;
	        this.impressions = impressions;
	    }

	     String getUsername() {
			return username;
		}

		 void setUsername(String username) {
			this.username = username;
		}

		 boolean isPersonal() {
			return isPersonal;
		}

		 void setPersonal(boolean isPersonal) {
			this.isPersonal = isPersonal;
		}

		 boolean isPublic() {
			return isPublic;
		}

		 void setPublic(boolean isPublic) {
			this.isPublic = isPublic;
		}

		 boolean isVerified() {
			return isVerified;
		}

		 void setVerified(boolean isVerified) {
			this.isVerified = isVerified;
		}
		 String getCountryOfOrigin() {
			return countryOfOrigin;
		}

		 void setCountryOfOrigin(String countryOfOrigin) {
			this.countryOfOrigin = countryOfOrigin;
		}

		 int getNoOfPosts() {
			return noOfPosts;
		}

		 void setNoOfPosts(int noOfPosts) {
			this.noOfPosts = noOfPosts;
		}

		 int getNoOfLikes() {
			return noOfLikes;
		}

		 void setNoOfLikes(int noOfLikes) {
			this.noOfLikes = noOfLikes;
		}

		 int getNoOfComments() {
			return noOfComments;
		}

		 void setNoOfComments(int noOfComments) {
			this.noOfComments = noOfComments;
		}

		 int getNoOfFollowers() {
			return noOfFollowers;
		}

		 void setNoOfFollowers(int noOfFollowers) {
			this.noOfFollowers = noOfFollowers;
		}

		 String getCreatedDate() {
			return createdDate;
		}

		 void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		 int getImpressions() {
			return impressions;
		}

		 void setImpressions(int impressions) {
			this.impressions = impressions;
		}

		void display() {
	        System.out.println("Username: " + username);
	        System.out.println("Personal: " + isPersonal);
	        System.out.println("Public: " + isPublic);
	        System.out.println("Verified: " + isVerified);
	        System.out.println("Country: " + countryOfOrigin);
	        System.out.println("Posts: " + noOfPosts);
	        System.out.println("Likes: " + noOfLikes);
	        System.out.println("Comments: " + noOfComments);
	        System.out.println("Followers: " + noOfFollowers);
	        System.out.println("Created Date: " + createdDate);
	        System.out.println("Impressions: " + impressions);
	    }
	}

	// ------------------- INSTAGRAM -------------------
	class Instagram extends SocialMediaAccount {
	    int noOfFollowers;
	    int noOfFollowing;
	    int noOfHighlights;
	    int noOfPostArchived;
	    int noOfStoryArchived;
	    int noOfReelsSaved;

	    Instagram() {
	        super();
	        System.out.println("Instagram default constructor");
	        noOfFollowers = 0;
	        noOfFollowing = 0;
	        noOfHighlights = 0;
	        noOfPostArchived = 0;
	        noOfStoryArchived = 0;
	        noOfReelsSaved = 0;
	    }

	    Instagram(String username, boolean isPersonal, boolean isPublic, boolean isVerified, String countryOfOrigin,
	              int noOfPosts, int noOfLikes, int noOfComments, int noOfFollowers, String createdDate, int impressions,
	              int noOfFollowing, int noOfHighlights, int noOfPostArchived, int noOfStoryArchived, int noOfReelsSaved) {
	     
	    	super(username, isPersonal, isPublic, isVerified, countryOfOrigin, noOfPosts, noOfLikes, noOfComments, noOfFollowers, createdDate, impressions);
	        System.out.println("Instagram parameterized constructor");
	        this.noOfFollowing = noOfFollowing;
	        this.noOfHighlights = noOfHighlights;
	        this.noOfPostArchived = noOfPostArchived;
	        this.noOfStoryArchived = noOfStoryArchived;
	        this.noOfReelsSaved = noOfReelsSaved;
	    }

	     int getNoOfFollowers() {
			return noOfFollowers;
		}

		 void setNoOfFollowers(int noOfFollowers) {
			this.noOfFollowers = noOfFollowers;
		}

		 int getNoOfFollowing() {
			return noOfFollowing;
		}

		 void setNoOfFollowing(int noOfFollowing) {
			this.noOfFollowing = noOfFollowing;
		}

		 int getNoOfHighlights() {
			return noOfHighlights;
		}

		 void setNoOfHighlights(int noOfHighlights) {
			this.noOfHighlights = noOfHighlights;
		}

		 int getNoOfPostArchived() {
			return noOfPostArchived;
		}

		 void setNoOfPostArchived(int noOfPostArchived) {
			this.noOfPostArchived = noOfPostArchived;
		}

		 int getNoOfStoryArchived() {
			return noOfStoryArchived;
		}

		 void setNoOfStoryArchived(int noOfStoryArchived) {
			this.noOfStoryArchived = noOfStoryArchived;
		}

		 int getNoOfReelsSaved() {
			return noOfReelsSaved;
		}

		 void setNoOfReelsSaved(int noOfReelsSaved) {
			this.noOfReelsSaved = noOfReelsSaved;
		}

		void display() {
	        super.display();
	        System.out.println("Following: " + noOfFollowing);
	        System.out.println("Highlights: " + noOfHighlights);
	        System.out.println("Posts Archived: " + noOfPostArchived);
	        System.out.println("Stories Archived: " + noOfStoryArchived);
	        System.out.println("Reels Saved: " + noOfReelsSaved);
	    }
	}

	// ------------------- LINKEDIN -------------------
	class LinkedIn extends SocialMediaAccount {
	    int noOfConnections;
	    int noOfProfileViews;
	    int noOfJobsApplied;

	    LinkedIn() {
	        super();
	        System.out.println("LinkedIn default constructor");
	        noOfConnections = 0;
	        noOfProfileViews = 0;
	        noOfJobsApplied = 0;
	    }

	    LinkedIn(String username, boolean isPersonal, boolean isPublic, boolean isVerified, String countryOfOrigin,
	             int noOfPosts, int noOfLikes, int noOfComments, int noOfFollowers, String createdDate, int impressions,
	             int noOfConnections, int noOfProfileViews, int noOfJobsApplied) {
	        
	    	super(username, isPersonal, isPublic, isVerified, countryOfOrigin, noOfPosts, noOfLikes, noOfComments, noOfFollowers, createdDate, impressions);
	        System.out.println("LinkedIn parameterized constructor");
	        this.noOfConnections = noOfConnections;
	        this.noOfProfileViews = noOfProfileViews;
	        this.noOfJobsApplied = noOfJobsApplied;
	    }

	     int getNoOfConnections() {
			return noOfConnections;
		}

		 void setNoOfConnections(int noOfConnections) {
			this.noOfConnections = noOfConnections;
		}

		 int getNoOfProfileViews() {
			return noOfProfileViews;
		}

		 void setNoOfProfileViews(int noOfProfileViews) {
			this.noOfProfileViews = noOfProfileViews;
		}

		 int getNoOfJobsApplied() {
			return noOfJobsApplied;
		}

		 void setNoOfJobsApplied(int noOfJobsApplied) {
			this.noOfJobsApplied = noOfJobsApplied;
		}

		void display() {
	        super.display();
	        System.out.println("Connections: " + noOfConnections);
	        System.out.println("Profile Views: " + noOfProfileViews);
	        System.out.println("Jobs Applied: " + noOfJobsApplied);
	    }
	}

	// ------------------- YOUTUBE -------------------
	class YouTube extends SocialMediaAccount {
	    int noOfSubscribers;
	    double watchTime;
	    boolean isMonetized;
	    double estimatedRevenue;

	    YouTube() {
	        super();
	        System.out.println("YouTube default constructor");
	        noOfSubscribers = 0;
	        watchTime = 0.0;
	        isMonetized = false;
	        estimatedRevenue = 0.0;
	    }

	    YouTube(String username, boolean isPersonal, boolean isPublic, boolean isVerified, String countryOfOrigin,
	            int noOfPosts, int noOfLikes, int noOfComments, int noOfFollowers, String createdDate, int impressions,
	            int noOfSubscribers, double watchTime, boolean isMonetized, double estimatedRevenue) {
	       
	    	super(username, isPersonal, isPublic, isVerified, countryOfOrigin, noOfPosts, noOfLikes, noOfComments, noOfFollowers, createdDate, impressions);
	        System.out.println("YouTube parameterized constructor");
	        this.noOfSubscribers = noOfSubscribers;
	        this.watchTime = watchTime;
	        this.isMonetized = isMonetized;
	        this.estimatedRevenue = estimatedRevenue;
	    }

	     int getNoOfSubscribers() {
			return noOfSubscribers;
		}

		 void setNoOfSubscribers(int noOfSubscribers) {
			this.noOfSubscribers = noOfSubscribers;
		}

		 double getWatchTime() {
			return watchTime;
		}

		 void setWatchTime(double watchTime) {
			this.watchTime = watchTime;
		}

		 boolean isMonetized() {
			return isMonetized;
		}

		 void setMonetized(boolean isMonetized) {
			this.isMonetized = isMonetized;
		}

		 double getEstimatedRevenue() {
			return estimatedRevenue;
		}

		 void setEstimatedRevenue(double estimatedRevenue) {
			this.estimatedRevenue = estimatedRevenue;
		}

		void display() {
	        super.display();
	        System.out.println("Subscribers: " + noOfSubscribers);
	        System.out.println("Watch Time: " + watchTime + " hours");
	        System.out.println("Monetized: " + isMonetized);
	        System.out.println("Estimated Revenue: $" + estimatedRevenue);
	    }
	}

	// ------------------- DEMO CLASS -------------------
	class DemoSocialMedia {
	    public static void main(String[] args) {
	        Instagram ig = new Instagram("shweta_01", true, true, true, "India", 150, 5000, 1200, 2500, "2020-05-10", 45000,
	                                     1000, 12, 5, 20, 50);
	        ig.display();
	        System.out.println("\n");

	        LinkedIn li = new LinkedIn("shweta_linkedin", false, true, true, "India", 40, 300, 80, 800, "2021-01-01", 15000,
	                                   600, 500, 12);
	        li.display();
	        System.out.println("\n");

	        YouTube yt = new YouTube("shwetaYT", true, true, false, "India", 200, 10000, 2500, 3000, "2019-03-15", 90000,
	                                 12000, 800.5, true, 1500.75);
	        yt.display();
	    }
	}

	
