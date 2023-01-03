package com.springboottestproject.mapper;

import com.springboottestproject.domain.Product;
import com.springboottestproject.domain.ProductWithSupplier;
import com.springboottestproject.domain.Supplier;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductWithSupplierMapper implements RowMapper {
    private static Supplier fillSupplierObject(ResultSet rs) throws SQLException {
        Supplier supplier = new Supplier();
        supplier.setId(rs.getInt("supplier_id"));
        supplier.setName(rs.getString("supplier_name"));
        return supplier;
    }

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ProductWithSupplier(fillProductObject(rs), fillSupplierObject(rs));

    }

    private Product fillProductObject(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setId(rs.getLong("product_id"));
        product.setName(rs.getString("product_name"));
        return product;
    }

}
