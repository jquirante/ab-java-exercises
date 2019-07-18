import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {

        System.out.println("Enter a radius to calculate the circumference: ");
        Scanner scanner = new Scanner(System.in);

        double radius = Integer.parseInt(scanner.nextLine());

        System.out.println(calcCircumference((radius)));
    }

    public static double calcCircumference(double radius) {

        double circumference = 2 * Math.PI * radius;

        return circumference;
    }
}
