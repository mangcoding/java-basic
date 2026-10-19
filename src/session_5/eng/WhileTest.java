package session_5.eng;

public class WhileTest {
    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {
            int y = 0;
            while (y<3) {
                int i = 1;
                System.out.println();
                while (i < 5) {
                    if (i%4 ==0) break;
                    System.out.print(i+" ");
                    i++;
                }
                y++;
            }
            x++;
        }
    }
}
