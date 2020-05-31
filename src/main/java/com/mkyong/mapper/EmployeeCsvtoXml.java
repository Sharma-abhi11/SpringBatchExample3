package com.mkyong.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mkyong.model.Employee;

public class EmployeeCsvtoXml implements FieldSetMapper<Employee> {

	@Override
	public Employee mapFieldSet(FieldSet fs) throws BindException {
		Employee emp=new Employee();
		emp.setEmpId(fs.readInt(0));
		emp.setEmpName(fs.readString(1));
		emp.setEmpSal(fs.readLong(2));
		emp.setEmpMobile(fs.readString(3));
		
		return emp;
	}

}
