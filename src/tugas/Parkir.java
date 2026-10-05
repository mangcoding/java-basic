package tugas;
import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa lama anda parkir ? ");
        int lama_parkir = inputan.nextInt();
        int jam_berikutnya = lama_parkir - 1;
        double biaya_parkir = 5000 + jam_berikutnya*3000;
        System.out.print("Biaya Parkir adalah "+biaya_parkir);
        inputan.close();
    }
}
