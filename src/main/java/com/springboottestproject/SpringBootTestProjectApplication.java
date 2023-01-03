package com.springboottestproject;

import com.springboottestproject.dao.ProductSupplyDao;
import com.springboottestproject.dao.ProductSupplyDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import springfox.documentation.oas.annotations.EnableOpenApi;
//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableOpenApi
//@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" , "io.swagger.configuration"})
public class SpringBootTestProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestProjectApplication.class, args);

	}

}
