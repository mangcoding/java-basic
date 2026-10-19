package session_5.eng;

public class ArraySamples {
    public static void main(String[] args) {
        //without array
        String student_1 = "Arwa";
        String student_2 = "Maryam";
        String student_3 = "Muhammad";

        //with array
        String students[] = {"Arwa","Maryam","Muhammad"};
        String[] names = {"Hai","Hello"};
        String parents[] = new String[10];

        System.out.println(students[0]);
        System.out.println(names[0]);
        System.out.println(parents[0]);
        parents[0] = "Abdullah";
        System.out.println(parents[0]);
    }
}
