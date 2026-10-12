package asssignment_2;

public class ParkSystem {
    public static void main(String[] args) throws Exception {
        int total_hour = 1;
        int additional_hour = total_hour - 1;

        double costs = 3000 + additional_hour * 2000;
        System.out.print("The costs for "+total_hour+" hours is "+costs);
    }
}
