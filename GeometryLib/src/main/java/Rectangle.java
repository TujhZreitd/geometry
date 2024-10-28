public class Rectangle extends Figure implements Drawable {
    private int weight;
    private int height;

    public Rectangle(String color, int weight, int height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (weight + height);
    }

    @Override
    public double calculateArea() {
        return weight * height;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle with weight " + weight + " and height " + height);
    }
}
