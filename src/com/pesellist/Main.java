package com.pesellist;

public class Main {

    public static void main(String[] args) {
        MyPeselList list = new MyPeselList();

        System.out.println("dodajemy pesel...");
        list.add("86020909275");
        System.out.println("");
        System.out.println("dodajemy pesel...");
        list.add("49040501580");
        System.out.println("");
        System.out.println("dodajemy pesel...");
        list.add("10050511987");
        System.out.println("");
        System.out.println("dodajemy pesel...");
        list.add("92071314764");
        System.out.println("");
        System.out.println("dodajemy pesel...");
        list.add("9207131476224");





        System.out.println("");
        System.out.println("Lista:");
        for(int i = 0; i < list.getSize(); i++) {


            System.out.println(list.get(i));
        }

        System.out.println("Ilość elementów listy: " + list.getSize());
    }
}







