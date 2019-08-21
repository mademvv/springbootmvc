package com.slashcode.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slashcode.employee.model.Employee;
import com.slashcode.employee.model.Generic_Fields;
import com.slashcode.employee.service.IGeneric_FieldsService;



@Controller
public class Generic_FieldsController {

	@Autowired
	IGeneric_FieldsService serviceRef;
	
	@RequestMapping("/addNewGeneric_Fields")
	public String addNewGeneric_Fields(Model model) {
		model.addAttribute("generic_fields",new Generic_Fields());
		return "NewGeneric_Fields";
	}
	
	
	@RequestMapping("/addGeneric_FieldsDetails")
	public String addgeneric_fieldsDetails(@ModelAttribute("generic_fields") Generic_Fields generic_fields, BindingResult result, Model model){
		
		if(result.hasErrors()){
			//return "NewGeneric_Fields";
			return "generic_fields";
		}
		else{
			serviceRef.addGeneric_Fields(generic_fields);
			model.addAttribute("successMsg", "Data Inserted Successfully");
			return "Generic Fields";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/getAllGeneric_Fields")
	public String getGeneric_FieldsList(Model model) {
		List<Generic_Fields> generic_fieldsList = new ArrayList<Generic_Fields>();
		generic_fieldsList= serviceRef.getAllGeneric_Fields();
		model.addAttribute("generic_fieldsList",generic_fieldsList);
		return "generic_fieldsview";
	}
	
	@RequestMapping(value="/generic_fields", method=RequestMethod.GET)
	public String Generic_Fields(Model model, @RequestParam("docId") int docId) {
		Generic_Fields emp  = serviceRef.getGeneric_FieldsById(docId);
		System.out.println("Before view "+emp);
		model.addAttribute("generic_fieldsData",emp);
		return "Generic_FieldsOperation";
	}
	
	@RequestMapping("/updateGeneric_Fields")
	public String updateGeneric_Fields(Model model, @RequestParam("docId") int docId) {
		Generic_Fields emp = serviceRef.getGeneric_FieldsById(docId);
		System.out.println("in update Emp"+emp);
		model.addAttribute("generic_fieldsDetails", emp);
		return "updateGeneric_FieldsPage";
	}
	
	@RequestMapping("/updateGeneric_FieldsDetails")
	public String updateGeneric_FieldsDetail(@ModelAttribute("generic_fields") Generic_Fields generic_fields, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewGeneric_Fields";
		}
		else{
			System.out.println(generic_fields);
			serviceRef.updateGeneric_Fields(generic_fields, generic_fields.getDocId());
			model.addAttribute("successMsg", "Generic Fields Updated Successfully");
			
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	@RequestMapping("/deleteGeneric_Fields")
	public String deleteGeneric_Fields(Model model, @RequestParam("docId") int docId) {
		System.out.println("in delete doc ID"+docId);
		serviceRef.deleteGeneric_Fields(docId);
		model.addAttribute("successMsg", "Generic_Fields Deleted Successfully");
		
		return "Homepage";
	}
}
