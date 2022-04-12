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
@Table(name = "client")//tabla que hace referencia a la base de datos
public class Client {
    @Id
    @Column(name="id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generar autoincrementable llave primaria
    private int id_client;
    @Column(name="name")
    private String name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="direction")
    private String direction;
    @Column(name="birthdate")
    private Date birthdate;
    @Column(name="phone")
    private int phone;
    @Column(name="email")
    private String email;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    
    
}
