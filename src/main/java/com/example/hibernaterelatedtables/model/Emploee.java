package com.example.hibernaterelatedtables.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emploee")
public class Emploee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;
    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstname;
    @Basic
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastname;
    @Basic
    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    @Basic
    @Column(name = "age", nullable = false)
    private int age;

    public Emploee(int id, String firstname, String lastname, String gender, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    public Emploee(String firstname, String lastname, String gender, int age, City city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Emploee(int id) {
        this.id = id;
    }

    public Emploee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emploee)) return false;
        Emploee emploee = (Emploee) o;
        return age == emploee.age && firstname.equals(emploee.firstname) && lastname.equals(emploee.lastname) && gender.equals(emploee.gender) && city == emploee.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, age, city);
    }

    @Override
    public String toString() {
        return "Emploee {" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city_id=" + city +
                '}';
    }
}