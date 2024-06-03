package com.gus.backend.cartapp.backend_cartapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gus.backend.cartapp.backend_cartapp.models.entities.Product;
import com.gus.backend.cartapp.backend_cartapp.repositories.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> finAll() {
        return (List<Product>)repository.findAll();
    }

    
}
