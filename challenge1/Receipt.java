package com.smartinez.challenge1;


import java.util.Iterator;
import java.util.List;

public abstract class Receipt implements Printable {
    private List<Item> items;
    public Receipt(List<Item> items) {
        this.items = items;
    }
    //?A constructor that receives a collection of items and initializes its instance variable
    //if I initialize the collection then it is cleared of its items


    /*
    o	A method called printItems, that takes no parameters and returns a String. The method must return
     a string that contains the description of every item contained in the receipt. If there are no items
      in the receipt, it must throw an exception with a message saying “Receipt has no items”. If there are
      no printable items in the receipt, it must throw an exception with the message
       “Receipt has no printable items”
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
        if (checkForPrintableItems()) {
            throw new NoPrintableItemsException("Receipt has no printable items");
        }
        return sb.toString();
    }

    private boolean checkForPrintableItems() {
        boolean hasPrintableItems = true;
        Iterator<Item> it = items.iterator();
        while (it.hasNext() && hasPrintableItems) {
            if (it.next().isPrintable()) {
                hasPrintableItems = false;
            }
        }
        return hasPrintableItems;
    }
    /* int i = 0;
        while (items.size() > i && hasPrintableItems) {
            if (items.get(i).isPrintable()) {
                hasPrintableItems = false;
            } else {
                i++;
            }
        }*/


}
