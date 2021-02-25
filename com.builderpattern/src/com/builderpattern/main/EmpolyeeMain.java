package com.builderpattern.main;

import com.builderpattern.Employee;

public class EmpolyeeMain {

	public static void main(String[] args) {
		Employee employee = Employee.builder()
			     .firstName("Kamal")
			     .lastName("verma")
			     .age(24)
			     .personalId(1)
			     .phone("9729572656")
			     .address("Faridabad")
			     .mail("vermakamal")
			     .build();
		System.out.println(employee.getFirstName()+" "+employee
				.getLastName()+" "+employee.getAge()+" "+employee.getPersonalId()+" "+employee.getMail()+" "+employee.getAddress()+" "+employee.getPhone());
    }

	

}
