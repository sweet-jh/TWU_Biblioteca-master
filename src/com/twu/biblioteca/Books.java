package com.twu.biblioteca;

/**
 * Created by hjing on 4/24/16.
 */
public class Books {
    private String name;
    private String author;
    private int yearPublished;
    private boolean status=true;

    Books(String name,String author,int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String displayDetail() {
        String detail = this.name+"    "+this.author+"    "+this.yearPublished+"\n";
        return detail;
    }

    public void setStatus(boolean c) {
        status = c;
    }

    public boolean getStatus() {
        return status;
    }

}
