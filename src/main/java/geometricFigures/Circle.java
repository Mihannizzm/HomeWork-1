package geometricFigures;

public class Circle {

    //Метод для вычисления площади круга зная радиус.
    public static double squareOfCircle(double radiusOfCircle) {
        double squareOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        return squareOfCircle;
    }
}
