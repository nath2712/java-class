package edu.supavenir.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.orm.models.Groupe;
import edu.supavenir.orm.models.Organisation;
import edu.supavenir.orm.repositories.OrgaRepository;

@Controller
@RequestMapping("/orga")
public class OrganisationController {

	@Autowired
	private OrgaRepository repository;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Organisation> organisations = repository.findAll();
		System.out.println(organisations);
		model.addAttribute("organisations",organisations);
		return "index";
		
	}
	@GetMapping("/add")
	public String formAction() {
		return "formOrga";
		
	}
	
	@PostMapping("/add")
	public @ResponseBody String addAction(Organisation orga) {
		Groupe group = new Groupe();
		group.setName("Etudiants");
		group.setOrganisation(orga);
		orga.getGroups().add(group);
		repository.saveAndFlush(orga);
		return "orga ajouté"+orga;
		
		
		
	}
	
	
	
	
	
	
}
