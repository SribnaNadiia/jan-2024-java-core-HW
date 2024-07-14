package HW1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Book {
    // title
    private String title;
    // pages
    private BigDecimal pages;
    // [String] Authors  "John Doe"
    private ArrayList<String> auhors;
    // genre
    private String genre;

    public Book (String title, BigDecimal pages){
        this.title = title;
        this.pages = pages;
        auhors = new ArrayList<>();
    }
    public Book(String title, BigDecimal pages, ArrayList<String> auhors, String genre) {
        this.title = title;
        this.pages = pages;

        this.genre = genre;
    }

//    Getters


    public String getTitle() {
        return title;
    }

    public ArrayList<String> getAuhors() {
        return auhors;
    }

    public BigDecimal getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

//    Setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuhors(String auhor) {
        auhors.add(auhor);
    }

    public void removeAuhors(String auhor) {
        auhors.remove(auhor);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(BigDecimal pages) {
        this.pages = pages;
    }
}
