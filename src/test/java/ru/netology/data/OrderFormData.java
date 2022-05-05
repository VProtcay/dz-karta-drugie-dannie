package ru.netology.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Data
@RequiredArgsConstructor
    public class OrderFormData {
        private String city;
        private String name;
        private String phone;



}