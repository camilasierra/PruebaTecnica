
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.model.Product;
import java.util.List;

/**
 * * Esta clase define los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo  
 * @author camila sierra
 */
public interface ProductService {
    
    
    public List<Product>findAll();
    public Product save(Product product);
    public Product findById(int id);
    public void  delete(int id_product);
   
   
    
}
