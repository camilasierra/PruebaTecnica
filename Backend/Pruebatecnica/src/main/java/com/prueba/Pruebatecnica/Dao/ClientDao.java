
package com.prueba.Pruebatecnica.Dao;

import com.prueba.Pruebatecnica.model.Client;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


/**
 * *Esta interfaz busca definir los metodos que se utilizaran en el crud de la clase Cliente
 * @author camila sierra
 */
public interface ClientDao extends CrudRepository<Client,Integer>{
   
}
