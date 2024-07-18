package org.dexter.generic.polygon;

import org.dexter.generic.polygon.core.DrawPolygon;
import org.dexter.generic.polygon.core.Pentagon;
import org.dexter.generic.polygon.core.Triangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        DrawPolygon<Triangle> drawTriangle = new DrawPolygon<>();
        drawTriangle.addPolygon(new Triangle(2,3,10));
        Triangle triangle = drawTriangle.getDrawing();
        System.out.println( "The area : "+ triangle.Area());
        System.out.println( "The perimeter : "+ triangle.Perimeter());

        DrawPolygon<Pentagon> drawPentagon = new DrawPolygon<>();
        drawPentagon.addPolygon(new Pentagon(3,5,20));
        Pentagon pentagon = drawPentagon.getDrawing();
        System.out.println( "The area : "+ pentagon.Area());
        System.out.println( "The perimeter : "+ pentagon.Perimeter());


    }
}
