package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.services.LeadService;
import com.marketing.utility.EmailService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/viewLeadPage")
public String viewSaveLeadPage() {
	
	return "new_lead";
	
}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		emailService.sendSimpleMessage(lead.getEmail(), "subject", "body of mail");
		model.addAttribute("msg", "Lead is saved");
		System.out.println(lead.getFirstName());
		System.out.println(lead.getLastName());
		System.out.println(lead.getEmail());
		System.out.println(lead.getMobile());
		
		return "new_lead";
		
		
	}
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);
		System.out.println(leads);
		return"lead_search_result";
	}
	@RequestMapping("/delete")
	public String deleteOneLocation(@RequestParam("id") long id,ModelMap model) {
		
		leadService.deleteLead(id);
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);

		
		return"lead_search_result";
		
	}
	@RequestMapping("/update")
	public String updateOneLocation(@RequestParam("id") long id,ModelMap model) {
		
		Lead lead = leadService.findOneLead(id);
		model.addAttribute("leads", lead);
		
		return"update_lead";
		
	}
}
