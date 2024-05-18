package com.inventamos.springreactive.business.service;

import com.inventamos.springreactive.business.entity.Sale;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SaleService {

    Flux<Sale> getAllSales();

    Mono<Sale> getSaleById(Long id);

    Mono<Sale> createSale(Sale sale);

    Mono<Sale> updateSale(Long id, Sale sale);

    Mono<Void> deleteSale(Long id);
}
