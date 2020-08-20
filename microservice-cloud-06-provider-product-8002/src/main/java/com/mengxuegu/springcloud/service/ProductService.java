package com.mengxuegu.springcloud.service;


import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

/**
 * @Auther: t_t
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
