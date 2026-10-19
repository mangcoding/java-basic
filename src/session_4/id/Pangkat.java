package session_4.id;

public class Pangkat {
    //Case 7 pangkat 3 = 1 X 7 x 7 x 7 = 343
    public static void main(String[] args) {
        int angka = 7;
        int pangkat = 3;
        int result = 1;

        for (int i = 0; i<pangkat; i++) {
            result = result * angka;
        }
        System.out.print(angka+" pangkat "+pangkat+" = "+result);
    }
}
