package org.dexter.generic.media.core;

public abstract class Media {

    private String title;

    public Media(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
