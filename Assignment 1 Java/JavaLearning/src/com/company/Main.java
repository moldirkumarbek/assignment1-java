package com.company;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Shape shape = new Shape();


            File pointFile = new File("file1.txt");
            if (pointFile.exists() == false)
            {
                pointFile.createNewFile();
            }
            FileWriter writer = new FileWriter("file1.txt");
            writer.write("3,9\n8,7\n-12,4\n-6,-2\n-4,-6\n2,-8\n6,-5\n10,-3\n8,5\n4,8\n");
            writer.flush();

            Scanner scanner = new Scanner(pointFile);
            while(scanner.hasNext())
            {
                shape.addPoint(new Point(scanner.nextLine()));
            }
            shape.getPoints();
            shape.printPerimeter();


        }
        catch(Exception error)
        {
            System.out.println(error.getMessage());
        }
    }
}
