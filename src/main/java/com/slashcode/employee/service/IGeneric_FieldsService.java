package com.slashcode.employee.service;

import java.util.List;

import com.slashcode.employee.model.Employee;
import com.slashcode.employee.model.Generic_Fields;



public interface IGeneric_FieldsService {
	List<Generic_Fields> getAllGeneric_Fields();
	List<Generic_Fields> getGeneric_FieldsByCorrId(String Id);
	void addGeneric_Fields(Generic_Fields generic_field);
	void updateGeneric_Fields(Generic_Fields generic_field, int Id);
	void deleteGeneric_Fields(int Id);
	Generic_Fields getGeneric_FieldsById(int Id);
	
	
}
