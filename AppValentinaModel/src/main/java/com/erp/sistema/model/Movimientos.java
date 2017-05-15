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

public class Movimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String descripcion;
    private String nrodocumento;
    private Date fecha;
    private Date hora;
    private Double totalUnidades;
    private Double impuesto;
    private Double totalPrecio;
    private String estado;
    private Date createdAt;
    private Date updatedAt;
    private List<DetMovimientos> detMovimientosList;
    private TipoMovimientos tipoMovimientosId;
    private Estacion estacionid;
    private Documentos documentosId;
    private Usuarios usuariosId;
    private Empresas empresasId;
    private List<Caja> cajaList;

    public Movimientos() {
    }

    public Movimientos(Integer id) {
        this.id = id;
    }

    public Movimientos(Integer id, String descripcion, String nrodocumento, Date fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.nrodocumento = nrodocumento;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(String nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Double getTotalUnidades() {
        return totalUnidades;
    }

    public void setTotalUnidades(Double totalUnidades) {
        this.totalUnidades = totalUnidades;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
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

    public List<DetMovimientos> getDetMovimientosList() {
        return detMovimientosList;
    }

    public void setDetMovimientosList(List<DetMovimientos> detMovimientosList) {
        this.detMovimientosList = detMovimientosList;
    }

    public TipoMovimientos getTipoMovimientosId() {
        return tipoMovimientosId;
    }

    public void setTipoMovimientosId(TipoMovimientos tipoMovimientosId) {
        this.tipoMovimientosId = tipoMovimientosId;
    }

    public Estacion getEstacionid() {
        return estacionid;
    }

    public void setEstacionid(Estacion estacionid) {
        this.estacionid = estacionid;
    }

    public Documentos getDocumentosId() {
        return documentosId;
    }

    public void setDocumentosId(Documentos documentosId) {
        this.documentosId = documentosId;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
    }

    public Empresas getEmpresasId() {
        return empresasId;
    }

    public void setEmpresasId(Empresas empresasId) {
        this.empresasId = empresasId;
    }

    public List<Caja> getCajaList() {
        return cajaList;
    }

    public void setCajaList(List<Caja> cajaList) {
        this.cajaList = cajaList;
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
        if (!(object instanceof Movimientos)) {
            return false;
        }
        Movimientos other = (Movimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Movimientos[ id=" + id + " ]";
    }
    
}
