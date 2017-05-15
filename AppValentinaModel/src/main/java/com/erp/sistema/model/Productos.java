/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author usuario_sistemas02
 */
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipounidad;
    private Date createdAt;
    private Date updatedAt;
    private List<DetMovimientos> detMovimientosList;
    private List<ProductoEstacion> productoEstacionList;
    private List<Costos> costosList;
    private List<Unidades> unidadesList;
    private TipoExistencias tipoExistenciasId;
    private Categorias categoriasId;

    public Productos() {
    }

    public Productos(Integer id) {
        this.id = id;
    }

    public Productos(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipounidad() {
        return tipounidad;
    }

    public void setTipounidad(String tipounidad) {
        this.tipounidad = tipounidad;
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

    public List<DetMovimientos> getDetMovimientosList() {
        return detMovimientosList;
    }

    public void setDetMovimientosList(List<DetMovimientos> detMovimientosList) {
        this.detMovimientosList = detMovimientosList;
    }

    public List<ProductoEstacion> getProductoEstacionList() {
        return productoEstacionList;
    }

    public void setProductoEstacionList(List<ProductoEstacion> productoEstacionList) {
        this.productoEstacionList = productoEstacionList;
    }

    public List<Costos> getCostosList() {
        return costosList;
    }

    public void setCostosList(List<Costos> costosList) {
        this.costosList = costosList;
    }

    public List<Unidades> getUnidadesList() {
        return unidadesList;
    }

    public void setUnidadesList(List<Unidades> unidadesList) {
        this.unidadesList = unidadesList;
    }

    public TipoExistencias getTipoExistenciasId() {
        return tipoExistenciasId;
    }

    public void setTipoExistenciasId(TipoExistencias tipoExistenciasId) {
        this.tipoExistenciasId = tipoExistenciasId;
    }

    public Categorias getCategoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(Categorias categoriasId) {
        this.categoriasId = categoriasId;
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
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Productos[ id=" + id + " ]";
    }
    
}
