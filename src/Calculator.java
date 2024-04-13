import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello! A szamologep program elindult.");

        while (true) {
            System.out.println("Adj meg egy számot: ");

            Scanner input = new Scanner(System.in);
            int a = input.nextInt();

            System.out.println("Adj meg még egy számot: ");
            int b = input.nextInt();

            System.out.println("Adj meg egy operátort (+ - * uncsi): ");
            String operator = input.nextLine();
            operator = input.nextLine();

            System.out.println("Az 1. szám:  " + a);
            System.out.println("A  2. szám:  " + b);
            System.out.println("Az operátor: " + operator);

            if ("+".equals(operator)) {
                int sum = a + b;
                System.out.println("Összeg: " + sum);
            } else if ("-".equals(operator)) {
                int diff = a - b;
                System.out.println("Különbség: " + diff);
            } else if ("*".equals(operator)) {
                int result = a * b;
                System.out.println("Szorzat: " + result);
            } else if ("uncsi".equals(operator)) {
                break;
            } else {
                System.out.println("Buta vagy.");
            }
        }

        System.out.println("Viszont látásra!");
    }
}