package com.example.application;

import java.util.Date;

import com.example.model.dao.DaoFactory;
import com.example.model.dao.SellerDao;
import com.example.model.entities.Department;
import com.example.model.entities.Seller;

public class Pogram {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);


        System.out.println(seller);

    }
}
