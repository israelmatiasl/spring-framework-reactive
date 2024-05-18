package com.inventamos.springreactive.business.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
@Table("persons")
@Getter
@Setter
public class Person {

    @Id
    private Long id;
    private String name;
    private int age;
    private String country;
}
