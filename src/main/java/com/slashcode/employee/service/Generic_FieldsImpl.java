package com.slashcode.employee.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashcode.employee.dao.IGeneric_FieldsDAO;
import com.slashcode.employee.model.Generic_Fields;



@Service
public class Generic_FieldsImpl implements IGeneric_FieldsService {
	/*
	 * List<Generic_Fields> empList =new ArrayList<>(Arrays.asList( new
	 * Employee(1,"Rohan","Payments"), new Employee(2,"Rohit","DSOS"), new
	 * Employee(3,"Ritha","PCF")));
	 */
	@Autowired
	private IGeneric_FieldsDAO daoRef;
	
	
	

	@Override
	public Generic_Fields getGeneric_FieldsById(int Id) {
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(Id);
	}

	@Override
	public void addGeneric_Fields(Generic_Fields generic_fields) {
		// TODO Auto-generated method stub
		//empList.add(employee);
		daoRef.save(generic_fields);
	}

	@Override
	public void updateGeneric_Fields(Generic_Fields generic_fields, int Id) {
		/*for(int i=0; i<empList.size(); i++) {
			Employee e = empList.get(i);
			if(e.getEmpId()==empId) {
				empList.set(i, employee);
				return;
			}
		}*/
		daoRef.save(generic_fields);
	}

	@Override
	public void deleteGeneric_Fields(int Id) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpId() == empId);
		daoRef.deleteById(Id);
	}

	

	@Override
	public List<Generic_Fields> getAllGeneric_Fields() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

	@Override
	public List<Generic_Fields> getGeneric_FieldsByCorrId(String Id) {
		// TODO Auto-generated method stub
		return null;
	}


	


}
