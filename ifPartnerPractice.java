import java.text.DecimalFormat;
import java.util.Scanner;
public class ifPartnerPractice {
    public static final DecimalFormat money = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What temperature is it?: ");
        int temp = Integer.parseInt(console.nextLine());
        bikeWeather(temp);
        proceed();

        System.out.print("What is your id number: ");
        int number = console.nextInt();
        getID(number);
        proceed();

        System.out.print("Whats the coordinate pair: ");
        System.out.println();
        double numOne = console.nextDouble();
        double numTwo = console.nextDouble();
        System.out.println(quadrant(numOne,numTwo));
        proceed();

        System.out.println("What is the first coordinate pair?");
        double xcoordOne = console.nextDouble();
        double ycoordOne = console.nextDouble();
        System.out.println("What is the second coordinate pair?");
        double xcoordTwo = console.nextDouble();
        double ycoordTwo = console.nextDouble();
        sameQuad(xcoordOne,ycoordOne,xcoordTwo,ycoordTwo);
        proceed();

        System.out.println("All Together: " + wordBuilder(4));
        proceed();

        System.out.print("How many items?: ");
        int amount = console.nextInt();
        System.out.println();
        billTotal(amount);
        proceed();

        int partySize = 0;
        System.out.print("How big is the party?");
        partySize += console.nextInt();
        mandatoryTip(partySize);
    }
    public static void proceed(){
        Scanner input = new Scanner(System.in);
        System.out.print("Press enter to proceed");
        String cont = input.nextLine();
        while(!cont.equals("")) {
            cont = input.nextLine();
        }
        space();
    }
    public static void space(){
        for(int i = 0; i <= 3; i++) System.out.println();
    }
    public static void bikeWeather(int temp){
        if(temp > 80){
            System.out.println("It's too hot, but still biking weather");
        } else if (temp>40) {
            System.out.println("Nice biking weather");
        } else if (temp<40) {
            System.out.println("Brrrrr, but still bike weather");
        }
    }
    public static void getID(int number) {
        if (number < 99999) System.out.println(-1);
        else if (number >10000000) System.out.println(-1);
        else {
            System.out.println(number);
        }
    }
    public static String quadrant(double xcoord, double ycoord){
        boolean negativex;
        boolean negativey;
        String output;
        if(xcoord<0){
            negativex = true;
        }else{
            negativex = false;
        }
        if(ycoord<0){
            negativey = true;
        }else{
            negativey = false;
        }
        if (negativex){
            if(negativey){
                output = "Quad 3";
                return output;
            }
            else{
                output = "Quad 2";
                return output;            }
        }else{
            if(negativey){
                output = "Quad 4";
                return output;
            }
            else{
                output = "Quad 1";
                return output;
            }
        }
    }
    public static void sameQuad(double xcoordOne, double ycoordOne, double xcoordTwo, double ycoordTwo){
        if(quadrant(xcoordOne,ycoordOne).equals(quadrant(xcoordTwo,ycoordTwo))){
            System.out.println("They are in the same quadrant");
        }else{
            System.out.println("They arent in the same quadrant");
        }
    }
    public static String wordBuilder(int numberOfItems) {
        String word = "";
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < numberOfItems; i++){
            System.out.print("Item " + (i+1) + " name: ");
            word += console.nextLine();
            System.out.println();
        }
        return word;
    }
    public static void billTotal(int itemAmount){
        Scanner console = new Scanner(System.in);
        double total = 0;
        for(int i = 0; i<itemAmount; i++){
            System.out.print("item " + (i+1) + " price: ");
            total += console.nextDouble();
            System.out.println();
        }
        System.out.println("Total: $" + money.format(total));

    }
    public static void mandatoryTip(int partySize){
        double total = 0;
        double tipAmount = 0;
        Scanner console = new Scanner(System.in);
        for(int i = 0; i<partySize; i++){
            System.out.print("Person " + i + ": " );
            total += console.nextDouble();
            System.out.println();
        }
        if(partySize>=4){
            total *= 1.15;
        }else{
            System.out.print("Would you like to add a tip?: ");
            String input = console.next();
            System.out.println();
            if(input.equals("yes")){
                System.out.print("How much (In decimal): ");
                tipAmount = console.nextDouble();
                tipAmount += 1;
                System.out.println(total + " " + tipAmount);
                total *= tipAmount;
            }
        }
        System.out.println("Each person owes $" + (money.format(total/partySize)));
    }
}

