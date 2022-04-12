
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.model.Client;
import java.util.List;

/**
  * * Esta interfaz define los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo 
 * @author camila sierra
 */
public interface ClientService {
    
    
    public List<Client>findAll();
    public Client save(Client client);
    public Client findById(int id);
    public void  delete(int id_client);
   
   
    
}
