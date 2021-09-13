package com.tms.figure.rectangle;

import com.tms.figure.IFigure;
import com.tms.figure.exception.FigureSizeException;

public class Rectangle implements IFigure {
    public double sideA;
    public double sideB;
    private final String exceptionMessage = "Такой прямоугольник существовать не может";

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double getPerimeter() throws FigureSizeException {
        if (isValid(sideA, sideB)) {
            return (sideA + sideB) * 2;
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    @Override
    public double getSquare() throws FigureSizeException {
        if (isValid(sideA, sideB)) {
            return (sideA * sideB) * 2;
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    /**
     * Метод предназначен для проверки возможности существования прямоугольника с заданным размером сторон
     *
     * @param sideA - double длина
     * @param sideB - double ширина
     * @return
     */
    private boolean isValid(double sideA, double sideB) {
        if (sideA > 0 && sideB > 0) {
            return true;
        } else {
            return false;
        }
    }
}
