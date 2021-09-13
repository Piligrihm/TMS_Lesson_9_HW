package com.tms.figure;

import com.tms.figure.exception.FigureSizeException;

public class Circle implements IFigure {
    private static final double PI = 3.14;
    private double radius;
    private final String exceptionMessage = "Круг с таким радиусом существовать не может";


    @Override
    public double getPerimeter() throws FigureSizeException {
        if (isValid(radius)) {
            return radius * 2 * PI;
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    @Override
    public double getSquare() throws FigureSizeException {
        if (isValid(radius)) {
            return PI * radius * radius;
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    /**
     * Метод устанваливает значение переменной
     * @param radius - double радиус
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * метод предназначен для проверки возможности существования круга такого размера
     *
     * @param radius - double радиус
     * @return будево значение
     */
    private boolean isValid(double radius) {
        if (radius > 0) {
            return true;
        } else {
            return false;
        }
    }
}
