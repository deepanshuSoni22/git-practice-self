import java.util.Scanner;

public class Main {
    // a method to print table of a number
    private static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Setup");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int number = scanner.nextInt(); 
        printTable(number);
    }
}