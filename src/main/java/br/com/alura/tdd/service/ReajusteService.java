package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Employee;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void grantReadjustment(Employee employee, Desempenho desempenho) {
		BigDecimal percent = desempenho.percentReadjustment();
		BigDecimal readjustment = employee.getSalario().multiply(percent);
		employee.reajustarSalario(readjustment);
	}

}
