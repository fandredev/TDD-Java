package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {

	private String employeeName;
	private LocalDate employeeDateEmission;
	private BigDecimal employeeSalary;

	public Employee(String employeeName, LocalDate employeeDateEmission, BigDecimal employeeSalary) {
		this.employeeName = employeeName;
		this.employeeDateEmission = employeeDateEmission;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeNome() {
		return employeeName;
	}

	public LocalDate getEmployeeDateEmission() {
		return employeeDateEmission;
	}

	public BigDecimal getEmployeeSalary() {
		return employeeSalary;
	}

	public void readjustmentSalaryEmployee(BigDecimal readjustment) {
		this.employeeSalary = this.getEmployeeSalary().add(readjustment);
		this.roundedSalary();
	}
	
	private void roundedSalary() {
		this.employeeSalary = this.employeeSalary.setScale(2, RoundingMode.HALF_UP);
	}

}
