/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.service;

import com.erp.sistema.bussines.IUsuario;
import com.erp.sistema.model.Usuarios;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author usuario_sistemas02
 */
public class serviceUsuarios implements IUsuario{
    @EJB
    IUsuario ejbServiceUsuario;
    @Override
    public void Insert(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FindbyID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletebyID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
