package ru.netology.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
    public class OrderFormData {
        private String city;
        private String name;
        private String phone;


    public OrderFormData(String cityName, String s, String s1) {
    }
}