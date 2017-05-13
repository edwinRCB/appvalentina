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
@Table(name = "caja", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c")
    , @NamedQuery(name = "Caja.findById", query = "SELECT c FROM Caja c WHERE c.id = :id")
    , @NamedQuery(name = "Caja.findByNombre", query = "SELECT c FROM Caja c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Caja.findByFecha", query = "SELECT c FROM Caja c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Caja.findByHora", query = "SELECT c FROM Caja c WHERE c.hora = :hora")
    , @NamedQuery(name = "Caja.findByTotal", query = "SELECT c FROM Caja c WHERE c.total = :total")
    , @NamedQuery(name = "Caja.findByActivo", query = "SELECT c FROM Caja c WHERE c.activo = :activo")
    , @NamedQuery(name = "Caja.findByApertura", query = "SELECT c FROM Caja c WHERE c.apertura = :apertura")
    , @NamedQuery(name = "Caja.findByEstado", query = "SELECT c FROM Caja c WHERE c.estado = :estado")})
public class Caja implements Serializable {

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
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "activo")
    private String activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "apertura")
    private double apertura;
    @Size(max = 1)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cajaId")
    private List<Cajaconfig> cajaconfigList;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;
    @JoinColumn(name = "movimientos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Movimientos movimientosId;

    public Caja() {
    }

    public Caja(Integer id) {
        this.id = id;
    }

    public Caja(Integer id, String nombre, Date fecha, Date hora, String activo, double apertura) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.activo = activo;
        this.apertura = apertura;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Cajaconfig> getCajaconfigList() {
        return cajaconfigList;
    }

    public void setCajaconfigList(List<Cajaconfig> cajaconfigList) {
        this.cajaconfigList = cajaconfigList;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
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
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Caja[ id=" + id + " ]";
    }
    
}
