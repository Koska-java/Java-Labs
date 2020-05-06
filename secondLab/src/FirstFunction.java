import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.StrictMath.exp;
import static java.lang.StrictMath.sqrt;

public class FirstFunction implements Function{
    private final Function a, b;

    public FirstFunction(Function a, Function b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return pow(exp(1),-(b.calculate(x)*0.44))*sin(a.calculate(x)*0.44+b.calculate(x))-sqrt(b.calculate(x)*0.44+a.calculate(x));
    }

    @Override
    public Function derivative() {
        return new FirstFunction(a.derivative(), b.derivative());
    }

}
