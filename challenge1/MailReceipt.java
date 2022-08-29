package com.smartinez.challenge1;

import java.util.ArrayList;

public class MailReceipt extends Receipt{

    private String mail;

    public MailReceipt(ArrayList<Item> items, String mail) {
        super(items);
        this.mail = mail;
    }

    @Override
    public void print() throws NoItemsException, NoPrintableItemsException {
        try {
            System.out.println("Sending receipt to email: " + this.mail);
            System.out.println(printItems());
        }catch(NoItemsException e){
            System.out.println("Error sending receipt on an email due to " + e.getMessage());
        }catch(NoPrintableItemsException e){
            System.out.println("Error sending receipt on an email due to " +e.getMessage());
        }
    }
}
