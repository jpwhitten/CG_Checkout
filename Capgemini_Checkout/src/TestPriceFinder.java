import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestPriceFinder {

	private final int HASHMAP_SIZE = 2;
	private final BigDecimal APPLE_PRICE = new BigDecimal(0.6);
	private final BigDecimal ORANGE_PRICE = new BigDecimal(0.25);
	
	/***
	 * We have only 2 items.
	 */
	@Test
	public void testGetPricesSizeTwo() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertEquals(priceFinder.getPrices().size(), HASHMAP_SIZE);
	}
	
	/**
	 * We return a big decimal.
	 */
	@Test
	public void testGetPrice() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertThat(priceFinder.getPrice(Item.APPLE), instanceOf(BigDecimal.class));
	}
	
	/***
	 * We have apples.
	 */
	@Test
	public void testApple() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertTrue(priceFinder.getPrices().containsKey(Item.APPLE));
	}
	
	/***
	 * We have oranges.
	 */
	@Test
	public void testOrange() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertTrue(priceFinder.getPrices().containsKey(Item.ORANGE));
	}

	
	/***
	 * We have the apple price.
	 */
	@Test
	public void testGetPriceApple() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertEquals(priceFinder.getPrice(Item.APPLE), APPLE_PRICE);
	}
	
	/***
	 * We have the apple price.
	 */
	@Test
	public void testGetPriceOrange() {
		PriceFinder priceFinder = PriceFinder.getInstance();		
		assertEquals(priceFinder.getPrice(Item.ORANGE), ORANGE_PRICE);
	}

}
