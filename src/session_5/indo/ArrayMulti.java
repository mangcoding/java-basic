package session_5.indo;
import java.util.Scanner;

public class ArrayMulti {
        //Contoh array 2 Dimensi
    public static void main(String[] args) {
        String groups[][] = {
            {"kelompok 1","Aceng","Indah","Dini"},
            {"kelompok 2","Diana","Nabila"},
        };

        //1) Contoh memanggil array menggunakan looping
        for (int i=0; i<groups.length; i++) {
            System.out.print("\n"+groups[i][0]+" : ");
            for (int x=1; x<groups[i].length; x++) {
                System.out.print(groups[i][x]+",");
            }
        }
    }
}