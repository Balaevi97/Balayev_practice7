package Task1;

public class DrawingApp {

    public void startDrawing(Shape shape) {

        shape.draw();
    }


    public static void main(String[] args) {
        DrawingApp drawingApp = new DrawingApp();

        Shape shape = new Shape();
        drawingApp.startDrawing(shape);

        Shape circle = new Circle();
        drawingApp.startDrawing(circle);

        Shape triangle = new Triangle();
        drawingApp.startDrawing(triangle);

        Shape rectangle = new Rectangle();
        drawingApp.startDrawing(rectangle);

    }

}
