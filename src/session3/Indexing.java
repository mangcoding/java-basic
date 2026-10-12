package session3;

public class Indexing {
    public static void main(String[] args)  {
        char index;
        Double score = 80.0;

        if (score >= 90) 
            index = 'A';
        else if (score >= 80) 
            index = 'B';
        else if (score >= 70) 
            index = 'C';
        else 
            index = 'D';

        System.out.print("The index from score "+score+" is "+index);
    }
}
