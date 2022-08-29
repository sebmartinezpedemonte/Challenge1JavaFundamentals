package com.smartinez.challenge1;

import java.util.ArrayList;

abstract public class Receipt implements Printable {
    private ArrayList<Item> items;

    //?A constructor that receives a collection of items and initializes its instance variable
    //if I initialize the collection then it is cleared of its items
    public Receipt(ArrayList<Item> items) {
        this.items = items;
    }

    /*
    o	A method called printItems, that takes no parameters and returns a String. The method must return
     a string that contains the description of every item contained in the receipt. If there are no items
      in the receipt, it must throw an exception with a message saying “com.smartinez.challenge1.Receipt has no items”. If there are
      no printable items in the receipt, it must throw an exception with the message
       “com.smartinez.challenge1.Receipt has no printable items”
     */
    protected String printItems() throws NoItemsException, NoPrintableItemsException {
        StringBuilder sb = new StringBuilder();
        if (!items.isEmpty()) {
            for (Item item : items) {
                sb.append(item);
            }
        } else {
            throw new NoItemsException("Receipt has no items");
        }
        if (!hasPrintableItems()) {
            throw new NoPrintableItemsException("Receipt has no printable items");
        }
        return sb.toString();
    }

    private boolean hasPrintableItems() {
        boolean hasPrintableItems = false;
        int i = 0;
        while (items.size() > i && !hasPrintableItems) {
            if (items.get(i).isPrintable()) {
                hasPrintableItems = true;
            } else {
                i++;
            }
        }
        return hasPrintableItems;
    }


}
