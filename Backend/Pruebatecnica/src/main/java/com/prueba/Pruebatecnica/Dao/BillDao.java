
package com.prueba.Pruebatecnica.Dao;

import com.prueba.Pruebatecnica.model.Bill;
import org.springframework.data.repository.CrudRepository;


/**
 *Esta interfaz busca definir los metodos que se utilizaran en el crud de la clase inventario
 * @author camila sierra
 */
public interface BillDao extends CrudRepository<Bill,Integer>{
    
    
   
}
