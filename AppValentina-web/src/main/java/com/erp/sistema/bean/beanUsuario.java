/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.bean;

import com.erp.sistema.bussines.IUsuario;
import com.erp.sistema.model.Usuarios;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario_sistemas02
 */
@ManagedBean
@RequestScoped
public class beanUsuario implements Serializable{
    private Usuarios usuario;
    private List<Usuarios> listUsuarios;
    @EJB
    IUsuario ejbUsuario;
    
    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public List<Usuarios> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuarios> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    public void getAllUsuarios(){
        setListUsuarios(ejbUsuario.getAll());
    }

}
