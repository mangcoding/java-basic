package session_5.indo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Membuat beberapa variable untuk menampung nama
        String name_1 = "Anton";
        String name_2 = "Ali";
        String name_3 = "Nabilla";

        //Membuat array supaya bisa menampung beberapa nama sekaligus
        String name[] = {"Dini","Rafi","Refi","Dadang","Rindi","Rindu","Asep"};

        //Contoh memanggil nama dari array indeks pertama (0)
        System.out.print(name[0]);

        //Contoh array 2 Dimensi
        String groups[][] = {
            {"kelompok 1","Aceng","Indah","Dini"},
            {"kelompok 2","Diana","Nabila"},
        };

        //Contoh memanggil array tanpa looping
        System.out.print("\nKelompok 2 : ");
        System.out.print(groups[1][1]+",");
        System.out.print(groups[1][2]);
    }
}
