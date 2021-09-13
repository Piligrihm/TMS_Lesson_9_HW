package com.tms.figure.triangle;

import com.tms.figure.IFigure;
import com.tms.figure.exception.FigureSizeException;

public class Triangle implements IFigure {
    public double sideA;
    public double sideB;
    public double sideC;
    private final String exceptionMessage = "Такой треугольник существовать не может";

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() throws FigureSizeException {
        if (isValid(sideA, sideB, sideC)) {
            return sideA + sideB + sideC;
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    @Override
    public double getSquare() throws FigureSizeException {

        if (isValid(sideA, sideB, sideC)) {
            double p = (sideA + sideB + sideC) / 2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        } else {
            throw new FigureSizeException(exceptionMessage);
        }
    }

    /**
     * Метод предназначен для проверки возможности существования треугольника с заданным размером сторон
     *
     * @param sideA - double сторона А
     * @param sideB - double сторона В
     * @param sideC - double сторона С
     * @return булево значение
     */
    private boolean isValid(double sideA, double sideB, double sideC) {
        if ((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)) {
            return true;
        } else {
            return false;
        }
    }

}
