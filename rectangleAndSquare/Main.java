package rectangleAndSquare;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 3);
        Square square = new Square(4);
        System.out.println("Rectangle");
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());

        System.out.println("Square");
        System.out.println("Area: "+square.getArea());
        System.out.println("Perimeter: "+square.getPerimeter());
    }
}
