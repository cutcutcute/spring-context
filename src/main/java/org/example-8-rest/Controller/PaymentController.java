package com.TestApplication.demo.Controller;


import com.TestApplication.demo.Errors.ErrorDetails;
import com.TestApplication.demo.Errors.NotEnoughMoneyException;
import com.TestApplication.demo.PaymentDetails;
import com.TestApplication.demo.Services.PaymentService;
import org.apache.juli.logging.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    private static final Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(
            PaymentService paymentService
    ) {
        this.paymentService = paymentService;
    }

    @PostMapping("/api/payment")
    public ResponseEntity<?> makePayment()
    {
        try{
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException e){
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment.");
            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }
    }


    @PostMapping("/api/buy")
    public ResponseEntity<?> buy(){
        /**
         Обработается через
         ExceptionControllerAdvice
         */
        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

    @PostMapping("/api/pay")
    public ResponseEntity<PaymentDetails> pay(
            @RequestBody PaymentDetails paymentDetails
    ){
        logger.info("Balance " + paymentDetails.getAmount());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);

    }

}
