package com.springboottestproject.constants;

public class Query {

    public static final String ALl_PRODUCTS_WITH_SUPPLIERS="\n" + "select ps.product_id ,ps.supplier_id, p.\"name\" as product_name," +
            "s.\"name\" as supplier_name from main.product_supply ps \n" +
            "join main.products p on p.id=ps.product_id \n" +
            "join main.suppliers s on s.id=ps.supplier_id \n";
}
