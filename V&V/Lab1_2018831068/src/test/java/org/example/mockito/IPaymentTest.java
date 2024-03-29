package org.example.mockito;

import org.example.IPayment;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IPaymentTest {

   static IPayment payment;
    @BeforeAll
    static void init(){
    payment = Mockito.mock(IPayment.class);
    }

    @Test
    void setCharge() {
        payment.setCharge(10);



    }

    @Test
    void payment() {
        Mockito.doReturn(100.0f).when(payment).payment(ArgumentMatchers.any(Float.class));


        assertEquals(100.0f, payment.payment(10.0f));

    }

    @Test
    void offers() {
        Mockito.doReturn(90.0f).when(payment).offers(ArgumentMatchers.any(Float.class), ArgumentMatchers.any(Float.class));

        assertEquals(90.0f, payment.offers(100, 10.0f));
    }
}