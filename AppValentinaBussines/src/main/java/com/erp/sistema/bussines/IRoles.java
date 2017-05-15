/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.sistema.bussines;

import com.erp.sistema.model.Roles;
import java.util.List;

/**
 *
 * @author usuario_sistemas02
 */
public interface IRoles {
    void Insert(Roles rol);
    void FindbyID(int id);
    void DeletebyID(int id);
    List<Roles> getAll();
}
