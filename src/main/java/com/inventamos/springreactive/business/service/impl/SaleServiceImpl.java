package com.inventamos.springreactive.business.service.impl;

import com.inventamos.springreactive.business.entity.Sale;
import com.inventamos.springreactive.business.repository.SaleRepository;
import com.inventamos.springreactive.business.service.SaleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Flux<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Mono<Sale> getSaleById(Long id) {
        return saleRepository.findById(id);
    }

    @Override
    public Mono<Sale> createSale(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public Mono<Sale> updateSale(Long id, Sale sale) {
        return saleRepository.findById(id)
                .flatMap(existingSale -> {
                    existingSale.setPersonId(sale.getPersonId());
                    existingSale.setSaleDate(sale.getSaleDate());
                    existingSale.setAmount(sale.getAmount());
                    return saleRepository.save(existingSale);
                });
    }

    @Override
    public Mono<Void> deleteSale(Long id) {
        return saleRepository.deleteById(id);
    }
}
