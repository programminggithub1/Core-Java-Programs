package Polymorphism;

public class MediaFile {
	    String fileName;
	    double size; // in MB
	    double duration; // in seconds
	    String format;
	    String fileType;

	    // Default Constructor
	    MediaFile() {
	        System.out.println("MediaFile default constructor");
	        fileName = "Unknown";
	        size = 0.0;
	        duration = 0.0;
	        format = "Unknown";
	        fileType = "Unknown";
	    }

	    // Parameterized Constructor
	    MediaFile(String fileName, double size, double duration, String format, String fileType) {
	        System.out.println("MediaFile parameterized constructor");
	        this.fileName = fileName;
	        this.size = size;
	        this.duration = duration;
	        this.format = format;
	        this.fileType = fileType;
	    }
	    void play() {
	        System.out.println("Playing a generic media file...");
	    }
	     String getFileName() {
			return fileName;
		}

		 void setFileName(String fileName) {
			this.fileName = fileName;
		}

		 double getSize() {
			return size;
		}

		 void setSize(double size) {
			this.size = size;
		}

		 double getDuration() {
			return duration;
		}

		 void setDuration(double duration) {
			this.duration = duration;
		}

		 String getFormat() {
			return format;
		}

		 void setFormat(String format) {
			this.format = format;
		}

		 String getFileType() {
			return fileType;
		}

		 void setFileType(String fileType) {
			this.fileType = fileType;
		}

