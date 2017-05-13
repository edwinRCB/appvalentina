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
@Table(name = "movimientos", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientos.findAll", query = "SELECT m FROM Movimientos m")
    , @NamedQuery(name = "Movimientos.findById", query = "SELECT m FROM Movimientos m WHERE m.id = :id")
    , @NamedQuery(name = "Movimientos.findByDescripcion", query = "SELECT m FROM Movimientos m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Movimientos.findByNrodocumento", query = "SELECT m FROM Movimientos m WHERE m.nrodocumento = :nrodocumento")
    , @NamedQuery(name = "Movimientos.findByFecha", query = "SELECT m FROM Movimientos m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Movimientos.findByHora", query = "SELECT m FROM Movimientos m WHERE m.hora = :hora")
    , @NamedQuery(name = "Movimientos.findByTotalUnidades", query = "SELECT m FROM Movimientos m WHERE m.totalUnidades = :totalUnidades")
    , @NamedQuery(name = "Movimientos.findByImpuesto", query = "SELECT m FROM Movimientos m WHERE m.impuesto = :impuesto")
    , @NamedQuery(name = "Movimientos.findByTotalPrecio", query = "SELECT m FROM Movimientos m WHERE m.totalPrecio = :totalPrecio")
    , @NamedQuery(name = "Movimientos.findByEstado", query = "SELECT m FROM Movimientos m WHERE m.estado = :estado")
    , @NamedQuery(name = "Movimientos.findByCreatedAt", query = "SELECT m FROM Movimientos m WHERE m.createdAt = :createdAt")
    , @NamedQuery(name = "Movimientos.findByUpdatedAt", query = "SELECT m FROM Movimientos m WHERE m.updatedAt = :updatedAt")})
public class Movimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nrodocumento")
    private String nrodocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_unidades")
    private Double totalUnidades;
    @Column(name = "impuesto")
    private Double impuesto;
    @Column(name = "total_precio")
    private Double totalPrecio;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movimientosId")
    private List<DetMovimientos> detMovimientosList;
    @JoinColumn(name = "tipo_movimientos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoMovimientos tipoMovimientosId;
    @JoinColumn(name = "Estacion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estacion estacionid;
    @JoinColumn(name = "documentos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Documentos documentosId;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;
    @JoinColumn(name = "empresas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresas empresasId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movimientosId")
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

    @XmlTransient
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

    @XmlTransient
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
