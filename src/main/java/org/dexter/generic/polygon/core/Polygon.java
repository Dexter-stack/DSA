package org.dexter.generic.polygon.core;

public abstract class Polygon {

    private long radius;
    private long sides;

    private long length;

    public Polygon(long radius, long sides, long length){
        this.length = length;
        this.radius = radius;
        this.sides = sides;
    }

    public long getRadius() {
        return radius;
    }

    public long getSides() {
        return sides;
    }

    public long getLength() {
        return length;
    }

    public long Area(){
        return (sides/2)*length*radius;
    }

    public  long Perimeter(){
        return sides*length;
    }


}
