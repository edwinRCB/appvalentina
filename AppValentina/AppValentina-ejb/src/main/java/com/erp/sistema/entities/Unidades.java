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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario_sistemas02
 */
@Entity
@Table(name = "unidades", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u")
    , @NamedQuery(name = "Unidades.findById", query = "SELECT u FROM Unidades u WHERE u.id = :id")
    , @NamedQuery(name = "Unidades.findByNombre", query = "SELECT u FROM Unidades u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Unidades.findByAbreviatura", query = "SELECT u FROM Unidades u WHERE u.abreviatura = :abreviatura")
    , @NamedQuery(name = "Unidades.findByPrecioVenta", query = "SELECT u FROM Unidades u WHERE u.precioVenta = :precioVenta")
    , @NamedQuery(name = "Unidades.findByEstado", query = "SELECT u FROM Unidades u WHERE u.estado = :estado")
    , @NamedQuery(name = "Unidades.findByCreatedAt", query = "SELECT u FROM Unidades u WHERE u.createdAt = :createdAt")
    , @NamedQuery(name = "Unidades.findByUpdatedAt", query = "SELECT u FROM Unidades u WHERE u.updatedAt = :updatedAt")})
public class Unidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "abreviatura")
    private String abreviatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_venta")
    private double precioVenta;
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

    public Unidades() {
    }

    public Unidades(Integer id) {
        this.id = id;
    }

    public Unidades(Integer id, String nombre, String abreviatura, double precioVenta) {
        this.id = id;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.precioVenta = precioVenta;
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

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Unidades[ id=" + id + " ]";
    }
    
}
