import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        printSquaresFromZero(10);

        try {
            System.out.println(factorial(5));
            System.out.println(factorial(6));
            System.out.println(factorial(10));
            System.out.println(factorial(0));
            System.out.println(factorial(-3));
        } catch (ArithmeticException e) {
            System.out.println("ajajjj baj van: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("ajajjj baj van: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ajajjj baj van: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }

        for (int i = 0; i < 50; i++) {
            System.out.println( i + " factorial:" + factorial(i));
        }

        System.out.println("hehe sikereseen lefutott a progi");
    }

    static void printSquaresFromZero(int limit) {
        for (int i = 0; i <= limit; i++) {
            System.out.println(i * i);
        }
    }

    static long factorial(int number) {

        if (number == 0) {
            return 0;
        }

        if (number < 0) {
            throw new RuntimeException("Number must be a positive integer");
        }

        long res = 1;

        for (int i = number; i > 1; i--) {
//            System.out.println("res = " + res + " * " + i);
            res = res * i;
//            System.out.println("new result is: " + res);
//            System.out.println("====================");
        }

        return res;
    }
}
