package session_4;

public class SumDeret {
    //Case 1+2+3+4+5+6+...+30
    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i<=30; i++) {
            total +=i; //total = total + i
        }
        System.out.print("jumlah dari 1+2+3+4+5+6+...+30 ="+total);
    }
}
