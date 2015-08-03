/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penselink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import penselink.model.entidades.Marca;
import penselink.service.MarcaService;

/**
 *
 * @author Geovan
 */
@Controller
public class MarcaController {
    
    @Autowired
    private MarcaService marcaService;
    
    @RequestMapping("/marca")
    public String listar(Model model){
        model.addAttribute("marcas",marcaService.listar());
        return "marca/marca";
    }
    
    @RequestMapping("/marca/editar/{id}")
    public String editar(Model model, @PathVariable ("id") Integer id){
        Marca marca = marcaService.getById(id);
        model.addAttribute("marca", marca);
    	return "marca/formulario";
    }
    
    @RequestMapping(value="/marca/efetivarEdicao", method=RequestMethod.POST)
    public String efetivarEdicao(Model model, Marca marca){
    
    }
    
    @RequestMapping("/marca/cadastrar")
    public String cadastrar(){
    	return "marca/formulario";
    }
    
    @RequestMapping(value="/marca/efetivarCadastro", method=RequestMethod.POST)
    public String efetivarCadastro(Model model, Marca marca){
    	marcaService.cadastrar(marca);
    	return "redirect:/marca";
    }
    
    @RequestMapping("/marca/remover/{id}")
    public String remover(Model model, @PathVariable ("id") Integer id){
    	System.out.println(id);
    	marcaService.remover(id);
    	return "redirect:/marca";
    }
}
