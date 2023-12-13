package com.TestApplication.demo.Errors;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughtMoney(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("No Money");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
