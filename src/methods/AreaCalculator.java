package methods;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate the area of the triangle
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double triangleArea = (base * height) / 2;
        System.out.println("Area of the triangle is: " + triangleArea);

        // Calculate the area of the rectangle
        System.out.println("\nEnter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        System.out.println("Area of the rectangle is: " + rectangleArea);

        // Close the scanner
        scanner.close();
    }
}


 


