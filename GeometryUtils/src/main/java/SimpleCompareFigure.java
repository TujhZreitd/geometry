import main.java.Figure;

public class SimpleCompareFigure implements CompareFigure {
    @Override
    public Figure compare(Figure firstFigure, Figure secondFigure) {
        return firstFigure.calculateArea() > secondFigure.calculateArea() ? firstFigure : secondFigure;
    }
}
