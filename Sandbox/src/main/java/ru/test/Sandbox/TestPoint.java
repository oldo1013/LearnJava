package ru.test.Sandbox;

public class TestPoint {

    public static void main(String[] args) {
        ru.test.Sandbox.Point p1 = new ru.test.Sandbox.Point(4, 3);
        ru.test.Sandbox.Point p2 = new ru.test.Sandbox.Point(1, 1);
        System.out.println(ru.test.Sandbox.Point.distance(p1,p2));
    }
}
