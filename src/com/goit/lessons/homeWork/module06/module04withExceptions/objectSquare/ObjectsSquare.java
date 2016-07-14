package com.goit.lessons.homeWork.module06.module04withExceptions.objectSquare;


public class ObjectsSquare {

    public static void main(String[] args) throws Exception{

        try(
                Triangle triangle = new Triangle();
                ) {triangle.square(-8,7);}
        catch (IllegalArgumentException e)
        {System.err.println("[ERROR]: Some triangle side value is negative");}

        try (
                Rectangle rectangle = new Rectangle();
                ){rectangle.square(5,-6);}
        catch (IllegalArgumentException e)
        {System.err.println("[ERROR]: Some rectangle side value is negative");}

        try(
                Circle circle = new Circle();
                ){circle.square(8);}
        catch (IllegalArgumentException e)
        {System.err.println("[ERROR]: Circle radius is negative");}
    }
}





