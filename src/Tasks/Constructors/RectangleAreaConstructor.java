package Tasks.Constructors;

public class RectangleAreaConstructor {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        int Area = rectangle.area();
        System.out.println("Area of Rectangle: " + Area);
    }
    public static class Rectangle
    {
        private int length;
        private int breadth;

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int area()
        {
            return length * breadth;
        }

    }
}
