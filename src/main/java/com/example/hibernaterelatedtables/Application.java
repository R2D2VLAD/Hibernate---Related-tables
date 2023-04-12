package com.example.hibernaterelatedtables;

import com.example.hibernaterelatedtables.model.City;
import com.example.hibernaterelatedtables.model.Emploee;
import com.example.hibernaterelatedtables.service.impl.CityDaoServiceImpl;
import com.example.hibernaterelatedtables.service.impl.EmploeeDaoServiceImpl;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmploeeDaoServiceImpl emploeeService = new EmploeeDaoServiceImpl();
        CityDaoServiceImpl cityService = new CityDaoServiceImpl();
        City city = new City();
         Emploee max = new Emploee("Max", "Boom", "MEN", 25,
                 new City(5,"Брянск", null));
       // emploeeService.addEmploee(max);
        city.getEmploees().add(max);
        System.out.println(max);
        System.out.println(city.getEmploees());
       // Emploee emploee = new Emploee("Житарь", "Виктор", "МЕН", 18);
     //   emploeeService.addEmploee(emploee);
     //   System.out.println();
     //   emploeeService.findById(3);
     //   System.out.println();
     //   emploeeService.getAllEmploee();
     //   System.out.println();
     //   Emploee emploee1 = new Emploee(14, "Житарь", "Максим", "МЕН", 11);
      //  emploeeService.updateEmploee(emploee1);
     //   System.out.println();
      //  Emploee emploee2 = new Emploee(14, "Житарь", "Максим", "МЕН", 11);
       // emploeeService.deleteEmploee(emploee2);
    }
}
