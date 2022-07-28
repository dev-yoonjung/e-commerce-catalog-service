package com.ecommerce.catalog_service.controller;

import com.ecommerce.catalog_service.dto.ResponseCatalog;
import com.ecommerce.catalog_service.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog-service/catalogs")
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping("")
    public ResponseEntity<List<ResponseCatalog>> getAllCatalogs() {
        return ResponseEntity.ok(catalogService.getAllCatalogs());
    }

}
