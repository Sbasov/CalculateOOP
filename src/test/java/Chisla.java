import java.util.Scanner;

/**
 * Created by Basov Stepan on 26.08.2018.
 */

//Имплементируем интерфейс
public class Chisla implements Calc {
    double a;
    double b;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double Number1() {
//вводим с клавиатуры первое число
        System.out.println("Введите первое число = ");
        a = scanner.nextDouble();
        return a;
    }

    @Override
    public double Number2() {
//Вводим с клавиатуры второе число
        System.out.println("Введите второе число = ");
        b = scanner.nextDouble();
        return b;
    }
}
