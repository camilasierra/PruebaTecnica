package com.prueba.Pruebatecnica.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Camila Sierra
 */
@Entity
@Table(name = "detail")//tabla que hace referencia a la base de datos
public class Detail {
    @Id
    @Column(name="num_detail")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generar autoincrementable llave primaria
    private int num_detail;
    @Column(name="id_bill")
    private int id_bill;
    @Column(name="id_product")
    private int id_product;
    @Column(name="amount")
    private int amount;
    @Column(name="price")
    private double price;

    public int getNum_detail() {
        return num_detail;
    }

    public void setNum_detail(int num_detail) {
        this.num_detail = num_detail;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
}
