public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle("Red", 12);
        Figure triangle = new Triangle("Blue", 12, 10, 10);
        CompareFigure compareFigure = new SimpleCompareFigure();
        System.out.println(compareFigure.compare(circle, triangle));
    }
}
