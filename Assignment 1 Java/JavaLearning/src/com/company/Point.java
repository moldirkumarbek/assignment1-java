package com.company;

public class Point
{
    private int x;
    private int y;
    private int id;
    private static int id_gen = 1;
    public Point()
    {
        id = id_gen++;
    }
    public Point(int x, int y)
    {
        this();
        this.x = x;
        this.y = y;
    }
    public Point(String line)
    {
        this();
        String[] splittedLine = line.split(",");
        this.x = Integer.parseInt(splittedLine[0]);
        this.y = Integer.parseInt(splittedLine[1]);
    }
    public int getId()
    {
        return id;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setId(int id) { this.id = id; }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public double calculateDistance(Point anotherPoint)
    {
        return Math.sqrt(Math.pow((this.x - anotherPoint.x),2) + Math.pow((this.y - anotherPoint.y),2));
    }
    @Override
    public String toString()
    {
        return id + ")x = " + x + ", y = " + y;
    }
}

