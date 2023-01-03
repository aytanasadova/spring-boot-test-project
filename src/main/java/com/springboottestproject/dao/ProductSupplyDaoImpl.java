package com.springboottestproject.dao;

import com.springboottestproject.constants.Query;
import com.springboottestproject.domain.ProductWithSupplier;
import com.springboottestproject.mapper.ProductWithSupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductSupplyDaoImpl implements ProductSupplyDao{

   private final JdbcTemplate jdbcTemplate;

    public ProductSupplyDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ProductWithSupplier> get() {
//        System.out.println(jdbcTemplate.query(Query.ALl_PRODUCTS_WITH_SUPPLIERS, new ProductWithSupplierMapper()));
        return jdbcTemplate.query(Query.ALl_PRODUCTS_WITH_SUPPLIERS, new ProductWithSupplierMapper());
    }
}
