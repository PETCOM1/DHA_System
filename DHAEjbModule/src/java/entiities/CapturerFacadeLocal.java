/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiities;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface CapturerFacadeLocal {

    void create(Capturer capturer);

    void edit(Capturer capturer);

    void remove(Capturer capturer);

    Capturer find(Object id);

    List<Capturer> findAll();

    List<Capturer> findRange(int[] range);

    int count();

    Integer countTotalOfSpecific(Integer id);
    
}
