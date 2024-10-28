public class Triangle extends Figure implements Drawable {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle with firstSide " + firstSide
                + " and secondSide " + secondSide
                + " and thirdSide " + thirdSide);
    }
}