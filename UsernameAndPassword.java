import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        getUsernameAndPassword(console);
    }
    public static void getUsernameAndPassword(Scanner console) {
        System.out.print("Enter your username: ");
        String username = console.nextLine();
        System.out.println();
        System.out.print("Enter your password: ");
        String password = console.nextLine();
        if(username.equals(password)){
            System.out.println("Why is the username and password the same :(");
            getUsernameAndPassword(console);
        }
    }
}

