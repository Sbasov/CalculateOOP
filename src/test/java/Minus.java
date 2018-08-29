/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция Вычитания, наследуем класс Chisla
public class Minus extends Chisla{

    double sum1;
    public Minus(){}


    public double Sum2() {
        System.out.println("Итог операции = "+(sum1=(Number1()-Number2())));
        return  sum1;
    }
}
