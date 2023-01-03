package com.springboottestproject.controller;

import com.springboottestproject.api.ProductWithSupplyApi;
import com.springboottestproject.dao.ProductSupplyDao;
import com.springboottestproject.domain.ProductWithSupplier;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductSupplyController implements ProductWithSupplyApi {
    ProductSupplyDao productSupplyDao;

    public ProductSupplyController(ProductSupplyDao productSupplyDao) {
        this.productSupplyDao = productSupplyDao;
    }


    public List<ProductWithSupplier> get() {
        return productSupplyDao.get();
    }
}
