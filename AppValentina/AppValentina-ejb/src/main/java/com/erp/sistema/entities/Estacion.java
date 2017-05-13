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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario_sistemas02
 */
@Entity
@Table(name = "estacion", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estacion.findAll", query = "SELECT e FROM Estacion e")
    , @NamedQuery(name = "Estacion.findById", query = "SELECT e FROM Estacion e WHERE e.id = :id")
    , @NamedQuery(name = "Estacion.findByPais", query = "SELECT e FROM Estacion e WHERE e.pais = :pais")
    , @NamedQuery(name = "Estacion.findByDepartamento", query = "SELECT e FROM Estacion e WHERE e.departamento = :departamento")
    , @NamedQuery(name = "Estacion.findByCiudad", query = "SELECT e FROM Estacion e WHERE e.ciudad = :ciudad")
    , @NamedQuery(name = "Estacion.findByDistrito", query = "SELECT e FROM Estacion e WHERE e.distrito = :distrito")
    , @NamedQuery(name = "Estacion.findByDireccion", query = "SELECT e FROM Estacion e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Estacion.findByEstado", query = "SELECT e FROM Estacion e WHERE e.estado = :estado")
    , @NamedQuery(name = "Estacion.findByCreatedAt", query = "SELECT e FROM Estacion e WHERE e.createdAt = :createdAt")
    , @NamedQuery(name = "Estacion.findByUpdatedAt", query = "SELECT e FROM Estacion e WHERE e.updatedAt = :updatedAt")})
public class Estacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 240)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 240)
    @Column(name = "departamento")
    private String departamento;
    @Size(max = 240)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 240)
    @Column(name = "distrito")
    private String distrito;
    @Size(max = 240)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estacionid")
    private List<ProductoEstacion> productoEstacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estacionid")
    private List<Movimientos> movimientosList;
    @JoinColumn(name = "tipo_estacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
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

    @XmlTransient
    public List<ProductoEstacion> getProductoEstacionList() {
        return productoEstacionList;
    }

    public void setProductoEstacionList(List<ProductoEstacion> productoEstacionList) {
        this.productoEstacionList = productoEstacionList;
    }

    @XmlTransient
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
