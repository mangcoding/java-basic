package session_4;

import java.util.Scanner;
public class PasswordCheckerDo {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Boolean condition = false;
        String password = "";
        do {
            System.out.print("\nMasukkan Password: ");
            password = inputan.nextLine();

            if (password.length() > 10 && password.matches(".*\\d.*")) {
                condition = true;
            }else{
                System.out.print("Password harus lebih dari 10 dan mengandung angka");
            }
        }while (condition == false);

        System.out.print("Password yang dimasukkan sudah sesuai");
        inputan.close();
    }
}
