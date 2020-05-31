package com.mkyong.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Employee;


public class FilterEmployeeProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(employee.getEmpSal());
		if(employee.getEmpSal()>=50000) {
			//System.out.println("returning");
			return employee;}
		
		return null;
	}

}
