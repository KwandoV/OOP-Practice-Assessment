package com.assessment.payment;

import java.util.ArrayList;
import java.util.List;

/**
 * Credit card payment implementation
 */
public class CreditCardPayment implements PaymentMethod {
    // TODO: Add private field for cardNumber (String)
    private String cardNumber;

    // TODO: Create constructor that initializes cardNumber
    public CreditCardPayment(String cardNumber) {
        // TODO: IMPLEMENT: Initialize field and perform basic validation (e.g., not null/empty).
        if (!cardNumber.isEmpty()){
        this.cardNumber=cardNumber;}
    }

    @Override
    public boolean processPayment(double amount) {
        // TODO: IMPLEMENT: Return true if amount > 0 and cardNumber is valid.
        if (amount >0 && cardNumber != null){
            return true;
        }

        return false;
    }

    @Override
    public String getPaymentDetails() {
        // TODO: IMPLEMENT: Return a string with masked card number (show only last 4 digits)
        List<String> cardNumbers = new ArrayList<>();
        cardNumbers = List.of(cardNumber.split(""));

        String maskedCardNum="";

        for(int i =0; i < cardNumbers.size(); i++){
            if (i+1 < cardNumbers.size()-4){
                maskedCardNum= maskedCardNum+"*";
            }else{
                maskedCardNum=maskedCardNum+cardNumbers.get(i);
            }
        }
        return maskedCardNum;
    }
}