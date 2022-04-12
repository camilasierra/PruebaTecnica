package com.prueba.Pruebatecnica.controller;

import com.prueba.Pruebatecnica.model.Bill;
import com.prueba.Pruebatecnica.model.Client;
import com.prueba.Pruebatecnica.model.Detail;
import com.prueba.Pruebatecnica.model.Product;
import com.prueba.Pruebatecnica.service.BillService;
import com.prueba.Pruebatecnica.service.ClientService;
import com.prueba.Pruebatecnica.service.DetailService;
import com.prueba.Pruebatecnica.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camila sierra
 */
@RestController
@CrossOrigin(origins = "*")//dar acceso concetarnos desde cualquier parte
@RequestMapping({"/api"})//ruta 
public class MainController {
    @Autowired//para insertar dependencias
    private ClientService clientService;
    
    @Autowired//para insertar dependencias
    private ProductService productService;
    
     @Autowired//para insertar dependencias
    private BillService billService;
     
      @Autowired//para insertar dependencias
    private DetailService detailService;
    
    //listar
    @GetMapping("/clients")
    public List<Client>listat(){
        return clientService.findAll();
    }
    
    //Guardar
    @PostMapping("/clients")
    public Client saveat(@RequestBody Client client){
        return clientService.save(client);
    }
    
    //obtner un cliente
    @GetMapping("/clients/{id}")
    public Client oneClient(@PathVariable int id ){
        return clientService.findById(id);
    }
    
    //modificar un cliente
    @PutMapping("/clients/{id}")
    public Client modify(@RequestBody Client client,@PathVariable int id ){
        Client clientActual = clientService.findById(id);
        clientActual.setName(client.getName());
        clientActual.setLast_name(client.getLast_name());
        clientActual.setBirthdate(client.getBirthdate());
        clientActual.setDirection(client.getDirection());
        clientActual.setEmail(client.getEmail());
        clientActual.setPhone(client.getPhone());
        return clientService.save(clientActual);
    }
    
    //eliminar un cliente
    @DeleteMapping("/clients/{id}")
    public void eliminate(@PathVariable int id ){
        clientService.delete(id);
    }
    
    
    //listar Productos
    @GetMapping("/products")
    public List<Product>listatProduct(){
        return productService.findAll();
    }
    
    //Guardar Product
    @PostMapping("/products")
    public Product saveatProduct(@RequestBody Product product){
        return productService.save(product);
    }
    
    //obtner un Product
    @GetMapping("/products/{id}")
    public Product oneProduct(@PathVariable int id ){
        return productService.findById(id);
    }
    
    //modificar un Product
    @PutMapping("/products/{id}")
    public Product modifyProduct(@RequestBody Product product,@PathVariable int id ){
        Product productActual = productService.findById(id);
        productActual.setName(product.getName());
        productActual.setPrice(product.getPrice());
        productActual.setStock(product.getStock());
        return productService.save(productActual);
    }
    
    //eliminar un cliente
    @DeleteMapping("/products/{id}")
    public void eliminateProduct(@PathVariable int id ){
        productService.delete(id);
    }
    
    
    
    //listar Bill
    @GetMapping("/bills")
    public List<Bill>listatBill(){
        return billService.findAll();
    }
    
    //Guardar
    @PostMapping("/bills")
    public Bill saveatBill(@RequestBody Bill bill){
        System.out.println("este es el valor de id " + bill.getNum_bill());
        System.out.println("este es el valor de idcli " + bill.getId_client());
        System.out.println("este es el valor de date " + bill.getDate_bill());
       // Detail det = new Detail();
        //det.setId_bill(bill.getNum_bill());
        //this.saveatDetail(new Detail());
        
        return billService.save(bill);
        
        
    }
    
    //obtner un cliente
    @GetMapping("/bills/{id}")
    public Bill oneBill(@PathVariable int id ){
        return billService.findById(id);
    }
    
    //modificar un cliente
    @PutMapping("/bills/{id}")
    public Bill modifyBill(@RequestBody Bill bill,@PathVariable int id ){
        Bill billActual = billService.findById(id);
        billActual.setDate_bill(bill.getDate_bill());
        return billService.save(billActual);
    }
    
    //eliminar un cliente
    @DeleteMapping("/bills/{id}")
    public void eliminateBill(@PathVariable int id ){
        billService.delete(id);
    }
    
    
    
    
    
    //listar Detail
    @GetMapping("/details")
    public List<Detail>listatDetail(){
        return detailService.findAll();
    }
    
    //Guardar Detail
    @PostMapping("/details")
    public Detail saveatDetail(@RequestBody Detail detail){
        return detailService.save(detail);
    }
    
    //obtner un Detail
    @GetMapping("/details/{id}")
    public Detail oneDetail(@PathVariable int id ){
        return detailService.findById(id);
    }
    
    //modificar un Detail
    @PutMapping("/details/{id}")
    public Detail modify(@RequestBody Detail detail,@PathVariable int id ){
        Detail detailActual = detailService.findById(id);
        detailActual.setAmount(detail.getAmount());
        detailActual.setPrice(detail.getPrice());
        return detailService.save(detailActual);
    }
    
    //eliminar un Detail
    @DeleteMapping("/details/{id}")
    public void eliminateDetail(@PathVariable int id ){
        detailService.delete(id);
    }
    
}
