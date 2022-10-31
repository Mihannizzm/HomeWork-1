import geometricFigures.Circle;
import geometricFigures.Square;
import geometricFigures.Triangle;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! Я Михаил!");

        double sideOfSquare = 5; //Длина стороны квадрата
        System.out.println("Площадь квадрата: " + Square.squareOfSquare(sideOfSquare));

        double radiusOfCircle = 3; //Радиус круга
        System.out.println("Площадь круга: " + Circle.squareOfCircle(radiusOfCircle));

        double sideOfTriangle = 8; //Длина стороны треугольника
        double heightOfTriangle = 4; //Высота треугольника
        System.out.println("Площадь треугольника: " + Triangle.squareOfTriangle(sideOfTriangle, heightOfTriangle));



    }


}
