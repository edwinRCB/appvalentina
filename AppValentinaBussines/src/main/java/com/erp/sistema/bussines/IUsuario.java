/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.bussines;

import com.erp.sistema.model.Usuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario_sistemas02
 */
@Local
public interface IUsuario {
    void Insert(Usuarios usuario);
    void FindbyID(int id);
    void DeletebyID(int id);
    List<Usuarios> getAll();
}
