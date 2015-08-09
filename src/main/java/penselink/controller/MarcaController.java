/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penselink.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
    @RequestMapping(value="/marca/efetivarEdicao")    
    public @ResponseBody Marca efetivarEdicao(Model model, Marca marca) throws Exception{
    	return marca;
    }
    
    @RequestMapping("/marca/cadastrar")
    public String cadastrar(){
    	return "marca/formulario";
    }
    
    @RequestMapping(value="/marca/efetivarCadastro", method=RequestMethod.POST)    
    public @ResponseBody Marca efetivarCadastro(Model model, Marca marca){
    	marcaService.cadastrar(marca);
    	return marca;
    }
    
    @RequestMapping("/marca/remover/{id}")
    public String remover(Model model, @PathVariable ("id") Integer id){
    	System.out.println(id);
    	marcaService.remover(id);
    	return "/marca/marca";
    }
    
    @RequestMapping("/sucesso")
    public String successo (){
    	return "/marca/sucesso";
    }
    
}
