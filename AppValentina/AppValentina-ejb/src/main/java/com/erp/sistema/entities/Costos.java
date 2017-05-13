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
@Table(name = "costos", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costos.findAll", query = "SELECT c FROM Costos c")
    , @NamedQuery(name = "Costos.findById", query = "SELECT c FROM Costos c WHERE c.id = :id")
    , @NamedQuery(name = "Costos.findByCostoPromedio", query = "SELECT c FROM Costos c WHERE c.costoPromedio = :costoPromedio")
    , @NamedQuery(name = "Costos.findByEstado", query = "SELECT c FROM Costos c WHERE c.estado = :estado")
    , @NamedQuery(name = "Costos.findByCreatedAt", query = "SELECT c FROM Costos c WHERE c.createdAt = :createdAt")
    , @NamedQuery(name = "Costos.findByUpdatedAt", query = "SELECT c FROM Costos c WHERE c.updatedAt = :updatedAt")})
public class Costos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo_promedio")
    private Double costoPromedio;
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

    public Costos() {
    }

    public Costos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(Double costoPromedio) {
        this.costoPromedio = costoPromedio;
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
        if (!(object instanceof Costos)) {
            return false;
        }
        Costos other = (Costos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Costos[ id=" + id + " ]";
    }
    
}
