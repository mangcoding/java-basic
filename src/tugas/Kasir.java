package tugas;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa total belanja? ");
        double total_belanja = inputan.nextDouble();

        System.out.print("Berapa uang yang diberikan? ");
        double uang_yg_diberikan = inputan.nextDouble();

        double uang_kembalian = uang_yg_diberikan - total_belanja;

        System.out.print("Uang kembalian "+uang_kembalian);
        inputan.close();
    }
}
