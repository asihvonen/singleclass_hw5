package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point (5, 7);
        Point p2 = new Point (-2, 3);
        System.out.println (p1);
        System.out.println (p1.midpoint(p2));
    }
}
