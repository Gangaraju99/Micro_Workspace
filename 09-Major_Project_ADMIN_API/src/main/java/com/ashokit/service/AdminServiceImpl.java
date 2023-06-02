package com.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.CaseWorkerEntity;
import com.ashokit.entity.binding.CaseWorkerForm;
import com.ashokit.entity.binding.PlanForm;
import com.ashokit.repo.AdminRepository;
import com.ashokit.repo.PlanRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private PlanRepository planRepo;
	

	@Override
	public String saveEmployee(CaseWorkerForm form) {
		
		
		
		Optional<CaseWorkerEntity> findById = adminRepo.findById(form.getUserId());
		if(findById.isPresent()) {
			
			
			
			
			
			
		}
		
		CaseWorkerEntity entity = new CaseWorkerEntity();
		
		//LocalDate date = LocalDate.parse(form.getDob());
		BeanUtils.copyProperties(form,entity);
		
		

		
		
		adminRepo.save(entity);
		
		
		System.out.println("data is saved");
		
		return "saved";
	}

	@Override
	public String savePlan(PlanForm form) {
		
			
		
		return null;
	}
	
	
	
	
	
	

}
