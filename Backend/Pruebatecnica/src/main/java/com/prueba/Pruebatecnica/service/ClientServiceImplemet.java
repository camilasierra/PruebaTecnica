
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.Pruebatecnica.Dao.ClientDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * Esta clase implementa los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo identificando tambien su acceso 
 * @author camila sierra
 */
@Service
public class ClientServiceImplemet implements ClientService{
    @Autowired
    private ClientDao clientRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    @Transactional(readOnly = true)
    public Client findById(int id) {
        return  clientRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(int id_client) {
        clientRepository.deleteById(id_client);

    }

  
    
}
