package org.dexter.generic.media.core;

public class DVD extends  Media{
    private int duration;
    public DVD(String title, int duration) {
        super(title);
        this.duration =duration;
    }

    public int getDuration() {
        return duration;
    }
}
