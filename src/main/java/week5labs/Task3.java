package week5labs;

public class Task3 {
    public static void main(String[] args) {
        // gotta add code here, too lazy
    }
}

// LibraryItem class
class LibraryItem {
    private String id;
    private String title;
    private int year;

    // constructors
    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // method to get the summary
    public String getSummary() {
        return "[" + id + "]" + title + " (" + year + ")";
    }
}

// subclass Book
class Book extends LibraryItem {
    private String author;
    private String genre;

    // constructors
    public Book(String id, String title, int year, String author, String genre) {
        super(id, title, year);
        this.author = author;
        this.genre = genre;
    }

    // getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // override getSummary()
    @Override
    public String getSummary() {
        return super.getSummary() + " - " + author + " (" + genre + ")";
    }
}

// dvd subclass
class DVD extends LibraryItem {
    private String director;
    private int duration;

    // constructors
    public DVD(String id, String title, int year, String director, int duration) {
        super(id, title, year);
        this.director = director;
        this.duration = duration;
    }

    // getters and setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // override getSummary()
    @Override
    public String getSummary() {
        return super.getSummary() + " - Directed by " + director + ", Duration: " + duration + " mins";
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    // constructors
    public Magazine(String id, String title, int year, int issueNumber, String month) {
        super(id, title, year);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    // getters and setters
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber() {
        this.issueNumber = issueNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    // override getSummary()
    @Override
    public String getSummary() {
        return super.getSummary() + " - Issue #" + issueNumber + " (" + month + ")";
    }
}
