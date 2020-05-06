import static java.lang.Math.*;

public class SecondFunction implements Function {
    private final Function a, b;

    public SecondFunction(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return b.calculate(x)*sin(a.calculate(x)*pow(0.44,2)*cos(2*0.44))-1;
    }

    @Override
    public Function derivative() {
        return new SecondFunction(a.derivative(), b.derivative());
    }
}
