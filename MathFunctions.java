import java.beans.PropertyEditorSupport;

/**
 *
 * AP Comp Sci A, Fall 2022
 * iDea HS
 * @author Daniel
 * @version Oct 18 2022
 *
 */
public class MathFunctions {
    public static void main(String[] args) {
        double result = powerFunction(3, 3);
        System.out.print(result);
    }
    static double powerFunction(double base,int exponent){
        int result = 1;
        for(int i = exponent; i>0;i--){
            result*=base;
        }
        return result;
    }
}
