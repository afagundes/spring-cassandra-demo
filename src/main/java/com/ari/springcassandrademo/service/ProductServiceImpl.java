package com.ari.springcassandrademo.service;

import com.ari.springcassandrademo.dto.ProductDTO;
import com.ari.springcassandrademo.model.Product;
import com.ari.springcassandrademo.repository.ProductRepository;
import com.datastax.oss.driver.api.core.uuid.Uuids;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product createNew(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(Uuids.timeBased());
        product.setTitle(productDTO.getTitle());
        product.setQuantity(productDTO.getQuantity());
        product.setTags(productDTO.getTags());

        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

}
