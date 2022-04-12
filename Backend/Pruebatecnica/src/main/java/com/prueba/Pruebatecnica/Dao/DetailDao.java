
package com.prueba.Pruebatecnica.Dao;

import com.prueba.Pruebatecnica.model.Detail;
import org.springframework.data.repository.CrudRepository;


/**
 * *Esta interfaz busca definir los metodos que se utilizaran en el crud de la calse Detalle
 * @author camila sierra
 */
public interface DetailDao extends CrudRepository<Detail,Integer>{
   
}
