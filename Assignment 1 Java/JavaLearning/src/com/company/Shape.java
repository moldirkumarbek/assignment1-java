package com.company;
import java.util.ArrayList;
public class Shape
{
    ArrayList<Point> list;
    Shape()
    {
        list = new ArrayList<>();
    }
    public void addPoint(Point point)
    {
        list.add(point);
    }
    public void getPoints()
    {
        for (Point point : list)
        {
            System.out.println(point.toString() + "\n");
        }
    }
    public double calculatePerimeter()
    {
        double perimeter = 0;
        for (int i = 0;i < list.size() - 1;i++)
        {
            perimeter += list.get(i).calculateDistance(list.get(i + 1));
        }
        perimeter += list.get(list.size() - 1).calculateDistance(list.get(0));
        return perimeter;
    }
    public void printPerimeter()
    {
        System.out.println("Shape's perimeter : " + String.format("%.3f",this.calculatePerimeter()) + "\n");
    }
}
