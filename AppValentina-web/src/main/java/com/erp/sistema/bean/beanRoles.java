/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.bean;

import com.erp.sistema.bussines.IRoles;
import com.erp.sistema.model.Roles;
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
public class beanRoles {
    private Roles rol;
    private List<Roles> listRoles;
    @EJB
    IRoles ejbRoles;

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public List<Roles> getListRoles() {
        return listRoles;
    }

    public void setListRoles(List<Roles> listRoles) {
        this.listRoles = listRoles;
    }
    
}
