import static java.lang.Math.*;

public class Сalculation {
    final static double a = -0.5;
    final static double t = 0.44;
    final static double b = 1.7;
    final static double e = 2.71;

    /*final static void print_param(double a, double t, double b) {
        System.out.println(Main.ANSI_RED+"Вы ввели : " + "\n" + "a = " + a + "\n" + "t = " + t + "\n" + "b = " + b + "\n");
    }*/

    double calc_first(double a, double t, double b) {
        double func = pow(e,-b*t)*sin(a*t+b)-sqrt(abs(b*t+a));
        return func;
    }

    double calc_second(double a, double t, double b) {
        double func = b*sin(a*pow(t,2)*cos(2*t))-1;
        return func;
    }

    void printall_res(double a, double t, double b) {
        System.out.println(Main.ANSI_RED+"Вы ввели : " + "\n" + "a = " + a + "\n" + "t = " + t + "\n" + "b = " + b + "\n");
        System.out.println("Результат расчета первой функции :  " +  calc_first( a,  t,  b));
        System.out.println("Результат расчета второй функции :  " + calc_second( a,  t,  b));
    }

    void results() {
        System.out.println(Main.ANSI_BLUE + "Результат расчета первой функции :  " + calc_first(a, t, b));
        System.out.println(Main.ANSI_BLUE + "Результат расчета первой функции :  " + calc_second(a, t, b));
    }

    void print_default_param() {
        System.out.println(Main.ANSI_RESET+"Параметры по умолчанию : " + "\n" + "a = " + a + "\n" + "t = " + t + "\n" + "b = " + b + "\n");
    }
}
