package com.springboottestproject.api;

import com.springboottestproject.domain.ProductWithSupplier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface ProductWithSupplyApi {


//    @Operation(summary = "Find pet by ID", description = "Returns a single pet", security = {
//            @SecurityRequirement(name = "api_key"),
//            @SecurityRequirement(name = "petstore_auth", scopes = {
//                    "write:pets",
//                    "read:pets"        })    }, tags={ "pet" })
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))),
//
//            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
//
//            @ApiResponse(responseCode = "404", description = "Pet not found") })
    @GetMapping(value = "/get",
            produces = { "application/json" })
    List<ProductWithSupplier> get();
}
