import static java.lang.System.*;

public class AnotherLoop {
    public static void main(String[] args) {
      int lineAmount=30;
      pyrimid(lineAmount);
    }
    public static void pyrimid(int lineAmount){
        for(int i = 1; i<=lineAmount; i++){
            if (i != 0) {
                out.print(" ".repeat(2*lineAmount-2*i));
            }
            out.print("*".repeat(i));
            out.print("//");
            out.print("X".repeat(i*2));
            out.print("\\\\");
            out.println("*".repeat(i));
        }
    }
}
