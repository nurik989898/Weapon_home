package com.company;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWeapon;

    public Weapon() {

    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public Weapon(String typeOfWeapon, String nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}