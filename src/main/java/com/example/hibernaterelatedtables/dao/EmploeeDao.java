package com.example.hibernaterelatedtables.dao;

import com.example.hibernaterelatedtables.model.Emploee;

import java.util.List;

public interface EmploeeDao {
    void addEmploee(Emploee emploee);

    Emploee findById(int id);

    List<Emploee> getAllEmploee();

    void updateEmploee(Emploee emploee);

    void deleteEmploee(Emploee emploee);
}
