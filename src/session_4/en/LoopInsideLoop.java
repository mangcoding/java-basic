package session_4.en;

public class LoopInsideLoop {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int x=i; x<=5+i; x++) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4 5 6
2 3 4 5 6 7
3 4 5 6 7 8
1 -> 6 = 5
2 -> 7 = 5
3 -> 8 = 5
*/