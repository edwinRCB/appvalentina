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

public class Estacion implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String pais;
    private String departamento;
    private String ciudad;
    private String distrito;
    private String direccion;
    private String estado;
    private Date createdAt;
    private Date updatedAt;
    private List<ProductoEstacion> productoEstacionList;
    private List<Movimientos> movimientosList;
    private TipoEstacion tipoEstacionId;

    public Estacion() {
    }

    public Estacion(Integer id) {
        this.id = id;
    }

    public Estacion(Integer id, String pais, String departamento) {
        this.id = id;
        this.pais = pais;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<ProductoEstacion> getProductoEstacionList() {
        return productoEstacionList;
    }

    public void setProductoEstacionList(List<ProductoEstacion> productoEstacionList) {
        this.productoEstacionList = productoEstacionList;
    }

    public List<Movimientos> getMovimientosList() {
        return movimientosList;
    }

    public void setMovimientosList(List<Movimientos> movimientosList) {
        this.movimientosList = movimientosList;
    }

    public TipoEstacion getTipoEstacionId() {
        return tipoEstacionId;
    }

    public void setTipoEstacionId(TipoEstacion tipoEstacionId) {
        this.tipoEstacionId = tipoEstacionId;
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
        if (!(object instanceof Estacion)) {
            return false;
        }
        Estacion other = (Estacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Estacion[ id=" + id + " ]";
    }
    
}
