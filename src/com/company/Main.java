package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(100);
        boss.setDamage(50);
        boss.weapon.setWeaponName("sword");
        boss.weapon.setWeaponType("poisonouns");
        boss.printlnfo();

        System.out.println("Boss lvl");



        System.out.println("---------------------------");



        Skeleton skeleton = new Skeleton();
        skeleton.setHp(100);
        skeleton.setDamage(25);
        skeleton.weapon.setWeaponType("Bow");
        skeleton.weapon.setWeaponName("100 lvl");
        skeleton.printlnfo();
        System.out.println("Spichka");


        System.out.println("---------------------------");






        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(100);
        skeleton2.setDamage(35);
        skeleton2.weapon.setWeaponType("nunchucks");
        skeleton2.weapon.setWeaponName("nb200");
        skeleton2.printlnfo();
        System.out.println("Mika");

        System.out.println("----------------------------");


    }
}
