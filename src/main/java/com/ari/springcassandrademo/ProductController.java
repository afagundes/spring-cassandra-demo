package com.ari.springcassandrademo;

import com.ari.springcassandrademo.dto.ProductDTO;
import com.ari.springcassandrademo.model.Product;
import com.ari.springcassandrademo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDTO productDTO) {
        productService.createNew(productDTO);
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

}
