package Lecture9;

public class EBook extends Book {
    private String downloadSite;
    private int sizeMB;

    public EBook(String title, String author, String ISBN, String URL, int sizeMB) {
        super(title, author, ISBN);
        this.downloadSite = URL;
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", web address=%s, size=%d", this.downloadSite, this.sizeMB);
    }

    public String getDownloadSite() {
        return this.downloadSite;
    }

    public int getSizeMB() {
        return this.sizeMB;
    }
}
