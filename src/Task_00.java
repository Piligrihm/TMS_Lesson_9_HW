import com.tms.figure.*;
import com.tms.figure.exception.FigureSizeException;

public class Task_00 {
    public static void main(String[] args) throws FigureSizeException {
        Circle circle1 = new Circle();
        circle1.setRadius(15.5);
        Triangle triangle1 = new Triangle(5, 5, 1);
        Rectangle rectangle1 = new Rectangle(15.2, 7.1);

        IFigure[] iFigure = new IFigure[5];
        iFigure[0] = circle1;
        iFigure[1] = triangle1;
        iFigure[2] = rectangle1;
        iFigure[3] = new Rectangle(12, 9);
        iFigure[4] = new Triangle(5, 5, 5);


        double perimeterSumm = 0;
        double squareSumm = 0;
        for (IFigure element : iFigure) {

            perimeterSumm += element.getPerimeter();
            squareSumm += element.getSquare();
        }

        System.out.println("Сумма периметров всех фигур массива = " + perimeterSumm);
        System.out.println("Сумма площадей всех фигур массива = " + squareSumm);


    }
}
