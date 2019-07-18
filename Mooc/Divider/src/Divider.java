import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        double num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Type another number: ");
        double num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(divide(num1, num2));

    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;

        return result;
    }
}
