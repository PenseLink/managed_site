/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penselink.controller;

import java.util.ArrayList;
import java.util.List;

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
    
    @RequestMapping(value="/teste")
    public String teste(){
    	return "testa";
    }
    
    @RequestMapping(value="/marca/teste")
    public String testaWB(){
    	return "wb_teste/NewFile";
    }
    
    //Abre o CRUD de marca
    @RequestMapping("/marca")
    public String listar(Model model){
        model.addAttribute("marcas",marcaService.listar());
        return "marca/marca";
    }
    
    
    @RequestMapping(value="/marca/webService/{id}")
    public @ResponseBody Marca marcaWebService(@PathVariable("id")Integer id,Model model, Marca marca){
    	return marcaService.getById(id);   	
    }
    
    @RequestMapping(value="/marca/webServiceListar")
    public @ResponseBody List<Marca> marcaWebService(Model model, Marca marca){    	
    	return marcaService.listar();   	
    }
    
    
    public ArrayList<Marca> listarPaginacao(){
    	/*
    	 * parametros: 
    		quantidade de registros por p�gina
    		ordem dos registros
    		p�gina destino
    	*/
    	return null;
    }
    
    //Metodo que abre a modal de edicao
    @RequestMapping("/marca/editar/{id}")
    public String editar(Model model, @PathVariable ("id") Integer id){
        Marca marca = marcaService.getById(id);
        model.addAttribute("marca", marca);
    	return "marca/formulario";
    }
    
    //Metodo que efetivamente edita o item
    @RequestMapping(value="/marca/efetivarEdicao")    
    public @ResponseBody Marca efetivarEdicao(Model model, Marca marca) throws Exception{
    	marcaService.editar(marca);
    	return marca;
    }
    
    //Metodo que abre a modal de cadastro
    @RequestMapping("/marca/cadastrar")
    public String cadastrar(){
    	return "marca/formulario";
    }
    
    //Metodo que efetiva o cadastro do item
    @RequestMapping(value="/marca/efetivarCadastro", method=RequestMethod.POST)    
    public @ResponseBody Marca efetivarCadastro(Model model, Marca marca){
    	marcaService.cadastrar(marca);
    	return marca;
    }
    
    //Metodo que abre o dialogo de confirmacao de remocao
    @RequestMapping("/marca/remover/{id}")
    public String dialogoRemover(Model model, @PathVariable ("id") Integer id){
    	Marca marca = marcaService.getById(id);
        model.addAttribute("marca", marca);
    	return "marca/dialog";
    }
    
    //Metodo que efetivamente remove o item
    @RequestMapping("/marca/remove/{id}")
    public String remover(Model model, @PathVariable ("id") Integer id){
    	marcaService.remover(id);
    	return "/marca/marca";
    }
    
    //Abre a modal de sucesso
    @RequestMapping("/sucesso")
    public String successo (){
    	return "/marca/sucesso";
    }
    
}
