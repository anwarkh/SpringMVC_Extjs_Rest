package com.anwarkh.services;

import com.anwarkh.model.Product;
import java.util.List;

/**
 * Author: anwar kharrat
 * Blog: http://anwarkharrat.wordpress.com/
 */

public interface ProductService {

    public Product create(Product smartphone);

    public Product get(int id);

    public Product update(Product product);

    public Product delete(int id);

    public List<Product> getAll();

}
