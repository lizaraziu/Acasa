package com.company;

public class DiplayResult {
    public static void main(String[] args) {

        Market seven = new Market();

        Item item1 = new Item();
        item1.name = "sugar";
        item1.price = 100;

        seven.items[0] = item1;

        Item item2 = new Item();
        item2.name = "candies";
        item2.price = 200;
        seven.items[1] = item2;

        Item item3 = new Item();
        item3.name = "flowers";
        item3.price = 450;
        seven.items[2] = item3;

        Item item4 = new Item();
        item4.name = "bananas";
        item4.price = 50;
        seven.items[3] = item4 ;


        System.out.println(MarketManager.getAveragePrice(seven));

        Item item5 = new Item();

        MarketManager.ReplaceItem(seven,item5,3);



    }
}
