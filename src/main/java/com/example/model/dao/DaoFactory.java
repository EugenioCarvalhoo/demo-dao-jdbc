package com.example.model.dao;

import com.example.model.dao.implement.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
