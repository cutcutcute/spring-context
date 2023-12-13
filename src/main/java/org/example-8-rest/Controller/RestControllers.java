package com.TestApplication.demo.Controller;


import com.TestApplication.demo.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @GetMapping("/api")
    public String getApi(){
        return "api";
    }


    @PostMapping("/api/country")
    public ResponseEntity<Country> getCountry(){
        Country c =  Country.of("Saint-P", 322);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Time", "00:16")
                .header("Name", "ResponseTestHeader")
                .body(c);
    }

}
