package sesi3;
import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa nilai anda? ");
        Double nilai = inputan.nextDouble();
        char indeks = 'E';

        if (nilai <= 55) 
            indeks = 'D';
        else if (nilai > 55 && nilai <=65) 
            indeks = 'C';
        else if (nilai > 65 && nilai <=75) 
            indeks = 'B';
        else if (nilai > 75)
            indeks = 'A';

        System.out.print("Nilai anda "+nilai+" mendapatkan index "+indeks);
        inputan.close();
    }
}
