import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Find the biggest of two numbers \n");
        System.out.print("Enter the first number: ");
        double num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(calcBiggerNumber(num1,num2));
    }

    public static String calcBiggerNumber(double num1, double num2) {
        return "The bigger number is " + Math.max(num1, num2);
    }
}
