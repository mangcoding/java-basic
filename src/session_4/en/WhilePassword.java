package session_4.en;
import java.util.Scanner;

public class WhilePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isRight = false;

        do {
            System.out.print("\nWrite your password :");
            String password = sc.nextLine();
            if (password.length() > 15 && password.matches(".*\\d.*")) {
                isRight = true;
            }else{
                System.out.print("password invalid. it need to contains number and more than 15 charachter");
            }
        }while (isRight == false);

        System.out.print("Welcome to the dashboard");
        sc.close();
    }
}
