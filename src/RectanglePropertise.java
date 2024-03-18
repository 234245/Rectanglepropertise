import java.util.Scanner;
public class RectanglePropertise{
public static void main(String[] args) {

    scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    double length = scanner.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    double width = scanner.nextDouble();
    scanner.close();
    double area = length * width;
    double perimeter = 2 * (length + width);
    double diagonal = Math.sqrt(length * length + width * width);
    System.out.println("Area of the rectangle: " + area);
    System.out.println("Perimeter of the rectangle: " + perimeter);
    System.out.println("Length of the diagonal: " + diagonal);
}

}
