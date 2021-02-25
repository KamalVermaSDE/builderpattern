package com.builderpattern;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Employee {

	private final String firstName; // required
	private final String lastName; // required
	private final int age; // required
	private final int personalId; // required
	private final String phone; // optional
	private final String address; // optional
	private final String mail; // optional

	
//	public static class EmployeeBuilder {
//		private final String firstName; // required
//		private final String lastName; // required
//		private final int age; // required
//		private final int personalId; // required
//		@Setter
//		private String phone; // optional
//		@Setter
//		private String address; // optional
//		@Setter
//		private String mail; // optional
//
//		public EmployeeBuilder(String firstName, String lastName, int age, int personalId) {
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.age = age;
//			this.personalId = personalId;
//
//		}
//
//		public Employee build() {
//			// call the private constructor in the outer class
//			return new Employee(this);
//		}
//
//	}
//
//	private Employee(EmployeeBuilder builder) {
//		this.firstName = builder.firstName;
//		this.lastName = builder.lastName;
//		this.age = builder.age;
//		this.personalId = builder.personalId;
//		this.phone = builder.phone;
//		this.address = builder.address;
//		this.mail = builder.mail;
//	}

}
