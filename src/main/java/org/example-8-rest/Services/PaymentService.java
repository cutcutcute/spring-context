package com.TestApplication.demo.Services;


import com.TestApplication.demo.Errors.NotEnoughMoneyException;
import com.TestApplication.demo.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
