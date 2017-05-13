/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario_sistemas02
 */
@Entity
@Table(name = "det_movimientos", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetMovimientos.findAll", query = "SELECT d FROM DetMovimientos d")
    , @NamedQuery(name = "DetMovimientos.findById", query = "SELECT d FROM DetMovimientos d WHERE d.id = :id")
    , @NamedQuery(name = "DetMovimientos.findByPrecio", query = "SELECT d FROM DetMovimientos d WHERE d.precio = :precio")
    , @NamedQuery(name = "DetMovimientos.findByCantidad", query = "SELECT d FROM DetMovimientos d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetMovimientos.findByEstado", query = "SELECT d FROM DetMovimientos d WHERE d.estado = :estado")
    , @NamedQuery(name = "DetMovimientos.findByCreatedAt", query = "SELECT d FROM DetMovimientos d WHERE d.createdAt = :createdAt")
    , @NamedQuery(name = "DetMovimientos.findByUpdatedAt", query = "SELECT d FROM DetMovimientos d WHERE d.updatedAt = :updatedAt")})
public class DetMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "cantidad")
    private Double cantidad;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "productos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Productos productosId;
    @JoinColumn(name = "movimientos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
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
