package org.dexter.generic.media.core;

public class Magazine extends Media{
    private String issue;
    public Magazine(String title,String issue) {
        super(title);
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }
}
