package com.inventamos.springreactive.business.repository;

import com.inventamos.springreactive.business.entity.Sale;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SaleRepository extends ReactiveCrudRepository<Sale, Long> {
}