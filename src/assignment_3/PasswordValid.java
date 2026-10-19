package assignment_3;

public class PasswordValid {
    public static void main(String[] args) {
        String password = "password@2026!!";
        String message = "";
        if (password.length() <8) {
            message = "Too short";
        }else if (password.length() >=8 && password.length()<=11) {
            message = "Moderate";
        }else if (password.length() >=12) {
            message = "Strong";
        }
        System.out.print(message);
        if (password.matches(".*\\d.*")) {
            System.out.print(" password and contain number as recommended");
        }
    }
}
