import java.util.Arrays;
import java.util.HashMap;

public class IfPractice {
    public static void main(String[] args){
        grade(2.5);
    }
    public static void grade(double grade){
        HashMap<Double, String> grades = new HashMap<Double, String>();
        grades.put(3.7,"A");
        grades.put(3.3,"A-/B+");
        grades.put(2.9,"B");
        grades.put(2.4,"B-/C+");
        grades.put(1.9,"C");
        grades.put(1.45,"C-/D+");
        grades.put(1.0,"D");
        grades.put(0.5,"D-/E+");

        for (double i : Arrays.asList(3.7, 3.3, 2.9, 2.4, 1.9, 1.45, 1.0, 0.5)){
            boolean run = true;
            if (run) {
                if (grade >= i) {
                    run = false;
                    System.out.print(run);
                    System.out.print(grades.get(i));
                }
            }
        }
    }
}
