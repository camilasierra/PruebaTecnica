
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.model.Detail;
import java.util.List;

/**
 * * Esta interfaz define los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo  
 * @author camila sierra
 */
public interface DetailService {
    
    
    public List<Detail>findAll();
    public Detail save(Detail detail);
    public Detail findById(int id);
    public void  delete(int id_detail);
   
   
    
}
