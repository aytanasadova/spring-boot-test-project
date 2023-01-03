package com.springboottestproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductWithSupplier {
    private Product product;
    private Supplier supplier;

}
