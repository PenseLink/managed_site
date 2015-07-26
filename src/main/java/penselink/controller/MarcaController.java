/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penselink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import penselink.service.MarcaService;

/**
 *
 * @author Geovan
 */
@Controller
public class MarcaController {
    
    @Autowired
    private MarcaService marcaService;
    
    @RequestMapping("marca/listar")
    public String listar(Model model){
        model.addAttribute("marcas",marcaService.listar());
        return "marca/listar";
    }
    
    @RequestMapping("marca/editar/1")
    public String editar(){
        return "marca/editar";
    }
}
