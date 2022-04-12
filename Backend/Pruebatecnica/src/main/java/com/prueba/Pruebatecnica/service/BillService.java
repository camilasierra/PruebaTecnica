
package com.prueba.Pruebatecnica.service;

import com.prueba.Pruebatecnica.model.Bill;
import java.util.List;

/**
 *
 * @author camila sierra
 */
public interface BillService {
    
    
    public List<Bill>findAll();
    public Bill save(Bill bill);
    public Bill findById(int id);
    public void  delete(int id_bill);
   
   
    
}
