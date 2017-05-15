/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author usuario_sistemas02
 */

public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private Date fecha;
    private Date hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double total;
    private String activo;
    private double apertura;
    private String estado;
    private List<Cajaconfig> cajaconfigList;
    private Usuarios usuariosId;
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
