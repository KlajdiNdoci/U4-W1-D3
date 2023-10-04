package src;

import src.entities.Rectangle;


public class Exercise1 {
    public static void main(String[] args) {




 Rectangle firstRectangle = new Rectangle(12,10);

firstRectangle.printRectangle();

        Rectangle secondRectangle = new Rectangle(15.4,12.3);

        printTwoRectangles(firstRectangle, secondRectangle);


    }

    public static void printTwoRectangles(Rectangle firstRectangle, Rectangle secondRectangle) {

        System.out.println("First rectangle:");
        firstRectangle.printRectangle();

        System.out.println("Second rectangle:");
        secondRectangle.printRectangle();

        double sumAreas = firstRectangle.calcRectangleArea() + secondRectangle.calcRectangleArea();
        double sumPerimeters = firstRectangle.calcRectanglePerimeter() + secondRectangle.calcRectanglePerimeter();

        System.out.println("rectangles areas sum: " + sumAreas);
        System.out.println("rectangles perimeters sum: " + sumPerimeters);
    }
}

