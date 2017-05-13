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
@Table(name = "cajaconfig", catalog = "dbvalentina", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajaconfig.findAll", query = "SELECT c FROM Cajaconfig c")
    , @NamedQuery(name = "Cajaconfig.findById", query = "SELECT c FROM Cajaconfig c WHERE c.id = :id")
    , @NamedQuery(name = "Cajaconfig.findByFecha", query = "SELECT c FROM Cajaconfig c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cajaconfig.findByCriterio", query = "SELECT c FROM Cajaconfig c WHERE c.criterio = :criterio")
    , @NamedQuery(name = "Cajaconfig.findByEstado", query = "SELECT c FROM Cajaconfig c WHERE c.estado = :estado")
    , @NamedQuery(name = "Cajaconfig.findByTurno", query = "SELECT c FROM Cajaconfig c WHERE c.turno = :turno")
    , @NamedQuery(name = "Cajaconfig.findByHorario", query = "SELECT c FROM Cajaconfig c WHERE c.horario = :horario")
    , @NamedQuery(name = "Cajaconfig.findByCreatedAt", query = "SELECT c FROM Cajaconfig c WHERE c.createdAt = :createdAt")
    , @NamedQuery(name = "Cajaconfig.findByUpdatedAt", query = "SELECT c FROM Cajaconfig c WHERE c.updatedAt = :updatedAt")})
public class Cajaconfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 10)
    @Column(name = "criterio")
    private String criterio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "turno")
    private String turno;
    @Size(max = 50)
    @Column(name = "horario")
    private String horario;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;
    @JoinColumn(name = "caja_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Caja cajaId;

    public Cajaconfig() {
    }

    public Cajaconfig(Integer id) {
        this.id = id;
    }

    public Cajaconfig(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
    }

    public Caja getCajaId() {
        return cajaId;
    }

    public void setCajaId(Caja cajaId) {
        this.cajaId = cajaId;
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
        if (!(object instanceof Cajaconfig)) {
            return false;
        }
        Cajaconfig other = (Cajaconfig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.erp.sistema.entities.Cajaconfig[ id=" + id + " ]";
    }
    
}
