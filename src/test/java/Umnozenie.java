/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция умножения, наследуем класс Chisla
public class Umnozenie extends Chisla{

    double sum1;
    public Umnozenie(){}


    public double Sum2() {
        System.out.println("итог операции = "+(sum1=(Number1()*Number2())));
        return  sum1;
    }
}
