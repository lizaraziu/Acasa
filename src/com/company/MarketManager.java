package com.company;

public class MarketManager {


    public static double getMostExpensiveItem(Market market) {

        double max = market.items[0].price;
        for (Item item : market.items) {
            if (item.price > max) max = item.price;
        }
        return max;
    }

    public static double getAveragePrice(Market market) {

        double sum = 0;

        for (int i = 0; i < market.items.length; i++) {
            sum = sum + market.items[i].price;


        }
        double average = sum / market.items.length;
        return average;
    }

    public static void ReplaceItem(Market market, Item item, int index) {

        market.items[index] = item;

    }

}


