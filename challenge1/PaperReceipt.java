package com.smartinez.challenge1;


import java.util.List;

public class PaperReceipt extends Receipt{

    private final String PAPER_TYPE = "A4";

    public PaperReceipt(List<Item> items) {
        super(items);
    }

    @Override
    public void print() {
        try {
            System.out.println("Printing receipt in " + PAPER_TYPE);
            System.out.println(printItems());
        }catch(NoItemsException | NoPrintableItemsException e){
            System.out.println("Error printing receipt to paper due to " + e.getMessage());
        }
    }
    /*
        //Another way:
        public void print() throws NoItemsException, NoPrintableItemsException {
        try {
            System.out.println("Printing receipt in " + PAPER_TYPE);
            System.out.println(printItems());
        }catch(NoItemsException e){
            System.out.println("Error printing receipt to paper due to " + e.getMessage());
        }catch(NoPrintableItemsException e){
            System.out.println("Error printing receipt to paper due to " +e.getMessage());
        }
    }
     */
}
