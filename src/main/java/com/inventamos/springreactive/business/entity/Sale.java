package com.inventamos.springreactive.business.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("sales")
@Getter
@Setter
public class Sale {
    @Id
    private Long id;

    @Column("person_id")
    private Long personId;

    @Column("sale_date")
    private LocalDate saleDate;
    private double amount;
    private String description;

    private Person person;
}
