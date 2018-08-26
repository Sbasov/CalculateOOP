import java.util.Scanner;

/**
 * Created by User on 26.08.2018.
 */


public class Chisla implements Calc {
    double a;
    double b;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double Number1() {

        System.out.println("Введите первое число = ");
        a = scanner.nextDouble();
        return a;
    }

    @Override
    public double Number2() {

        System.out.println("Введите второе число = ");
        b = scanner.nextDouble();
        return b;
    }
}
