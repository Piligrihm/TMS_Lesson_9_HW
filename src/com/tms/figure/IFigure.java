package com.tms.figure;

import com.tms.figure.exception.FigureSizeException;

public interface IFigure {
    /**
     * Метод подсчитывает периметр фигуры
     * @return - double периметр
     * @throws FigureSizeException
     */
    double getPerimeter() throws FigureSizeException;

    /**
     * Метод подсчитывает площадь фигуры
     * @return - double площадь
     * @throws FigureSizeException
     */
    double getSquare() throws FigureSizeException;

}

