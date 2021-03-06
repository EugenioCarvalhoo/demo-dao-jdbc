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

        System.out.println("}==============================={");
        
        list = sellerDao.findAll();

        for (Seller sl: list) {
            System.out.println(sl);
        }

        System.out.println("}==============================={");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 2000.0, department);

        //sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n==== TEST 5: seller update ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update comleted!");

        System.out.println("\n==== TEST 5: seller Delete ====");
        sellerDao.deleteById(10);
    }
}
