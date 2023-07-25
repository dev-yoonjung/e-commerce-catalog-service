package com.ecommerce.catalog_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {

    private String productId;

    private String productName;

    private Integer stock;

    private Integer unitPrice;

    private Integer totalPrice;

}
