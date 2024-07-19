package org.dexter.ArrayD.Game.core;

public class Entry {

    private String name;
    private int score;

    public Entry(String name, int s){

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }



    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
