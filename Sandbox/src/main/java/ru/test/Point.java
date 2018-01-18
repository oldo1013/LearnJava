package ru.test;

public class Point {
   public int x;
   public int y;


   public Point(int x,int y) {
       this.x = x;
       this.y = y;
   }

    public static double distance (Point p1,Point p2) {
        double result = Math.sqrt(Math.pow((p2.x - p1.x), 2) + (Math.pow((p2.y - p1.y), 2)));
        return result;
    }
}

