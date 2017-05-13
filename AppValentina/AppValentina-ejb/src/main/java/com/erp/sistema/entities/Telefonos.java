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
@Table(name = "telefonos", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t")
    , @NamedQuery(name = "Telefonos.findById", query = "SELECT t FROM Telefonos t WHERE t.id = :id")
    , @NamedQuery(name = "Telefonos.findByContacto", query = "SELECT t FROM Telefonos t WHERE t.contacto = :contacto")
    , @NamedQuery(name = "Telefonos.findByNumero", query = "SELECT t FROM Telefonos t WHERE t.numero = :numero")
    , @NamedQuery(name = "Telefonos.findByCargo", query = "SELECT t FROM Telefonos t WHERE t.cargo = :cargo")
    , @NamedQuery(name = "Telefonos.findByEstado", query = "SELECT t FROM Telefonos t WHERE t.estado = :estado")
    , @NamedQuery(name = "Telefonos.findByCreatedAt", query = "SELECT t FROM Telefonos t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "Telefonos.findByUpdatedAt", query = "SELECT t FROM Telefonos t WHERE t.updatedAt = :updatedAt")})
public class Telefonos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 80)
    @Column(name = "contacto")
    private String contacto;
    @Size(max = 50)
    @Column(name = "numero")
    private String numero;
    @Size(max = 50)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "empresas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresas empresasId;

    public Telefonos() {
    }

    public Telefonos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public Empresas getEmpresasId() {
        return empresasId;
    }

    public void setEmpresasId(Empresas empresasId) {
        this.empresasId = empresasId;
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
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Telefonos[ id=" + id + " ]";
    }
    
}
