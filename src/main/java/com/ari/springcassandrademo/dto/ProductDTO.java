package com.ari.springcassandrademo.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProductDTO {

    private String title;
    private Integer quantity;
    private Set<String> tags = new HashSet<>();

}
