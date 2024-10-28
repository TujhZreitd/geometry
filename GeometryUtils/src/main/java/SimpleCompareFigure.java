public class SimpleCompareFigure implements CompareFigure {
    @Override
    public Figure compare(Figure firstFigure, Figure secondFigure) {
        Figure resultFigure = firstFigure.calculateArea() > secondFigure.calculateArea() ? firstFigure : secondFigure;
        System.out.println(resultFigure);
        return resultFigure;
    }
}
