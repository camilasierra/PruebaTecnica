
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.Dao.BillDao;
import com.prueba.Pruebatecnica.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.Pruebatecnica.Dao.ClientDao;
import com.prueba.Pruebatecnica.Dao.ProductDao;
import com.prueba.Pruebatecnica.model.Bill;
import com.prueba.Pruebatecnica.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * Esta clase implementa los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo identificando tambien su acceso 
 * @author camila sierra
 */
@Service
public class ProductServiceImplemet implements ProductService{
    @Autowired
    private ProductDao productDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(int id) {
        return  productDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(int id_product) {
        productDao.deleteById(id_product);

    }  
    
}
