/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psw.crud;


import java.util.List;
import org.glassfish.jaxb.core.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sulta
 */
@Service
public class produkService {
    @Autowired
    private produkRepository repo;
    
    public List<produk> listAll(){
            return repo.findAll();
        }

    public void save (produk produk){
             repo.save(produk);
        }
    public produk get(int id){
        return repo.findById(ID.ID).get();
    }
    
    public void delete(int id){
        repo.deleteById(id);
    }

    List<produk> All() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
