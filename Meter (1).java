import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();
        double feet = meters * 3.2786;
        System.out.println(meters + " meters is " + feet + " feet");
    }
}