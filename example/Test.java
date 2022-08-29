package com.smartinez.example;

import com.smartinez.challenge1.*;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws NoItemsException, NoPrintableItemsException {
        //(String brand, String name, int price, boolean printable)
        Item item1 = new Item("Samsung", "SmartTV", 70000, true );
        Item item2 = new Item("Samsung", "A53", 46000);
        Item item3 = new Item("Motorola", "G22", 47000, false);
        Item item4 = new Item("Apple", "Iphone 10", 2000000, false);
        Item item5 = new Item("Huawei", "S22", 150000, false);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        ArrayList<Item> itemsEmpty = new ArrayList<>();
        ArrayList<Item> noPrintableItems = new ArrayList<>();
        noPrintableItems.add(item4);
        noPrintableItems.add(item5);
        MailReceipt mail1 = new MailReceipt(items, "sebastian@gmail.com");
        MailReceipt mail2 = new MailReceipt(itemsEmpty, "flo@gmail.com");
        MailReceipt mail3 = new MailReceipt(noPrintableItems, "caro@gmail.com");
        PaperReceipt paper1 = new PaperReceipt(items);
        PaperReceipt paper2 = new PaperReceipt(itemsEmpty);
        PaperReceipt paper3 = new PaperReceipt(noPrintableItems);

        mail1.print();
        System.out.println();
        mail2.print();
        System.out.println();
        mail3.print();
        System.out.println();
        paper1.print();
        System.out.println();
        paper2.print();
        System.out.println();
        paper3.print();

    }
}
