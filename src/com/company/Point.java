package com.company;

public class Point
{
    //methods
    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString ()
    {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public boolean onXaxis (Point point)
    {
        return point.y == 0;
    }

    public boolean sameCoordinate (Point point, int[] coordinates)
    {
        return (point.x == coordinates[0]) && (point.y == coordinates[1]);
    }

    public double distance (Point point, int[] coordinates)
    {
        double distance = (Math.sqrt (Math.pow((point.y - coordinates[0]), 2)
                        + Math.pow(Math.sqrt(point.y - coordinates[1]), 2)));
        return distance;
    }

    public boolean onUnitCircle (Point point)
    {
        return (Math.sqrt(x) + Math.sqrt(y)) == 1;
    }

    public int[] midpoint (Point point, int[] coordinates)
    {
        int[] midpoint = {(point.x + coordinates[0]) / 2, (point.y + coordinates[1]) / 2};
        return midpoint;
    }

    //fields
    private int x, y;
}
