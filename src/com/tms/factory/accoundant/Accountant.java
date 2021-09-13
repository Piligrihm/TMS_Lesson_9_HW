package com.tms.factory.accoundant;

import com.tms.factory.IEmployee;

public class Accountant implements IEmployee {
    /**
     * Метод предназначен для вывода должности сотрудника
     * в данном случае должность и имя класса будут совпадать
     */
    @Override
    public void printPosition()  {
        System.out.println("So, i'm - " + getClass().getSimpleName());
    }
}
