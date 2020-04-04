package com.nusabank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nusabank.app.model.Nasabah;
import com.nusabank.app.service.NasabahService;

@Controller
public class NasabahController {

	private NasabahService nasabahService;
	
	@Autowired(required=true)
	@Qualifier(value="nasabahService")
	public void setNasabahService(NasabahService ns) {
		this.nasabahService=ns;
	}
	
	@RequestMapping(value = "/nasabah", method = RequestMethod.GET)
	public String listNasabah(Model model) {
	model.addAttribute("nasabah", new Nasabah());
	model.addAttribute("listNasabah", this.nasabahService.listNasabah());
	return "nasabah";
	}

	@RequestMapping(value= "/nasabah/add", method = RequestMethod.POST)
	public String addNasabah(@ModelAttribute("nasabah") Nasabah n){

	if(n.getId() == 0){
		this.nasabahService.addNasabah(n);
	}else{
		this.nasabahService.updateNasabah(n);
	}

	return "redirect:/nasabah";

	}

	@RequestMapping("/remove/{id}")
	public String removeNasabah(@PathVariable("id") int id){

	this.nasabahService.removeNasabah(id);
	return "redirect:/nasabah";
	}

	@RequestMapping("/edit/{id}")
	public String editNasabah(@PathVariable("id") int id, Model model){
	model.addAttribute("nasabah", this.nasabahService.getNasabahById(id));
	model.addAttribute("listPersons", this.nasabahService.listNasabah());
	return "nasabah";
	}

}
