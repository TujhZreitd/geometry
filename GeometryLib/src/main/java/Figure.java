public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }
}
