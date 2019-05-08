package pl.com.bottega.ecommerce.sharedkernel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MoneyTest {
		
	@Test
	public void testIsZero() {
		BigDecimal zero = new BigDecimal(0);
		Money tmp = new Money();

		assertThat(tmp.isZero(zero),
				is(true));
	}
	
	
	@Test
	public void testMultiplyBy() {
		Money tmp = new Money(10);

		assertThat(tmp.multiplyBy(5).equals(new Money(50)), is(true));
	}

	@Test
	public void testAdd() {
		Money first = new Money(10);
		Money second = new Money(15);
		
		assertThat(first.add(second).equals(new Money(25)), is (true));
	}
	
	
	@Test
	public void testSubtract() {
		Money first = new Money(40);
		Money second = new Money(5);
		
		assertThat(first.subtract(second).equals(new Money(35)), is (true));
	}
	
	
	
}
