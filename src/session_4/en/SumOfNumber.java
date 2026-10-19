package session_4.en;

public class SumOfNumber {
    // 1 + 2 + 3 + 4 + 5 + ... + 100 = 
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + i; // similar with: sum +=i;
        }

        System.out.print("1 + 2 + 3 + 4 + 5 + ... + 100 = "+sum);
    }
}
