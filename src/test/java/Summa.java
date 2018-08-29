/**
 * Created by Basov Stepanon 26.08.2018.
 */

import java.util.Scanner;

//операция сложения, наследуем класс Chisla
public class Summa extends Chisla{

    double sum1;
    public Summa(){}


    public double Sum2() {
        System.out.println("Итог операции = "+(sum1=(Number1()+Number2())));
        return  sum1;
    }
}
