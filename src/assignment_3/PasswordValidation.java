package assignment_3;

public class PasswordValidation {
    public static void main(String[] args) throws Exception {
        //Ganti password lalu run berulang kali, untuk melihat output
        String password = "Road2Jakarta@2026!!";
        int paswordLength = password.length();
        String message="";

        if (paswordLength < 8) {
            message = "Terlalu Pendek";
        }else if (paswordLength >=8 && paswordLength <=11) {
            message = "Cukup";
        }else if (paswordLength >=12) {
            message = "Kuat";
        }

        System.out.println("Password yang anda masukkan "+message);

        if (password.matches(".*\\d.*")) {
            System.out.print("Password anda mengandung angka");
        }
    }
}