/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psw.crud;

import ch.qos.logback.core.model.Model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sulta
 */
@Controller

public class AppController {
    @Autowired
    private produkService service;
    
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<produk> listproduk = service.All();
        model.addAttribute("listProduk",listproduk);
        
        return "index";
    }
}
