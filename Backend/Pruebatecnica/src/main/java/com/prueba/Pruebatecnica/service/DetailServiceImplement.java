
package com.prueba.Pruebatecnica.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.Pruebatecnica.Dao.DetailDao;
import com.prueba.Pruebatecnica.model.Detail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * Esta clase implementa los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo identificando tambien su acceso 
 * @author camila sierra
 */
@Service
public class DetailServiceImplement implements DetailService{
    @Autowired
    private DetailDao detailDao;

    @Override
    @Transactional(readOnly = true)
    public List<Detail> findAll() {
        return (List<Detail>) detailDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Detail save(Detail detail) {
        return detailDao.save(detail);
    }

    @Override
    @Transactional(readOnly = true)
    public Detail findById(int id) {
        return  detailDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(int id_detail) {
        detailDao.deleteById(id_detail);

    }

  
    
}
