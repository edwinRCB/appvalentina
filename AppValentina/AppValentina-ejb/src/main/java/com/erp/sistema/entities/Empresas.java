/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario_sistemas02
 */
@Entity
@Table(name = "empresas", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findById", query = "SELECT e FROM Empresas e WHERE e.id = :id")
    , @NamedQuery(name = "Empresas.findByRazonsocial", query = "SELECT e FROM Empresas e WHERE e.razonsocial = :razonsocial")
    , @NamedQuery(name = "Empresas.findByRuc", query = "SELECT e FROM Empresas e WHERE e.ruc = :ruc")
    , @NamedQuery(name = "Empresas.findByDireccion", query = "SELECT e FROM Empresas e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empresas.findByEstado", query = "SELECT e FROM Empresas e WHERE e.estado = :estado")
    , @NamedQuery(name = "Empresas.findByCreatedAt", query = "SELECT e FROM Empresas e WHERE e.createdAt = :createdAt")
    , @NamedQuery(name = "Empresas.findByUpdatedAt", query = "SELECT e FROM Empresas e WHERE e.updatedAt = :updatedAt")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 15)
    @Column(name = "ruc")
    private String ruc;
    @Size(max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresasId")
    private List<Movimientos> movimientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresasId")
    private List<Telefonos> telefonosList;

    public Empresas() {
    }

    public Empresas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    @XmlTransient
    public List<Movimientos> getMovimientosList() {
        return movimientosList;
    }

    public void setMovimientosList(List<Movimientos> movimientosList) {
        this.movimientosList = movimientosList;
    }

    @XmlTransient
    public List<Telefonos> getTelefonosList() {
        return telefonosList;
    }

    public void setTelefonosList(List<Telefonos> telefonosList) {
        this.telefonosList = telefonosList;
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
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Empresas[ id=" + id + " ]";
    }
    
}
