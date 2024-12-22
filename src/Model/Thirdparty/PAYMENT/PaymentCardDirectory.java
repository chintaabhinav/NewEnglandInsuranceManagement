/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Thirdparty.PAYMENT;

import Model.Customer.Payment.PaymentCard;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class PaymentCardDirectory {
    private ArrayList<PaymentCard> paymentCards;

    public PaymentCardDirectory() {
        this.paymentCards = new ArrayList<>();
    }

    public void addPaymentCard(PaymentCard paymentCard) {
        paymentCards.add(paymentCard);
    }

    public boolean isCardInDirectory(PaymentCard cardToCheck) {
        for (PaymentCard card : paymentCards) {
            if (card.getCardNumber().equals(cardToCheck.getCardNumber()) &&
                card.getExpirationMonth() == cardToCheck.getExpirationMonth() &&
                card.getExpirationYear() == cardToCheck.getExpirationYear() &&
                card.getCvv().equals(cardToCheck.getCvv())) {
                return true; // Card found in the directory
            }
        }
        return false; // Card not found in the directory
    }

    public void removePaymentCard(String cardNumber) {
        Iterator<PaymentCard> iterator = paymentCards.iterator();
        while (iterator.hasNext()) {
            PaymentCard card = iterator.next();
            if (card.getCardNumber().equals(cardNumber)) {
                iterator.remove(); // Remove the card from the directory
            }
        }
    }

    public ArrayList<PaymentCard> getAllPaymentCards() {
        return new ArrayList<>(paymentCards);
    }

    public int getCardCount() {
        return paymentCards.size();
    }
}
