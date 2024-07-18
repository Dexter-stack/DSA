package org.dexter.generic.polygon.core;

import java.util.ArrayList;
import java.util.List;

public class DrawPolygon<T extends Polygon> {

    public T drawing;


    public void addPolygon(T polygon){
        drawing =polygon;
    }

    public T getDrawing(){
        return drawing;
    }


}
