package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setDamage(25);
    boss.setHealth(100);
    boss.setNick_Name("Nurik");
    boss.setWeapon(new Weapon("AK-47","AK-47"));
    System.out.println(boss.printInfo());

    Skeleton skeleton = new Skeleton();
    skeleton.setHealth(100);
    skeleton.setDamage(100);
    skeleton.setCount(2);
    skeleton.setTypeOfSkeleton("Animal");
    System.out.println(skeleton.printInfoForSkeleton());
    }
}