		void display() {
	        System.out.println("File Name     : " + fileName);
	        System.out.println("Size (MB)     : " + size);
	        System.out.println("Duration (sec): " + duration);
	        System.out.println("Format        : " + format);
	        System.out.println("File Type     : " + fileType);
	    }
	}

	// ------------------- AUDIO FILE -------------------
	class AudioFile extends MediaFile {
	    int bitRange;
	    int audioChannel;
	    String artistName;
	    int sampleRate;
	    String language;
	 // Default Constructor
	    AudioFile() {
	        super();
	        System.out.println("AudioFile default constructor");
	        bitRange = 128;
	        audioChannel = 2;
	        artistName = "Unknown Artist";
	        sampleRate = 44100;
	        language = "Unknown";
	    }
	    // Parameterized Constructor
	    AudioFile(String fileName, double size, double duration, String format, String fileType,
	              int bitRange, int audioChannel, String artistName, int sampleRate, String language) {
	       
	    	super(fileName, size, duration, format, fileType);
	        System.out.println("AudioFile parameterized constructor");
	        this.bitRange = bitRange;
	        this.audioChannel = audioChannel;
	        this.artistName = artistName;
	        this.sampleRate = sampleRate;
	        this.language = language;
	    }
	    void play() {
	        System.out.println("Playing an audio file...");
	    }
	     int getBitRange() {
			return bitRange;
		}
		 void setBitRange(int bitRange) {
			this.bitRange = bitRange;
		}
		 int getAudioChannel() {
			return audioChannel;
		}
		 void setAudioChannel(int audioChannel) {
			this.audioChannel = audioChannel;
		}
		 String getArtistName() {
			return artistName;
		}
		 void setArtistName(String artistName) {
			this.artistName = artistName;
		}
		 int getSampleRate() {
			return sampleRate;
		}
		 void setSampleRate(int sampleRate) {
			this.sampleRate = sampleRate;
		}
		 String getLanguage() {
			return language;
		}
		 void setLanguage(String language) {
			this.language = language;
		}
		void display() {
	        super.display();
	        System.out.println("Bit Range (kbps): " + bitRange);
	        System.out.println("Audio Channels  : " + audioChannel);
	        System.out.println("Artist Name     : " + artistName);
	        System.out.println("Sample Rate (Hz): " + sampleRate);
	        System.out.println("Language        : " + language);
	    }
	}

	// ------------------- VIDEO FILE -------------------
	class VideoFile extends MediaFile {
	    String videoResolution;
	    String directorName;
	    String aspectRatio;
	    double durationMin;
	    String language;
	    String videoCodec;
	 // Default Constructor
	    VideoFile() {
	        super();
	        System.out.println("VideoFile default constructor");
	        videoResolution = "1280x720";
	        directorName = "Unknown Director";
	        aspectRatio = "16:9";
	        durationMin = 0.0;
	        language = "Unknown";
	        videoCodec = "H.264";
	    }
	    // Parameterized Constructor
	    VideoFile(String fileName, double size, double duration, String format, String fileType,
	              String videoResolution, String directorName, String aspectRatio, double durationMin,
	              String language, String videoCodec) {
	     
	    	super(fileName, size, duration, format, fileType);
	        System.out.println("VideoFile parameterized constructor");
	        this.videoResolution = videoResolution;
	        this.directorName = directorName;
	        this.aspectRatio = aspectRatio;
	        this.durationMin = durationMin;
	        this.language = language;
	        this.videoCodec = videoCodec;
	    }
	    void play() {
	        System.out.println(" Playing a video file...");
	    }
	     String getVideoResolution() {
			return videoResolution;
		}
		 void setVideoResolution(String videoResolution) {
			this.videoResolution = videoResolution;
		}
		 String getDirectorName() {
			return directorName;
		}
		 void setDirectorName(String directorName) {
			this.directorName = directorName;
		}
		 String getAspectRatio() {
			return aspectRatio;
		}
		 void setAspectRatio(String aspectRatio) {
			this.aspectRatio = aspectRatio;
		}
		 double getDurationMin() {
			return durationMin;
		}
		 void setDurationMin(double durationMin) {
			this.durationMin = durationMin;
		}
		 String getLanguage() {
			return language;
		}
		 void setLanguage(String language) {
			this.language = language;
		}
		 String getVideoCodec() {
			return videoCodec;
		}
		 void setVideoCodec(String videoCodec) {
			this.videoCodec = videoCodec;
		}
		void display() {
	        super.display();
	        System.out.println("Video Resolution: " + videoResolution);
	        System.out.println("Director Name   : " + directorName);
	        System.out.println("Aspect Ratio    : " + aspectRatio);
	        System.out.println("Duration (min)  : " + durationMin);
	        System.out.println("Language        : " + language);
	        System.out.println("Video Codec     : " + videoCodec);
	    }
	}

	// ------------------- IMAGE FILE -------------------
	class ImageFile extends MediaFile {
	    String dimensions;
	    int colorDepth;
	    String orientation;
	    int dpi;
	    String filterApplied;
	    String imageFormat;
	 // Default Constructor
	    ImageFile() {
	        super();
	        System.out.println("ImageFile default constructor");
	        dimensions = "800x600";
	        colorDepth = 24;
	        orientation = "Landscape";
	        dpi = 300;
	        filterApplied = "None";
	        imageFormat = "JPEG";
	    }
	    
	    // Parameterized Constructor
	    ImageFile(String fileName, double size, double duration, String format, String fileType,
	              String dimensions, int colorDepth, String orientation, int dpi,
	              String filterApplied, String imageFormat) {
	       
	    	super(fileName, size, duration, format, fileType);
	        System.out.println("ImageFile parameterized constructor");
	        this.dimensions = dimensions;
	        this.colorDepth = colorDepth;
	        this.orientation = orientation;
	        this.dpi = dpi;
	        this.filterApplied = filterApplied;
	        this.imageFormat = imageFormat;
	    }
	    void play() {
	        System.out.println(" Displaying an image file...");
	    }
	     String getDimensions() {
			return dimensions;
		}

		 void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		 int getColorDepth() {
			return colorDepth;
		}

		 void setColorDepth(int colorDepth) {
			this.colorDepth = colorDepth;
		}

		 String getOrientation() {
			return orientation;
		}

		 void setOrientation(String orientation) {
			this.orientation = orientation;
		}

		 int getDpi() {
			return dpi;
		}

		 void setDpi(int dpi) {
			this.dpi = dpi;
		}

		 String getFilterApplied() {
			return filterApplied;
		}

		 void setFilterApplied(String filterApplied) {
			this.filterApplied = filterApplied;
		}

		 String getImageFormat() {
			return imageFormat;
		}

		 void setImageFormat(String imageFormat) {
			this.imageFormat = imageFormat;
		}

		void display() {
	        super.display();
	        System.out.println("Dimensions     : " + dimensions);
	        System.out.println("Color Depth    : " + colorDepth + " bit");
	        System.out.println("Orientation    : " + orientation);
	        System.out.println("DPI            : " + dpi);
	        System.out.println("Filter Applied : " + filterApplied);
	        System.out.println("Image Format   : " + imageFormat);
	    }
	}

	// ------------------- DEMO CLASS -------------------
	class DemoMediaFile {
	    public static void main(String[] args) {
	    	MediaFile m1;//generic reference
	        m1 = new AudioFile("song.mp3", 5.2, 210, "MP3", "Audio",
	                320, 2, "Arijit Singh", 48000, "Hindi");//upcasting
	        m1.play();
	        m1.display();
	        System.out.println("\n");

	     m1 = new VideoFile("movie.mp4", 750.0, 7200, "MP4", "Video",
	                "1920x1080", "Rajkumar Hirani", "16:9", 120.0, "Hindi", "H.265");//upcasting
	     m1.play();
	        m1.display();
	        System.out.println("\n");

	        m1 = new ImageFile("wallpaper.jpg", 2.5, 0, "JPEG", "Image",
	                "1920x1080", 32, "Landscape", 300, "Vintage", "PNG");//upcasting
	        m1.play();
	        m1.display();
	    }
	}


