package com.ecommerce.catalog_service.service;

import com.ecommerce.catalog_service.dto.ResponseCatalog;
import com.ecommerce.catalog_service.jpa.CatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    @Override
    public List<ResponseCatalog> getAllCatalogs() {
        return IterableUtils
                .toList(catalogRepository.findAll())
                .stream()
                .map(ResponseCatalog::of)
                .toList();
    }
}
