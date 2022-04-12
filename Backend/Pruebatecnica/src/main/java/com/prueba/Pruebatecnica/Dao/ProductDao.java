
package com.prueba.Pruebatecnica.Dao;

import com.prueba.Pruebatecnica.model.Product;
import org.springframework.data.repository.CrudRepository;


/**
 * *Esta interfaz busca definir los metodos que se utilizaran en el crud de la calse producto

 * @author camila sierra
 */
public interface ProductDao extends CrudRepository<Product,Integer>{
   
}
