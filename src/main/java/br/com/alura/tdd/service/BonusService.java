package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Employee;

public class BonusService {

	public BigDecimal calculateBonusEmployee(Employee employee) {
		BigDecimal multipledEmployeeSalary = employee.getEmployeeSalary().multiply(new BigDecimal("0.1"));
		if (multipledEmployeeSalary.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salário maior do que R$ 10000. Não pode receber bônus.");
		}
		return this.roundSalaryTwoDecimalPlaces(multipledEmployeeSalary);
	}
	
	private BigDecimal roundSalaryTwoDecimalPlaces(BigDecimal salary) {
		return salary.setScale(2, RoundingMode.HALF_UP);
	}

}
