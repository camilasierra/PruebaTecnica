
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.Dao.BillDao;
import com.prueba.Pruebatecnica.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.Pruebatecnica.Dao.ClientDao;
import com.prueba.Pruebatecnica.model.Bill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * * Esta clase implementa los metodos del Crud a utilizar con sus respectivas entradas y salidas acordes al modelo identificando tambien su acceso 
 * @author camila sierra
 */
@Service
public class BillServiceImplemet implements BillService{
    @Autowired
    private BillDao billDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Bill> findAll() {
        return (List<Bill>) billDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Bill save(Bill bill) {
        return billDao.save(bill);
    }

    @Override
    @Transactional(readOnly = true)
    public Bill findById(int id) {
        return  billDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(int id_bill) {
        billDao.deleteById(id_bill);

    }  
    
}
