

import static java.lang.Math.*;

public class Derivative  {
    public double der1 (double x){
        return 0.44*pow(exp(1),-1.7*0.44)-cos(x*0.44+1.7)*(1/(2*sqrt(x+1.7*0.44)));
    }
    public double der2 (double x){
        return 1.7*pow(0.44,2)*cos(x*pow(0.44,2)*cos(0.88));
    }
}
