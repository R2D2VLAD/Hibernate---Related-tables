package com.example.hibernaterelatedtables.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private int cityId;
    @Basic
    @Column(name = "city_name", nullable = false, length = 50)
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emploee> emploees = new ArrayList<>();


    public void addEmploee(Emploee emploee) {
        emploee.setCity(this);
        emploees.add(emploee);
    }

    public void removeEmploee(Emploee emploee) {
        emploees.remove(emploee);
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Emploee> getEmploees() {
        return emploees;
    }

    public void setEmploees(List<Emploee> emploee) {
        this.emploees = emploees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return cityName.equals(city.cityName) && emploees.equals(city.emploees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, emploees);
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", emploee=" + emploees +
                '}';
    }
}