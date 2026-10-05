package asssignment_2;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your Birth year: ");
        int birth_year = input.nextInt();
        int current_year  = 2026;
        int age = current_year - birth_year;
        System.out.print("Your age is "+age+ " years old");
        input.close();
    }
}
