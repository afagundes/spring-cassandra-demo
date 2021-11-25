package com.ari.springcassandrademo.service;

import com.ari.springcassandrademo.dto.ProductDTO;
import com.ari.springcassandrademo.model.Product;

import java.util.List;

public interface ProductService {

    Product createNew(ProductDTO productDTO);

    List<Product> findAll();

}
