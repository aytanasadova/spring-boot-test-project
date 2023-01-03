package com.springboottestproject.dao;

import com.springboottestproject.domain.ProductWithSupplier;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductSupplyDao {
     List<ProductWithSupplier> get();
}
