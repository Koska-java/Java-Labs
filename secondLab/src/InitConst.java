

public class InitConst implements Function {
    private final double value;

    public InitConst(double value) {
        this.value = value;
    }

    @Override
    public double calculate(double x) {
        return value;
    }

    @Override
    public Function derivative() {
        return ZERO;
    }

    public static final InitConst ZERO = new InitConst(0);

}
