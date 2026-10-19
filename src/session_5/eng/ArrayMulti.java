package session_5.eng;

public class ArrayMulti {
    public static void main(String[] args) {
        String groups[][] = {
            {"Group 1", "Arwa","Abdullah","Deng"},
            {"Group 2", "Maryam","Muhammad","Yusuf"},
            {"Group 3", "Zidan","Dalia"}
        };

        for (int i=0; i<groups.length; i++) {
            System.out.print("\n"+groups[i][0]+" : ");
            for (int j=1; j<groups[i].length; j++) {
                System.out.print(groups[i][j]+",");
            }
        }
    }
}
