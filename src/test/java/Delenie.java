/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция деления, наследуем класс Chisla
public class Delenie extends Chisla{

    double sum1;
    public Delenie(){}


    public double Sum2() {
        System.out.println("итог операции = "+(sum1=(Number1()/Number2())));
        return  sum1;
    }
}
