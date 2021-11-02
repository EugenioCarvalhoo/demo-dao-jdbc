package com.example.application;

import java.util.Date;
import java.util.List;

import com.example.model.dao.DaoFactory;
import com.example.model.dao.SellerDao;
import com.example.model.entities.Department;
import com.example.model.entities.Seller;

public class Pogram {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);


        System.out.println(seller);
        System.out.println("}==============================={");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller sl: list) {
            System.out.println(sl);
        }

    }
}
