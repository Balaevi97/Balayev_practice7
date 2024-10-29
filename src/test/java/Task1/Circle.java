package Task1;

public class Circle extends Shape {

    public void draw () {

        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }

}
