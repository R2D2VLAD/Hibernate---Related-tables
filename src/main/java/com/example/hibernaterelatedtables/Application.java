package com.example.hibernaterelatedtables;

import com.example.hibernaterelatedtables.model.Emploee;
import com.example.hibernaterelatedtables.service.impl.EmploeeDaoServiceImpl;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmploeeDaoServiceImpl emploeeService = new EmploeeDaoServiceImpl();
        Emploee emploee = new Emploee("Житарь", "Виктор", "МЕН", 18, 3);
        emploeeService.addEmploee(emploee);
        System.out.println();
        emploeeService.findById(3);
        System.out.println();
        emploeeService.getAllEmploee();
        System.out.println();
        Emploee emploee1 = new Emploee(14, "Житарь", "Максим", "МЕН", 11, 3);
        emploeeService.updateEmploee(emploee1);
        System.out.println();
        Emploee emploee2 = new Emploee(14, "Житарь", "Максим", "МЕН", 11, 3);
        emploeeService.deleteEmploee(emploee2);
    }
}
