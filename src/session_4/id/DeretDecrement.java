package session_4.id;

public class DeretDecrement {
    public static void main(String[] args) {
        int x = 2;
        for (int i=20; i>=0; i-=x) {
            System.out.print(i+" ");
            if (i<20) x++;
        }
        
        System.out.println();
        int i = 20;
        x = 2;
        for (int a=0; a<6; a++) {
            System.out.print(i+" ");
            i -= x;
            x++;
        }
    }
}

/*
1) Deret : 9 7 5 3 1
2) Deret : 20 18 15 11 6 0
*/
