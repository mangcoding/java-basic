package session_4.en;

public class DiffWhileAndDo {
    //Please run this 2 of loop and see the difference
    public static void main(String[] args) {
        int i = 0;
        while (i > 10) {
            System.out.print("You will not see this");
        }

        i=0;
        do {
            System.out.print("You will see this");
        }while(i > 10);
    }
}
