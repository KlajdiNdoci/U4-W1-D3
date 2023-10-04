package src.entities;

import org.w3c.dom.css.Rect;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }

    //GETTERS
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
//SETTERS


    public void setHeight(double height) {
        if (height > 1) {
        this.height = height;
        } else {
            System.out.println("immetti un numero maggiore di 1");
        }
    }
    public void setWidth(double width) {
        if (width > 1) {
        this.width = width;
        } else {
            System.out.println("immetti un numero maggiore di 1");
        }
    }

    public double calcRectanglePerimeter() {
        return (height * 2) + (width * 2);
    }

    public double calcRectangleArea() {
        return height * width;
    }

    public void printRectangle() {
        double area = calcRectangleArea();
        double perimeter = calcRectanglePerimeter();

        System.out.println("rectangle area: " + area);
        System.out.println("rectangle perimeter: " + perimeter);

    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
