package com.prueba.Pruebatecnica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *Esta clase define los atributos del objeto producto, atributos que son iguales a los de la BD
 * @author Camila Sierra
 */
@Entity
@Table(name = "product")//tabla que hace referencia a la base de datos
public class Product {
    @Id
    @Column(name="id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generar autoincrementable llave primaria
    private int id_product;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="stock")
    private double stock;

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    
}
