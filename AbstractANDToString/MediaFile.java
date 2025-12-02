package AbstractANDToString;

abstract class MediaFile {
    String fileName;
    double size; // in MB
    double duration; // in seconds
    String format;
    String fileType;

    // Default Constructor
    MediaFile() {
        System.out.println("MediaFile default constructor");
        this.fileName = "Unknown";
        this.size = 0.0;
        this.duration = 0.0;
        this.format = "Unknown";
        this.fileType = "Unknown";
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

    abstract void play();

    String getFileName() { return fileName; }
    void setFileName(String fileName) { this.fileName = fileName; }
    double getSize() { return size; }
    void setSize(double size) { this.size = size; }
    double getDuration() { return duration; }
    void setDuration(double duration) { this.duration = duration; }
    String getFormat() { return format; }
    void setFormat(String format) { this.format = format; }
    String getFileType() { return fileType; }
    void setFileType(String fileType) { this.fileType = fileType; }

    public String toString() {
        return "\nFileName::" + fileName + " Size::" + size + " Duration::" + duration +
               " Format::" + format + " FileType::" + fileType;
    }
}

// ------------------- AudioFile -------------------
class AudioFile extends MediaFile {
    int bitRange;
    int audioChannel;
    String artistName;
    int sampleRate;
    String language;

    AudioFile() {
        super();
        System.out.println("AudioFile default constructor");
        this.bitRange = 128;
        this.audioChannel = 2;
        this.artistName = "Unknown Artist";
        this.sampleRate = 44100;
        this.language = "Unknown";
    }

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

    int getBitRange() { return bitRange; }
    void setBitRange(int bitRange) { this.bitRange = bitRange; }
    int getAudioChannel() { return audioChannel; }
    void setAudioChannel(int audioChannel) { this.audioChannel = audioChannel; }
    String getArtistName() { return artistName; }
    void setArtistName(String artistName) { this.artistName = artistName; }
    int getSampleRate() { return sampleRate; }
    void setSampleRate(int sampleRate) { this.sampleRate = sampleRate; }
    String getLanguage() { return language; }
    void setLanguage(String language) { this.language = language; }

    public String toString() {
        return super.toString() + " BitRange::" + bitRange + " AudioChannel::" + audioChannel +
               " ArtistName::" + artistName + " SampleRate::" + sampleRate + " Language::" + language;
    }
}

// ------------------- VideoFile -------------------
class VideoFile extends MediaFile {
    String videoResolution;
    String directorName;
    String aspectRatio;
    double durationMin;
    String language;
    String videoCodec;

    VideoFile() {
        super();
        System.out.println("VideoFile default constructor");
        this.videoResolution = "1280x720";
        this.directorName = "Unknown Director";
        this.aspectRatio = "16:9";
        this.durationMin = 0.0;
        this.language = "Unknown";
        this.videoCodec = "H.264";
    }

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
        System.out.println("Playing a video file...");
    }

    String getVideoResolution() { return videoResolution; }
    void setVideoResolution(String videoResolution) { this.videoResolution = videoResolution; }
    String getDirectorName() { return directorName; }
    void setDirectorName(String directorName) { this.directorName = directorName; }
    String getAspectRatio() { return aspectRatio; }
    void setAspectRatio(String aspectRatio) { this.aspectRatio = aspectRatio; }
    double getDurationMin() { return durationMin; }
    void setDurationMin(double durationMin) { this.durationMin = durationMin; }
    String getLanguage() { return language; }
    void setLanguage(String language) { this.language = language; }
    String getVideoCodec() { return videoCodec; }
    void setVideoCodec(String videoCodec) { this.videoCodec = videoCodec; }

    public String toString() {
        return super.toString() + " VideoResolution::" + videoResolution + " Director::" + directorName +
               " AspectRatio::" + aspectRatio + " DurationMin::" + durationMin +
               " Language::" + language + " VideoCodec::" + videoCodec;
    }
}

// ------------------- ImageFile -------------------
class ImageFile extends MediaFile {
    String dimensions;
    int colorDepth;
    String orientation;
    int dpi;
    String filterApplied;
    String imageFormat;

    ImageFile() {
        super();
        System.out.println("ImageFile default constructor");
        this.dimensions = "800x600";
        this.colorDepth = 24;
        this.orientation = "Landscape";
        this.dpi = 300;
        this.filterApplied = "None";
        this.imageFormat = "JPEG";
    }

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
        System.out.println("Displaying an image file...");
    }

    String getDimensions() { return dimensions; }
    void setDimensions(String dimensions) { this.dimensions = dimensions; }
    int getColorDepth() { return colorDepth; }
    void setColorDepth(int colorDepth) { this.colorDepth = colorDepth; }
    String getOrientation() { return orientation; }
    void setOrientation(String orientation) { this.orientation = orientation; }
    int getDpi() { return dpi; }
    void setDpi(int dpi) { this.dpi = dpi; }
    String getFilterApplied() { return filterApplied; }
    void setFilterApplied(String filterApplied) { this.filterApplied = filterApplied; }
    String getImageFormat() { return imageFormat; }
    void setImageFormat(String imageFormat) { this.imageFormat = imageFormat; }

    public String toString() {
        return super.toString() + " Dimensions::" + dimensions + " ColorDepth::" + colorDepth +
               " Orientation::" + orientation + " DPI::" + dpi + " Filter::" + filterApplied +
               " ImageFormat::" + imageFormat;
    }
}

// ------------------- DemoMediaFile -------------------
class DemoMediaFile {
    public static void main(String[] args) {
        MediaFile m1; // generic reference

        m1 = new AudioFile("song.mp3", 5.2, 210, "MP3", "Audio",
                320, 2, "Arijit Singh", 48000, "Hindi"); // upcasting
        System.out.println(m1.toString());
        System.out.println(m1);
        System.out.println("\n");

        m1 = new VideoFile("movie.mp4", 750.0, 7200, "MP4", "Video",
                "1920x1080", "Rajkumar Hirani", "16:9", 120.0, "Hindi", "H.265"); // upcasting
        System.out.println(m1.toString());
        System.out.println(m1);
        System.out.println("\n");

        m1 = new ImageFile("wallpaper.jpg", 2.5, 0, "JPEG", "Image",
                "1920x1080", 32, "Landscape", 300, "Vintage", "PNG"); // upcasting
        System.out.println(m1.toString());
        System.out.println(m1);
    }
}
