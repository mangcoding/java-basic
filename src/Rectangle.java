public class Rectangle {
    static int area = 100;
    public static void main(String[] args) throws Exception {
        int length = 10;
        int width = 4;
        int area = areaOfRectangle(length,width);
        System.out.print("Area of rectangle is "+area);
    }

    public static int areaOfRectangle(int length, int width) {
        System.out.print(area);
        return length*width;
    }
}