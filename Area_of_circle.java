import java.util.Scanner; // Importing scanner class for taking input from user

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // code that uses the 'input' object
        System.out.println("Enter radius of Circle :");
        // Corrected the method name and parsing the input to float
        float r = Float.parseFloat(input.nextLine()); 
        input.close();
        final float pi = 3.14f;
        float area = pi * r * r;
        // Combined the print statements for clarity
        System.out.println("Area of Circle with given radius " + r + " is " + area);
    }
}