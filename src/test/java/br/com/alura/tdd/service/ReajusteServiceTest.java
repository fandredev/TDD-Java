package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Perfomance;
import br.com.alura.tdd.modelo.Employee;

public class ReajusteServiceTest {
	private ReajusteService service;
	private Employee employee;
	
	@BeforeEach
	public void initializeAttributes() {
		service = new ReajusteService();
		employee = new Employee("Kaique", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@AfterEach
	public void finishSpecsTest() {
		System.out.println("Finish Test!");
	}
	
	@Test
	public void readjustmentShouldThreePercentWhenPerfomanceBeDesired() {
		service.grantReadjustment(employee, Perfomance.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), employee.getEmployeeSalary());
	}
	
	@Test
	public void readjustmentShouldFifteenPercentWhenPerfomanceBeDesired() {
		service.grantReadjustment(employee, Perfomance.BOM);
		assertEquals(new BigDecimal("1150.00"), employee.getEmployeeSalary());
	}
	
	@Test
	public void readjustmentShouldTwentyPercentWhenPerfomanceBeDesired() {
		service.grantReadjustment(employee, Perfomance.OTIMO);
		assertEquals(new BigDecimal("1200.00"), employee.getEmployeeSalary());
	}
}
