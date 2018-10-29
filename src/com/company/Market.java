package com.company;

public class Market {

    String marketName;

    Item[] items = new Item[4];

        void displayDetail() {
            System.out.println("Market Name: " + marketName);

            for (Item item : items) {
                item.displayItems();
            }
        }

    }