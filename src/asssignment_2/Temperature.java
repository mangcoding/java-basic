package asssignment_2;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your Celcius: ");
        Double Celsius = input.nextDouble();
        Double Reamur = Celsius * 4 / 5;
        System.out.print("Temperature from "+Celsius+" C is "+Reamur+" R");
        input.close();
    }
}
