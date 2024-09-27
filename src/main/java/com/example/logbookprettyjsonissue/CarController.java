package com.example.logbookprettyjsonissue;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "/any", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> getAnyCar() {
        return ResponseEntity.ok(
                new Car(
                        "Dodge",
                        "Challenger RT 440",
                        "Blue",
                        Year.of(1970),
                        "6GDG486"
                )
        );
    }
}
