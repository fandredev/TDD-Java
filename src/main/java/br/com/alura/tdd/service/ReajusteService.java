package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Perfomance;
import br.com.alura.tdd.modelo.Employee;

public class ReajusteService {

	public void grantReadjustment(Employee employee, Perfomance perfomance) {
		BigDecimal percent = perfomance.percentReadjustment();
		BigDecimal readjustment = employee.getEmployeeSalary().multiply(percent);
		employee.readjustmentSalaryEmployee(readjustment);
	}

}
