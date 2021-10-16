package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Employee;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	@Test
	public void readjustmentShouldThreePercentWhenPerfomanceBeDesired() {
		ReajusteService service = new ReajusteService();
		Employee employee = new Employee("Kaique", LocalDate.now(), new BigDecimal("1000"));
		
		service.grantReadjustment(employee, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), employee.getSalario());
	}
	
	@Test
	public void readjustmentShouldFifteenPercentWhenPerfomanceBeDesired() {
		ReajusteService service = new ReajusteService();
		Employee employee = new Employee("João", LocalDate.now(), new BigDecimal("1000"));
		
		service.grantReadjustment(employee, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), employee.getSalario());
	}
	
	@Test
	public void readjustmentShouldTwentyPercentWhenPerfomanceBeDesired() {
		ReajusteService service = new ReajusteService();
		Employee employee = new Employee("Cristian", LocalDate.now(), new BigDecimal("1000"));
		
		service.grantReadjustment(employee, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), employee.getSalario());
	}
}
