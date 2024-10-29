package Task1;

public class Triangle extends Shape {

    public void draw () {
        System.out.println("Drawing Triangle");
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
