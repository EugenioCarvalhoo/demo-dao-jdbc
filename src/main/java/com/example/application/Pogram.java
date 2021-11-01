package com.example.application;

import java.util.Date;

import com.example.model.entities.Department;
import com.example.model.entities.Seller;

public class Pogram {
    public static void main(String[] args) {
        
        Department obj = new Department(1, "Books");

        System.out.println(obj);

        Seller seller = new Seller(21,"Bob", "carb@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);

    }
}
