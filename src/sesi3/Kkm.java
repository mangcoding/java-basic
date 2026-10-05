package sesi3;
import java.util.Scanner;

public class Kkm {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa nilai anda? ");
        Double nilai = inputan.nextDouble();

        if (nilai >= 75) 
            System.out.print("Selamat Anda lulus");
        else 
            System.out.print("Semangat belajar lagi, minggu depan pasti bisa");

        inputan.close();
    }
}
