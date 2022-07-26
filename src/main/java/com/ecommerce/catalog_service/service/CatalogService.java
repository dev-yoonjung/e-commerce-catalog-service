package com.ecommerce.catalog_service.service;

import com.ecommerce.catalog_service.dto.ResponseCatalog;

import java.util.List;

public interface CatalogService {

    List<ResponseCatalog> getAllCatalogs();

}
