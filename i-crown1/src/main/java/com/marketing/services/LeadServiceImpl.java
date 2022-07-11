package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
private LeadRepository leadRepo;
	
	
	public void saveLead(Lead lead) {
		
leadRepo.save(lead);
	}
	public List<Lead>getLeads(){
		
		List<Lead>leads=leadRepo.findAll();
		return leads;
		
		
	}
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
	}
	public Lead findOneLead(long id) {
	Optional<Lead> findById = leadRepo.findById(id);
	Lead lead = findById.get();
		
		return lead;
		
		
	}

}
