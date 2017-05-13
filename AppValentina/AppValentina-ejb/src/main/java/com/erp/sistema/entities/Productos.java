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
@Table(name = "productos", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findById", query = "SELECT p FROM Productos p WHERE p.id = :id")
    , @NamedQuery(name = "Productos.findByNombre", query = "SELECT p FROM Productos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Productos.findByTipounidad", query = "SELECT p FROM Productos p WHERE p.tipounidad = :tipounidad")
    , @NamedQuery(name = "Productos.findByCreatedAt", query = "SELECT p FROM Productos p WHERE p.createdAt = :createdAt")
    , @NamedQuery(name = "Productos.findByUpdatedAt", query = "SELECT p FROM Productos p WHERE p.updatedAt = :updatedAt")})
public class Productos implements Serializable {

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
    @Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 100)
    @Column(name = "tipounidad")
    private String tipounidad;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosId")
    private List<DetMovimientos> detMovimientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosId")
    private List<ProductoEstacion> productoEstacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosId")
    private List<Costos> costosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosId")
    private List<Unidades> unidadesList;
    @JoinColumn(name = "tipo_existencias_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoExistencias tipoExistenciasId;
    @JoinColumn(name = "categorias_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
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

    @XmlTransient
    public List<DetMovimientos> getDetMovimientosList() {
        return detMovimientosList;
    }

    public void setDetMovimientosList(List<DetMovimientos> detMovimientosList) {
        this.detMovimientosList = detMovimientosList;
    }

    @XmlTransient
    public List<ProductoEstacion> getProductoEstacionList() {
        return productoEstacionList;
    }

    public void setProductoEstacionList(List<ProductoEstacion> productoEstacionList) {
        this.productoEstacionList = productoEstacionList;
    }

    @XmlTransient
    public List<Costos> getCostosList() {
        return costosList;
    }

    public void setCostosList(List<Costos> costosList) {
        this.costosList = costosList;
    }

    @XmlTransient
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
