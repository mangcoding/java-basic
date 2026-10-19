package session_5.eng;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put your password: ");
        String password = input.nextLine();
        String ab = new String("Nugraha");

        if (password.equals(ab) ) {
            System.out.print("Still true");
        }else{
            System.out.print("Why not true");
        }
        input.close();
    }
}
