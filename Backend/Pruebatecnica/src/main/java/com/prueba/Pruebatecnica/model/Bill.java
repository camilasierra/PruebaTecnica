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
@Table(name = "bill")//tabla que hace referencia a la base de datos
public class Bill {
    @Id
    @Column(name="num_bill")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generar autoincrementable llave primaria
    private int num_bill;
    @Column(name="date_bill")
    private Date date_bill;
    @Column(name="id_client")
    private int id_client;

    public int getNum_bill() {
        return num_bill;
    }

    public void setNum_bill(int num_bill) {
        this.num_bill = num_bill;
    }

    public Date getDate_bill() {
        return date_bill;
    }

    public void setDate_bill(Date date_bill) {
        this.date_bill = date_bill;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

   
}
