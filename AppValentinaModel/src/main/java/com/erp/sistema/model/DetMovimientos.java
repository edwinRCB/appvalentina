/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author usuario_sistemas02
 */
public class DetMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Double precio;
    private Double cantidad;
    private String estado;
    private Date createdAt;
    private Date updatedAt;
    private Productos productosId;
    private Movimientos movimientosId;

    public DetMovimientos() {
    }

    public DetMovimientos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Productos getProductosId() {
        return productosId;
    }

    public void setProductosId(Productos productosId) {
        this.productosId = productosId;
    }

    public Movimientos getMovimientosId() {
        return movimientosId;
    }

    public void setMovimientosId(Movimientos movimientosId) {
        this.movimientosId = movimientosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetMovimientos)) {
            return false;
        }
        DetMovimientos other = (DetMovimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.DetMovimientos[ id=" + id + " ]";
    }
    
}
