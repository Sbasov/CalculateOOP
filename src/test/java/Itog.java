import java.util.Scanner;

/**
 * Created by User on 26.08.2018.
 */
public class Itog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Summa summa = new Summa();
        Minus minus= new Minus();
        Umnozenie umnozenie=new Umnozenie();
        Delenie delenie=new Delenie();
        System.out.println("Калькулятор");
        {//Выводим на экран возможные действия
            System.out.println("Выберете действие: 1-Сложение, 2 - Вычитание, 3-Умножение, 4 - Деление");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    summa.Sum2();
                    break;

                case 2:
                    minus.Sum2();
                    break;
                case 3:
                    umnozenie.Sum2();
                break;
                case 4:
                    delenie.Sum2();
                    break;
                default:
                    System.out.println("Нет такой операции");

            }
        }
    }
}
