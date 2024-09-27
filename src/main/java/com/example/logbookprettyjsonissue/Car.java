package com.example.logbookprettyjsonissue;

import java.time.Year;

public record Car(String brand,
                  String model,
                  String color,
                  Year year,
                  String number) {
}
