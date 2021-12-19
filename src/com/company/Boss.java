package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }
    public String printInfoForSkeleton(){return "skelet heals" + " " +  getHealth() +
            ", skelet damage " + getDamage() + ",";
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){return "BOss health" + getHealth() + " " + getDamage() + " " +  getNick_Name() +
            "\nBoss weopon " + weapon.getNameOfWeapon() + " " + weapon.getTypeOfWeapon();
    }
}
