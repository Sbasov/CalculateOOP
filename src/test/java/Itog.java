/**
 * Created by Stepan on 26.08.2018.
 * @author Basov Stepan
 * @version 1.6
 */

//Реализовываем работу калькулятора
import java.util.Scanner;

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
                    //Операция сложения из класса Summa
                    summa.Sum2();
                    break;

                case 2:
                    //Операция вычитания из класса Minus
                    minus.Sum2();
                    break;
                case 3:
                    //Операция умножения из класса Umnozenie
                    umnozenie.Sum2();
                break;
                case 4:
                    //Операция деления из класса Delenie
                    delenie.Sum2();
                    break;
                default:
                    System.out.println("Нет такой операции");

            }
        }
    }
}
