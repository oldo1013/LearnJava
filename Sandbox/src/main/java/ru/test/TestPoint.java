package ru.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;

public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point(4, 3);
        Point p2 = new Point(1, 1);
        System.out.println(Point.distance(p1,p2));
    }
}
