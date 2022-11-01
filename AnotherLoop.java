import static java.lang.System.*;

public class AnotherLoop {
    public static void main(String[] args) {
      int lineAmount=5;
      pyrimid(lineAmount);
    }
    public static void pyrimid(int lineAmount){
        for(int i = 1; i<=lineAmount; i++){
            if (4 - (2 * (int)i) >=0){
                out.print(" ".repeat(4-(2*((int)i))));
            }
            out.print("*".repeat((int)i));
            out.print("//");
            out.print("X".repeat((int)i*2));
            out.print("\\\\");
            out.println("*".repeat((int)i));
        }
    }
}
