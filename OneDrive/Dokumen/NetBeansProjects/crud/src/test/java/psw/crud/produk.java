/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psw.crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 *
 * @author sulta
 */

@Entity
public class produk {
    private int id;
    private int jumlah;
    private String nama;
    
    
    protected produk(){
    }
    
    @Id
    @GeneratedValue
    public int getId(){
        
        return id;
        
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName()
    {
        return nama;
    }
    public void setName(String nama)
    {
        this.nama = nama;
    }
    public int getJumlah()
    {
        return jumlah;
    }
    public void setJumlah(int jumlah)
    {
        this.jumlah = jumlah;
    }
}
