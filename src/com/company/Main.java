package com.company;

public class Main {

    public static void main(String[] args) {
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        String[] ranks = {"1","2","3","4"};
        int[] pointValues = {1,2,3,4};

        Deck x = new Deck(suits, ranks, pointValues);
        System.out.println("Is empty? " + x.isEmpty());
        System.out.println("Cards undealt? " + x.size());
        x.shuffle();
        while(x.size()>0)
        {
            System.out.println(x.deal());
        }
    }
}