/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package psw.crud;

import org.glassfish.jaxb.core.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sulta
 */
public interface produkRepository extends JpaRepository<produk,ID>{

    public Object findById(int id);

    public void deleteById(int id);
    
}
