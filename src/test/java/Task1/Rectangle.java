package Task1;

public class Rectangle extends Shape {

    public void draw () {

        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
