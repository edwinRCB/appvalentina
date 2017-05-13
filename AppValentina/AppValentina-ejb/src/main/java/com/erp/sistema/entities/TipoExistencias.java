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
@Table(name = "tipo_existencias", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoExistencias.findAll", query = "SELECT t FROM TipoExistencias t")
    , @NamedQuery(name = "TipoExistencias.findById", query = "SELECT t FROM TipoExistencias t WHERE t.id = :id")
    , @NamedQuery(name = "TipoExistencias.findByNombre", query = "SELECT t FROM TipoExistencias t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoExistencias.findByEstado", query = "SELECT t FROM TipoExistencias t WHERE t.estado = :estado")
    , @NamedQuery(name = "TipoExistencias.findByCreatedAt", query = "SELECT t FROM TipoExistencias t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "TipoExistencias.findByUpdatedAt", query = "SELECT t FROM TipoExistencias t WHERE t.updatedAt = :updatedAt")})
public class TipoExistencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private Integer nombre;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoExistenciasId")
    private List<Productos> productosList;

    public TipoExistencias() {
    }

    public TipoExistencias(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
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
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
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
        if (!(object instanceof TipoExistencias)) {
            return false;
        }
        TipoExistencias other = (TipoExistencias) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.TipoExistencias[ id=" + id + " ]";
    }
    
}
