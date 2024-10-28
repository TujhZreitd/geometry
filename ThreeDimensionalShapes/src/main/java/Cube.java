public class Cube extends Figure implements Volumable, Drawable {
    private double edge;

    public Cube(String color, double edge) {
        super(color);
        this.edge = edge;

    }

    @Override
    public double calculatePerimeter() {
        return 12 * edge;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public void draw() {
        System.out.println("Draw cube with edge " + edge);
    }
}
