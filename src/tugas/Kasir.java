package tugas;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa total belanja? ");
        double total_belanja = inputan.nextDouble();

        if (total_belanja > 50000.0) 
            total_belanja -= 5000.0;

        System.out.print("Berapa uang yang diberikan? ");
        double uang_yg_diberikan = inputan.nextDouble();

        double uang_kembalian = uang_yg_diberikan - total_belanja;

        System.out.print("Uang kembalian "+uang_kembalian);
        inputan.close();
    }
}
