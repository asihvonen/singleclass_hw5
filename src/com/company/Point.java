package com.company;

public class Point
{
    //methods
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString ()
    {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public boolean onXaxis ()
    {
        return y == 0;
    }

    public boolean sameCoordinate (Point p)
    {
        return (x == p.x) && (y == p.y);
    }

    public double distance (Point p)
    {
        double distance = (Math.sqrt (Math.pow((x - p.x), 2)
                        + Math.pow(Math.sqrt(y - p.y), 2)));
        return distance;
    }

    public boolean onUnitCircle ()
    {
        return (Math.sqrt(x) + Math.sqrt(y)) == 1;
    }

    public Point midpoint (Point p)
    {
        return new Point ((x + p.x) / 2, (y + p.y) / 2);
    }

    //fields
    private double x, y;
}
