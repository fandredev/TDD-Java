package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Employee;

class BonusServiceTest {

	@Test
	void bonusShouldBeZeroForHighPaidEmployee() {
		BonusService serviceBonusEmployee = new BonusService();
		 assertThrows(IllegalArgumentException.class,
			() -> serviceBonusEmployee.calculateBonusEmployee(new Employee("Felipe", LocalDate.now(), new BigDecimal(25000))
		 ));
//		try {
//			service.calcularBonus(new Employee("Felipe", LocalDate.now(), new BigDecimal(25000)));	
//			fail("Não deu a exception!.");
//		} catch (Exception e) {
//			assertEquals("Funcionário com salário maior do que R$ 10000. Não pode receber bônus.", e.getMessage());
//		}
	}
	
	@Test
	void bonusShouldBeTenPercentSalary() {
		BonusService serviceBonusEmployee = new BonusService();
		BigDecimal calculatedBonusEmployee = serviceBonusEmployee.calculateBonusEmployee(new Employee("Felipe", LocalDate.now(), new BigDecimal(2500)));
		assertEquals(new BigDecimal("250.00"), calculatedBonusEmployee);
	}
	
	@Test
	void bonusShouldTenPercentExact10k() {
		BonusService serviceBonusEmployee = new BonusService();
		BigDecimal calculatedBonusEmployee = serviceBonusEmployee.calculateBonusEmployee(new Employee("Felipe", LocalDate.now(), new BigDecimal(10000)));
		assertEquals(new BigDecimal("1000.00"), calculatedBonusEmployee);
	}

}
