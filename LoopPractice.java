public class LoopPractice {
    public static void main(String[] args){
        //countUp();
        //countDown();
        hello();
    }
    public static void countUp() {
        int num = 1;
        while (num<5) {
            System.out.println(num);
            num++;
        }
    }
    public static void countDown() {
        int numTwo;
        numTwo=9;
        while (5 <= numTwo) {
            System.out.println(numTwo);
            numTwo--;
        }
    public static void hello() {
        int numThree = 1;
        while (numThree <= 5){
            System.out.println("Hello " + (numThree * 2));
            numThree++;
            }
        }
    }
}
