package session_4.en;

public class ForLoop {
    public static void main(String[] args) {
        String city="Makkah";
        for (int i=1; i<=10; i+=1) {
            if (i%5 == 0) city = "Saudi Arabia";
            else if (i%2 == 0) city = "Madinah";
            else city = "Makkah";

            System.out.println(i+") I Love "+city);
        }
    }
}

/*
1) I love Makkah
2) I love Madinah
3) I love Makkah
4) I love Madinah
5) I love Saudi Arabia
6) I love Madinah
7) I love Makkah
8) I love Madinah
9) I love Makkah
10) I love Saudi Arabia
*/